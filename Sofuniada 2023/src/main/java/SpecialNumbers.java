import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallNumb = Integer.parseInt(scanner.nextLine());
        int bigNumb = Integer.parseInt(scanner.nextLine());

        List<Integer> answer = checkIfSpecial(smallNumb, bigNumb);

        for (Integer integer : answer) {
            System.out.println(integer);
        }
    }

    private static List<Integer> checkIfSpecial(int smallNumb, int bigNumb) {

        List<Integer> answer = new ArrayList<>();

        for (int i = smallNumb; i <=bigNumb ; i++) {

            int length = String.valueOf(i).length();

            boolean isSpecial = isItSpecial(i, length);

            if (isSpecial){
                answer.add(i);
            }

        }

        return answer;
    }

    private static boolean isItSpecial(int i, int length) {
        boolean isSpecial = true;

        for (int j = 0; j < length -1; j++) {

            int firstDigit = Integer.parseInt(Integer.toString(i).substring(j, j+1));
            int secondDigit = Integer.parseInt(Integer.toString(i).substring(j+1, j+2));

            if (firstDigit-secondDigit != 1 && firstDigit-secondDigit != -1){
                isSpecial=false;
                break;
            }
        }
        return isSpecial;
    }

}
