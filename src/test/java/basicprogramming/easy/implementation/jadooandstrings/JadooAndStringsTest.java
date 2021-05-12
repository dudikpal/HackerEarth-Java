package basicprogramming.easy.implementation.jadooandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadooAndStringsTest {

    @Test
    void test() {
        String input = "Jadoo";
        String expected = "oodaJ";
        assertEquals(expected, new JadooAndStrings().solution(input));
    }

}