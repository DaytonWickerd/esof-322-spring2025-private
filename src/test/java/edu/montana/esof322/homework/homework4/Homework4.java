package edu.montana.esof322.homework.homework4;

import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework4 {

    // TODO - debug this and figure out why it is throwing
    //        an exception
    //
    // when you have fixed it step through the entire test line
    // by line and ensure it still passes
    @Test
    void theAssignment() {
        ICar car = newCar();
        car.start(); // car is facing "up"
        car.putInDrive();
        car.forward(20);
        car.stop(); // stop so we can turn
        car.turnRight();
        car.forward(20);
        assertEquals(car.getX(), 20);
        assertEquals(car.getY(), 20);
    }


    private static ICar newCar() {
        var tmpClass = new ClassLoader(Homework4.class.getClassLoader()) {
            public Class defineClass() {

                byte[] bytes = Base64.getDecoder().decode("yv66vgAAAD0ALgoAAgADBwAEDAAFAAYBABBqYXZhL2xhbmcvT2JqZWN0AQAGPGlu" +
                        "aXQ+AQADKClWCQAIAAkHAAoMAAsADAEAKmVkdS9tb250YW5hL2Vzb2YzMjIvaG9t" +
                        "ZXdvcmsvaG9tZXdvcms0L0NhcgEAAW8BAAFJCQAIAA4MAA8AEAEAAXMBAAFaBwAS" +
                        "AQAfamF2YS9sYW5nL0lsbGVnYWxTdGF0ZUV4Y2VwdGlvbgoAEQADCQAIABUMABYA" +
                        "DAEAAXkJAAgAGAwAGQAMAQABeAoACAAbDAAcAAYBAAVzdGFydAoAAgAeDAAfACAB" +
                        "AAh0b1N0cmluZwEAFCgpTGphdmEvbGFuZy9TdHJpbmc7BwAiAQArZWR1L21vbnRh" +
                        "bmEvZXNvZjMyMi9ob21ld29yay9ob21ld29yazQvSUNhcgEABENvZGUBAApwdXRJ" +
                        "bkRyaXZlAQANU3RhY2tNYXBUYWJsZQEAB2ZvcndhcmQBAAQoSSlWAQAEc3RvcAEA" +
                        "CXR1cm5SaWdodAEACHR1cm5MZWZ0AQAEZ2V0WAEAAygpSQEABGdldFkAIQAIAAIA" +
                        "AQAhAAQAAgAZAAwAAAACABYADAAAAAIACwAMAAAAAAAPABAAAAAKAAEABQAGAAEA" +
                        "IwAAABsAAgABAAAADyq3AAEqA7UAByoDtQANsQAAAAAAAQAcAAYAAQAjAAAAEgAC" +
                        "AAEAAAAGKgS1AA2xAAAAAAABACQABgABACMAAAAlAAIAAQAAABAqtAANmgALuwAR" +
                        "WbcAE7+xAAAAAQAlAAAAAwABDwABACYAJwABACMAAABwAAMAAgAAAFcqtAANmgAL" +
                        "uwARWbcAE78qtAAHmgANKiq0ABQbYLUAFCq0AAcEoAANKiq0ABcbYLUAFyq0AAcF" +
                        "oAANKiq0ABQbZLUAFCq0AAcGoAANKiq0ABcbZLUAF7EAAAABACUAAAAHAAUPEBER" +
                        "EQABACgABgABACMAAAASAAIAAQAAAAYqA7UADbEAAAAAAAEAKQAGAAEAIwAAABkA" +
                        "AwABAAAADSoqtAAHBGAHcLUAB7EAAAAAAAEAKgAGAAEAIwAAABkAAwABAAAADSoq" +
                        "tAAHBGQHcLUAB7EAAAAAAAEAKwAsAAEAIwAAACkAAgABAAAAFCq0AA2ZAAu7ABFZ" +
                        "twATvyq0ABesAAAAAQAlAAAAAwABDwABAC0ALAABACMAAAApAAIAAQAAABQqtAAN" +
                        "mQALuwARWbcAE78qtAAUrAAAAAEAJQAAAAMAAQ8AAQAfACAAAQAjAAAAFQABAAEA" +
                        "AAAJKrYAGiq3AB2wAAAAAAAA");
                return defineClass("edu.montana.esof322.homework.homework4.Car", bytes, 0, bytes.length);
            }
        }.defineClass();
        try {
            return (ICar) tmpClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
