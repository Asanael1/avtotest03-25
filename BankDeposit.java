import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();

        float interestRate = 0.07f;

        for (int i = 0; i < months; i++) {
            deposit += deposit * interestRate;
        }


        System.out.printf("Конечная сумма вклада: %.2f\n", deposit);

        scanner.close();
    }
}