import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RotateTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixDimension = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixDimension][matrixDimension];

        for (int i = 0; i < matrixDimension; i++) {

            int[] row = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }

        int[][] rotatedMatrix = new int[matrixDimension][matrixDimension];

        int b = matrixDimension-1;

        for (int i = 0; i < matrixDimension; i++) {

            for (int j = 0; j < matrixDimension; j++) {

                rotatedMatrix[j][i] =  matrix[b][j];
            }
            b--;
        }

        for (int[] ints : rotatedMatrix) {
            String result = Arrays.stream(ints).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(result);
        }
    }
}
