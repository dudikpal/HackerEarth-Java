package basicprogramming.inputoutput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheStringProblemTest {

    @Test
    void test() {
        String input = """
                3
                omahgoTuRuLob
                OmAhgotUrulobEI
                aeKORONAoiBATCHu""";

        String expected = """
                ugly string
                lovely string
                lovely string""";

        assertEquals(expected, new TheStringProblem().solution(input));
    }

}