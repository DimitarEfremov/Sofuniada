import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpiralMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixHeight = Integer.parseInt(scanner.nextLine());
        int matrixLength = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixHeight][matrixLength];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < matrixHeight; i++) {

            int[] row = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }

        int firstRow = 0;
        int lastColumn = matrixLength -1;
        int lastRow = matrixHeight - 1;
        int firstColumn = 0;

        String startPoint = "firstRow";
        int totalNumbers = matrixHeight*matrixLength;
        int length = 0;
        int start = 0;

            while (totalNumbers > answer.size()){

                switch (startPoint) {
                    case "firstRow" -> {
                        length = lastColumn - firstColumn;
                        start = firstRow;
                        for (int i = 0; i <= length; i++) {
                            answer.add(matrix[firstRow][start]);
                            start++;
                        }
                        firstRow += 1;
                        startPoint = "lastColumn";
                    }
                    case "lastColumn" -> {
                        length = lastRow - firstRow;
                        start = firstRow;
                        for (int i = 0; i <= length; i++) {
                            answer.add(matrix[start][lastColumn]);
                            start++;
                        }
                        lastColumn -= 1;
                        startPoint = "lastRow";
                    }
                    case "lastRow" -> {
                        length = lastColumn - firstColumn;
                        start = lastColumn;
                        for (int i = 0; i <= length; i++) {
                            answer.add(matrix[lastRow][start]);
                            start--;
                        }
                        lastRow -= 1;
                        startPoint = "firstColumn";
                    }
                    case "firstColumn" -> {
                        length = lastRow - firstRow;
                        start = lastRow;
                        for (int i = 0; i <= length; i++) {
                            answer.add(matrix[start][firstColumn]);
                            start--;
                        }
                        firstColumn += 1;
                        startPoint = "firstRow";
                    }
                }
            }

            String result = answer.stream().map(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(result);

    }
}
