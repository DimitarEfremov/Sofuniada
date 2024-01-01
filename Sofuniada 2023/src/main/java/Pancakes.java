import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pancakes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int finalSum = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int indexA = 0; indexA < input.size(); indexA++) {
            int sum = 0;
            int indexB = 0;

            for (int j = indexA; j <input.size() ; j++) {
                List<Integer> partialList = input.subList(indexA, j + 1);
                sum = partialList.stream().mapToInt(Integer::intValue).sum();
                indexB = indexA + partialList.size() - 1;

                if (sum > finalSum){
                    finalSum = sum;
                    startIndex = indexA;
                    endIndex = indexB;
                } else if (sum == finalSum && (indexB - indexA) > (endIndex - startIndex)){
                    startIndex = indexA;
                    endIndex = indexB;
                }
            }
        }
        System.out.printf("%d %d %d", finalSum, startIndex, endIndex);

    }
}
