package basicprogramming.easy.implementation.jadoohatesmaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadooHatesMathTest {

    @Test
    void test() {
        int input = 22;
        int expected = 25;
        assertEquals(expected, new JadooHatesMath().solution(input));
    }

    @Test
    void test2() {
        int input = 251;
        int expected = 254;
        assertEquals(expected, new JadooHatesMath().solution(input));
    }

}