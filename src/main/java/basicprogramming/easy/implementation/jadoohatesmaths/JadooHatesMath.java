package basicprogramming.easy.implementation.jadoohatesmaths;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class JadooHatesMath {

    public int solution(int input) {

        int result = 0;
        int addition = 1;
        while (result == 0) {
            int actual = input + addition;
            boolean hasThree = String.valueOf(actual).contains("3");
            if (actual % 3 != 0 && !hasThree) {
                result = actual;
            }
            addition++;
        }
        return result;
    }

}
