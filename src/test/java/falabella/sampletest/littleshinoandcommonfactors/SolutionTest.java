package falabella.sampletest.littleshinoandcommonfactors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        String input = "10 15";
        int expected = 2;
        assertEquals(expected, new Solution().solution(input));
    }

    @Test
    void test1() {
        String input = "21 42";
        int expected = 4;
        assertEquals(expected, new Solution().solution(input));
    }

}