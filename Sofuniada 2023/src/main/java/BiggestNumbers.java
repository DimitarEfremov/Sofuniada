import java.util.*;

public class BiggestNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int numbsToGet = Integer.parseInt(scanner.nextLine());

        List<Integer> bigNums = new ArrayList<>();

        for (int i = 0; i <numbsToGet ; i++) {
            bigNums.add(numbersList[i]);
        }

        for (int i = 0; i < numbersList.length - numbsToGet; i++) {

            int numberToCheck = numbersList[i + numbsToGet];
            Collections.sort(bigNums);

            for (int j = 0; j < bigNums.size(); j++) {
                if (numberToCheck > bigNums.get(bigNums.size() - j - 1)) {
                    bigNums.set(0, numberToCheck);
                    break;
                }

            }

        }

        Collections.sort(bigNums);

        for (Integer bigNum : bigNums) {
            System.out.println(bigNum);
        }


    }
}
