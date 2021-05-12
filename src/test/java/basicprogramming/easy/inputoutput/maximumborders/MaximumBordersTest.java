package basicprogramming.easy.inputoutput.maximumborders;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MaximumBordersTest {

    @Test
    void testResult2() {
        String input = """
                1
                7 5
                .....
                ..##.
                ###..
                ..##.
                .....
                ..#..
                .#...""";
        String expected = "2";
        assertEquals(expected, new MaximumBorders().solution(input));
    }

    @Test
    void testWithEmptyLines() {
        String input = """
                1
                14 2
                ..
                #.
                ..
                #.
                ..
                #.
                ..
                ..
                #.
                ..
                ..
                ..
                #.
                ..""";
        String expected = "1";
        assertEquals(expected, new MaximumBorders().solution(input));
    }

    @Test
    void test() {
        String input = """
                10
                2 15
                .....####......
                .....#.........
                7 9
                ...###...
                ...###...
                ..#......
                .####....
                ..#......
                ...#####.
                .........
                18 11
                .#########.
                ########...
                .........#.
                ####.......
                .....#####.
                .....##....
                ....#####..
                .....####..
                ..###......
                ......#....
                ....#####..
                ...####....
                ##.........
                #####......
                ....#####..
                ....##.....
                .#######...
                .#.........
                1 15
                .....######....
                5 11
                ..#####....
                .#######...
                ......#....
                ....#####..
                ...#####...
                8 13
                .....######..
                ......##.....
                ########.....
                ...#.........
                .............
                #######......
                ..######.....
                ####.........
                7 5
                .....
                ..##.
                ###..
                ..##.
                .....
                ..#..
                .#...
                14 2
                ..
                #.
                ..
                #.
                ..
                #.
                ..
                ..
                #.
                ..
                ..
                ..
                #.
                ..
                7 15
                .###########...
                ##############.
                ...####........
                ...##########..
                .......#.......
                .....#########.
                .#######.......
                12 6
                #####.
                ###...
                #.....
                ##....
                ###...
                ......
                .##...
                ..##..
                ...#..
                ..#...
                #####.
                ####..""";

        String expected = """
                4
                5
                9
                6
                5
                7
                2
                1
                11
                5""";

        assertEquals(expected, new MaximumBorders().solution(input));
    }

    @Test
    void testFromFile() {
        String input = "";
        try {
            input = Files.readString(Path.of("src/main/resources/basicprogramming/inputoutput/maximumborders/input.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String expected = """
                508
                448
                718
                326
                489
                741
                407
                22
                183
                330""";

        assertEquals(expected, new MaximumBorders().solution(input));
    }

    @Test
    void testFromFile2() {
        String input = "";
        try {
            input = Files.readString(Path.of("src/main/resources/basicprogramming/inputoutput/maximumborders/input2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String expected = """
                326""";

        assertEquals(expected, new MaximumBorders().solution(input));
    }

    @Test
    void testFromFile3() {
        String input = "";
        try {
            input = Files.readString(Path.of("src/main/resources/basicprogramming/inputoutput/maximumborders/input3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String expected = """
                326""";

        assertEquals(expected, new MaximumBorders().solution(input));
    }

}