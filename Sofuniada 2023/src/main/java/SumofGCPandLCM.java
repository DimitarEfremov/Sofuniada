import java.util.Scanner;

public class SumofGCPandLCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int GCP = calculateGCP(firstNum, secondNum);
        int LCM = calculateLcm(firstNum, secondNum);

        System.out.println(GCP + LCM);

    }

    private static int calculateLcm(int firstNum, int secondNum) {
        int LCM = Math.max(firstNum, secondNum);

        while (LCM % firstNum != 0 || LCM % secondNum != 0) {
            ++LCM;
        }
        return LCM;
    }

    private static int calculateGCP(int firstNum, int secondNum) {
        int GCP = 0;

        int bigNum = Math.max(firstNum, secondNum);
        int lesserNum = Math.min(firstNum, secondNum);

        while (GCP == 0){

            int remain = bigNum % lesserNum;

            if (remain == 0){
                GCP = lesserNum;
            } else {
                bigNum = lesserNum;
                lesserNum = remain;
            }
        }
        return GCP;
    }
}
