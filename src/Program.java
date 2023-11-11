import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int balance = 100;
        int bonusscale = 100;
        int bonus;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int amount = in.nextInt();

        if (amount > 1000) {
            bonus = amount / bonusscale;
        } else {
            bonus = 0;
        }
        int account = balance + bonus + amount;
        System.out.println("Вы пополнили счёт на " + amount + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + account + " руб.");

    }
}

