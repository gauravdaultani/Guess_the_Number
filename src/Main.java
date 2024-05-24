import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random() * 100);
        int userNumber;

        do {
            System.out.println("Guess a number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WHOOHOO.. CORRECT NUMBER!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }
        } while (true);

        System.out.println("My number was: " + myNumber);
    }
}
