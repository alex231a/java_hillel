package app;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args) {
        balance = getBalance();  // 1. Отримати поточний баланс
        double purchaseAmount = getAmount();  // 2. Отримати суму покупки
        validateAmount(balance, purchaseAmount);  // 3. Перевірити наявність коштів
    }

    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%nEnter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Метод валідації наявних коштів
    private static void validateAmount(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage() + " (3)");
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid.%nBalance is USD %.2f%n", balance);
        }
    }

    // Метод розрахунку наявних коштів на рахунку після покупки
    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
