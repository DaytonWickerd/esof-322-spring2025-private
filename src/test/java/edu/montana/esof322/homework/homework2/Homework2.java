package edu.montana.esof322.homework.homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Homework2 {

    int invocationCount = 0;
    StringBuilder output = new StringBuilder();

    interface IDoAThing{
        void doIt();
    }

    class ThingDoer implements IDoAThing {
        @Override
        public void  doIt() {
            output.append("Did it!\n");
        }
    }

    class ThingDoerProxy implements IDoAThing {
        private final IDoAThing realThingDoer;
        private final Homework2 homework;

        ThingDoerProxy(IDoAThing realThingDoer, Homework2 homework) {
            this.realThingDoer = realThingDoer;
            this.homework = homework;
        }
        @Override
        public void doIt() {
            homework.invocationCount++;
            realThingDoer.doIt();
        }

    }

    class ThingDoerFactory {
        private final Homework2 homework;

        ThingDoerFactory(Homework2 homework) {
            this.homework = homework;
        }

        IDoAThing create() {
            return new ThingDoerProxy(new ThingDoer(), homework);
        }
    }

    //=======================================================================
    // Your boss wants to know how many times a method on a given class is
    // being invoked.  Your job is to take the the code above and refactor it
    // using some patterns to capture the needed information.
    //=======================================================================
    @Test
    void theAssignment() {

            ThingDoerFactory factory = new ThingDoerFactory(this);
            IDoAThing thingDoer = factory.create();

            assertFalse(thingDoer instanceof ThingDoer);

            thingDoer.doIt();
            thingDoer.doIt();
            thingDoer.doIt();

            assertEquals(3, invocationCount);
            assertEquals("Did it!\nDid it!\nDid it!\n", output.toString());
        }
    }
