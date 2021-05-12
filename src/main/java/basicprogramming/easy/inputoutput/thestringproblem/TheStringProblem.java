package basicprogramming.easy.inputoutput.thestringproblem;

public class TheStringProblem {

    public String solution(String input) {

        String[] inputs = input.split("\n");
        int rows = Integer.parseInt(inputs[0]);
        String[] lowerVowels = "aeiou".split("");
        String[] upperVowels = "AEIOU".split("");
        boolean lowerTrue = true;
        boolean upperTrue = true;
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 0; j < lowerVowels.length; j++) {
                if (!inputs[i].contains(lowerVowels[j])) {
                    lowerTrue = false;
                }
                if (!inputs[i].contains(upperVowels[j])) {
                    upperTrue = false;
                }
            }
            if (!lowerTrue && !upperTrue) {
                sb.append(separator)
                        .append("ugly string");
            } else {
                sb.append(separator)
                        .append("lovely string");
            }
            separator = "\n";
            lowerTrue = true;
            upperTrue = true;
        }
        return  sb.toString();
    }
}
