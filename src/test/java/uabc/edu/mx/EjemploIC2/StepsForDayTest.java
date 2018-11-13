package uabc.edu.mx.EjemploIC2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uabc.edu.mx.EjemploIC2.StepsForDay;

class StepsForDayTest {

    private StepsForDay sfd;

    @BeforeEach
    void setUp() {
        sfd = new StepsForDay(5000);
    }

    @Test
    void inputSteps() {
        sfd.inputSteps(2000);
        int steps = sfd.get();
        assertEquals(steps,2000);
        
        assertEquals(1,1);

    }

    @Test
    void addSteps() {
        sfd.inputSteps(2000);
        sfd.addSteps(1000);
        int steps = sfd.get();
        assertEquals(steps,1000+2000);
        assertEquals(1,1);
    }

    @Test
    void clearSteps() {
        sfd.clearSteps();
        int steps = sfd.get();
        assertEquals(steps, 0);
    }

    /*
     * Here we're testing for get of 0 as well as proper init. of the new object.
     */
    @Test
    void get() {
        int steps = sfd.get();
        assertEquals(steps, 0);

        sfd.inputSteps(2000);
        steps = sfd.get();

        assertEquals(steps, 2000);
    }

    /*
     * Equivalence classes come into greater play here because there is actual logic in the method.
     *
     * Output: Test for both false and true results.
     * Input: Test for 0, any other value, the exact value, and value + 1 (for > vs. >=)
     */
    @Test
    void metGoal() {
        boolean result = sfd.metGoal();
        assertFalse(result);

        sfd.inputSteps(2000);
        result = sfd.metGoal();
        assertFalse(result);

        sfd.inputSteps(5000);
        result = sfd.metGoal();
        assertTrue(result);

        sfd.inputSteps(5000+1);
        result = sfd.metGoal();
        assertTrue(result);
    }
}
