package basicprogramming.easy.inputoutput.maximumborders;

import java.util.*;

public class MaximumBorders {

    public String solution(String input) {

        Scanner scan = new Scanner(input);
        int cases = Integer.parseInt(scan.nextLine());
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 0; i < cases; i++) {
            String[] rowsAndLength = scan.nextLine().split(" ");
            int rows = Integer.parseInt(rowsAndLength[0]);
            List<List<Integer>> shapes = new ArrayList<>();
            int maxBorder = 0;
            // read first & last indexes to array
            for (int j = 0; j < rows; j++) {

                String line = scan.nextLine();
                int actualMax = 0;
                int startIndex = line.indexOf("#");
                int endIndex = line.lastIndexOf("#");
                if (startIndex == -1) {
                    if (j == 0 || shapes.size() == 0) {
                        continue;
                    }
                    if ((actualMax = computeMAxBorderLength(shapes)) > maxBorder) {
                        maxBorder = actualMax;
                    }
                    shapes.clear();
                    continue;
                }
                if (shapes.size() != 0
                        && (startIndex > shapes.get(shapes.size() - 1).get(1)
                        || endIndex < shapes.get(shapes.size() - 1).get(0))) {
                    if ((actualMax = computeMAxBorderLength(shapes)) > maxBorder) {
                        maxBorder = actualMax;
                    }
                    shapes.clear();
                }
                shapes.add(List.of(startIndex, endIndex));
                if (rows - 1 == j) {
                    if ((actualMax = computeMAxBorderLength(shapes)) > maxBorder) {
                        maxBorder = actualMax;
                    }
                }

            }
            sb.append(separator)
                    .append(maxBorder);
            separator = "\n";
        }
        return  sb.toString();
    }


    private int computeMAxBorderLength(List<List<Integer>> shapes) {
        // first shape
        int maxLength = Math.abs(shapes.get(0).get(0) - shapes.get(0).get(1)) + 1;
        // horizontal shapes
        for (int i = 1; i < shapes.size() - 1; i++) {
            for (int j = 0; j < 2; j++) {
                int shape = Math.abs(shapes.get(i).get(j) - shapes.get(i + 1).get(j));
                if (shape > maxLength) {
                    maxLength = shape;
                }
            }
        }
        // bottom shape
        int bottomBorder = Math.abs(shapes.get(shapes.size() - 1).get(0) - shapes.get(shapes.size() - 1).get(1)) + 1;

        if (bottomBorder > maxLength) {
            maxLength = bottomBorder;
        }
        int leftShapeCounter = 1;
        int rightShapeCounter = 1;
        int verticalMaxLength = 1;
        for (int i = 0; i < shapes.size() - 1; i++) {
            if (shapes.get(i).get(0) == shapes.get(i + 1).get(0)) {
                leftShapeCounter++;
            } else {
                leftShapeCounter = 1;
            }
            if (shapes.get(i).get(1) == shapes.get(i + 1).get(1)) {
                rightShapeCounter++;
            } else {
                rightShapeCounter = 1;
            }
            if (leftShapeCounter > verticalMaxLength) {
                verticalMaxLength = leftShapeCounter;
            }
            if (rightShapeCounter > verticalMaxLength) {
                verticalMaxLength = rightShapeCounter;
            }
        }

        return Math.max(maxLength, verticalMaxLength);
    }
}
