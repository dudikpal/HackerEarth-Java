package basicprogramming.easy.implementation.jadooandstrings;

import java.util.Scanner;

public class JadooAndStrings {

    public String solution(String input) {

        Scanner s = new Scanner(input);
//        StringBuilder sb = new StringBuilder(input);
        return new StringBuilder(input).reverse().toString();
    }
}
