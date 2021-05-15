package falabella.sampletest.fredoandarrayupdate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        String input = """
                5
                1 2 3 4 5""";
        int expected = 4;

        assertEquals(expected, new Solution().solution(input));
    }

}