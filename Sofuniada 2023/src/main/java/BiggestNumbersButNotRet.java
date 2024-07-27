import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BiggestNumbersButNotRet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int numbsToGet = Integer.parseInt(scanner.nextLine());

        List<Integer> bigNums = Arrays.stream(input.split(" ")).map(Integer::parseInt).sorted().toList();


        for (int i = bigNums.size() - numbsToGet; i < bigNums.size() ; i++) {
            System.out.println(bigNums.get(i));
        }

    }
}
