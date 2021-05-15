package falabella.sampletest.littleshinoandcommonfactors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public int solution(String input) {

        Scanner s = new Scanner(input);
        long number1 = s.nextInt();
        long number2 = s.nextInt();
        if (number1 < 1 || number2 < 1) {
            System.out.println(0);
        }

        /*List<Integer> divisors = new ArrayList<>();*/
        /*long repeat = LKO(number1, number2);
        for (int i = 1; i <= repeat; i++) {
            int divisor = 0;
            if (number1 >= i && number1 % i == 0) {
                divisor++;
            }
            if (number2 >= i && number2 % i == 0) {
                divisor++;
            }
            if (divisor == 2) {
                divisors.add(i);
            }
        }*/
        int counter = 1;
        long gcd = LKO(number1, number2);
        for (int i = 2; i <= Math.min(number1, number2); ++i) {
            if (number1 % i == 0 && number2 % i == 0) {
                counter++;
            }
        }

        //System.out.println(divisors.size());
        /*return divisors.size();*/
        return counter;
    }

    private long LKO(long number1, long number2) {
        long gcd = 1;
        long min = Math.min(number1, number2);
        for (long i = min; i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
        /*
        if (number2 == 0) {
            return number1;
        }
        return LKO(number2, number1 % number2);*/
    }
}
