package edu.montana.esof322.model;

import edu.montana.esof322.DBTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest extends DBTest {

    @Test
    void testAllLoadsAllUsers() {
        List<User> all = User.all();
        assertEquals(8, all.size());
    }

}
