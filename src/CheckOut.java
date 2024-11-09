import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        boolean status = true;
        Scanner in = new Scanner(System.in);
        double totalSum = 0;
        ArrayList<Double> items = new ArrayList<Double>();
        do {
            items.add(getRangedDouble(in, "What is the price of your item?", 0.5, 10));
            status = getYNConfirm(in, "Would you like to add another item? [y/n]");
        }while(status);
        for (Double item : items) {
            totalSum = totalSum + item;
        }
        System.out.print("Your total is $" + totalSum);
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double number = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                if (low < number && number < high) {
                    validInput = true;
                } else {
                    System.out.print("Please enter a double within the valid range.");
                }
            } else {
                System.out.print("Invalid input, please enter a double.");
                pipe.next();
            }
            pipe.nextLine();
        } while (!validInput);
        return number;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String ynInput = "";
        boolean answer = false;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            ynInput = pipe.nextLine();
            switch(ynInput){
                case "n", "N":
                    return answer;
                case "y", "Y":
                    answer = true;
                    return answer;
                default:
                    System.out.print("Invalid input, please enter yY/nN.");
                    break;
            }
        } while(true);
    }
}
