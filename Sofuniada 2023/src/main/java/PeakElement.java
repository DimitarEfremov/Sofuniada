import java.util.Arrays;
import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int leftNumb;
        int midNumb;
        int rightNumb;

        int peak = 0;

        for (int i = 0; i < numbersList.length; i++) {

            if (i == 0 || i == numbersList.length - 1){
                continue;
            }

            leftNumb = numbersList[i-1];
            midNumb = numbersList[i];
            rightNumb = numbersList[i+1];

            if (midNumb > leftNumb && midNumb > rightNumb && midNumb > peak){
                peak = midNumb;
            }
        }

        System.out.println(peak);

    }
}
