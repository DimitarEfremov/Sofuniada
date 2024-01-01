import java.util.*;

public class BiggestFormedNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] numbsToStr = new String[numbersList.length];

        for (int i = 0; i < numbersList.length; i++) {
            numbsToStr[i] = String.valueOf(numbersList[i]);
        }

        Comparator<String> comparator = (a,b) -> (b+a).compareTo(a+b);

        Arrays.sort(numbsToStr,comparator);

        String result = String.join("", numbsToStr);

        System.out.println(result);

    }
}
