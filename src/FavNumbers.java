import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = getInt(in, "Please enter your favorite integer");
        double favDouble = getDouble(in, "Please enter your favorite double");
        System.out.println("\nYour favorite integer is " + favInt + " and your favorite double is " + favDouble);
    }

    public static int getInt(Scanner pipe, String prompt) {
        int number = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                validInput = true;
            } else {
                System.out.print("Invalid input, please enter an integer.");
                pipe.next();
            }
        } while (!validInput);
        return number;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double number = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.print("Invalid input, please enter a double.");
                pipe.next();
            }
        } while (!validInput);
        return number;
    }
}
