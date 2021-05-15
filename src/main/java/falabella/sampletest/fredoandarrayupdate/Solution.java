package falabella.sampletest.fredoandarrayupdate;

import java.util.Scanner;

public class Solution {

    public int solution(String input) {
        Scanner s = new Scanner(input);
        int originalSum = 0;
        int arrLength = Integer.parseInt(s.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrLength; i++) {
            int number = s.nextInt();
            originalSum += number;
            if (number < min) {
                min = number;
            }
        }
        for (int i = min; i < 10_000_000; i++) {
            if (i * arrLength > originalSum) {
                return i;
            }
        }
        return 0;
    }
}
