import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterPrize {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end ; i++) {

            addPrimesToList(primes, i);

        }
        System.out.println(
                primes.stream().map(String::valueOf).collect(Collectors.joining(" "))
        );
        System.out.printf("The total number of prime numbers between %d to %d is %d",start,end,primes.size());

    }

    private static void addPrimesToList(List<Integer> primes, int i) {
        boolean isPrime = true;

        if (i < 2){
            return;
        }

        for (int j = 2; j < i; j++) {

            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            primes.add(i);
        }
    }
}
