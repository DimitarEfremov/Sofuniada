import java.util.Scanner;

public class DreamCar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double startIncome = Double.parseDouble(scanner.nextLine());
        double monthlyExpenses = Double.parseDouble(scanner.nextLine());
        double incomeIncrease = Double.parseDouble(scanner.nextLine());
        double carPrice = Double.parseDouble(scanner.nextLine());
        int monthsForSaving = Integer.parseInt(scanner.nextLine());

        double updatedSalary = startIncome;
        double savedMoney = 0;

        for (int i = 0; i < monthsForSaving; i++) {
            savedMoney = savedMoney + updatedSalary - monthlyExpenses;
            updatedSalary += incomeIncrease;
        }

        boolean success = savedMoney >= carPrice;

        if (success){
            System.out.println("Have a nice ride!");
        } else{
            System.out.println("Work harder!");
        }




    }
}
