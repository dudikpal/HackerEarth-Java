package codemonk.arraysandstrings.monkandinversions;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MonkAndInversionsTest {

    @Test
    void test() {
        String input = """
                2
                3
                5 3 2
                1 8 6
                7 4 9
                2
                4 3
                1 4""";
        String expected = """
                8
                2""";

        assertEquals(expected, new MonkAndInversions().solution(input));
    }

    @Test
    void test2() {
        String input = """
                3
                3
                10 661 218
                358 565 278
                619 620 494
                3
                390 817 990
                297 675 605
                451 782 462
                3
                953 301 627
                999 743 359
                470 926 438""";
        String expected = """
                10
                11
                18""";
        assertEquals(expected, new MonkAndInversions().solution(input));
    }

    @Test
    void testFromFile1() {
        String input = "";
        try {
            input = Files.readString(Path.of("src/main/resources/codemonk/arraysandstrings/monkandinversions/input1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String expected = """
                0
                1425
                99
                1102
                1550
                341
                697
                362
                1458
                216""";

        assertEquals(expected, new MonkAndInversions().solution(input));
    }

}