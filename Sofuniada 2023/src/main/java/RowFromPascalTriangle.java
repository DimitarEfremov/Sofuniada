import java.util.*;
import java.util.stream.Collectors;

public class RowFromPascalTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();
        firstRow.add(1);
        Collections.addAll(secondRow, 1, 1);

        Collections.addAll(matrix, firstRow, secondRow);

        if (n > 2) {

            for (int i = 3; i <= n + 1; i++) {

                List<Integer> newRow = new ArrayList<>();
                List<Integer> previousRow = matrix.get(i - 2);
                newRow.add(1);

                for (int j = 0; j <= previousRow.size() - 2; j++) {

                    int newNumber = previousRow.get(j) + previousRow.get(j + 1);
                    newRow.add(newNumber);
                }
                newRow.add(1);
                matrix.add(newRow);
            }
        }

        List<Integer> rowToBePrinted = matrix.get(n);

        String toPrint = rowToBePrinted.stream().map(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(toPrint);

    }
}
