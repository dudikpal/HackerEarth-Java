package basicprogramming.inputoutput.thestringproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals(expected, new TheStringProblem().solution(input));
    }

}