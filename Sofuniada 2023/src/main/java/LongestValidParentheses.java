import java.util.Scanner;

public class LongestValidParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        int longestValidParenthesesSize = 0;
        int currentIntToWorkWith = 0;

        for (int i = 0; i < input.length(); i++) {

            char toCheck = input.charAt(i);

            if (toCheck == '(' && i < input.length()-1 ) {
                i++;

                char nextToCheck = input.charAt(i);

                if (nextToCheck ==')'){
                    currentIntToWorkWith +=2;
                    if (currentIntToWorkWith > longestValidParenthesesSize){
                        longestValidParenthesesSize = currentIntToWorkWith;
                    }
                } else {
                    i--;
                    currentIntToWorkWith = 0;
                }
            }
        }
        System.out.println(longestValidParenthesesSize);
    }
}
