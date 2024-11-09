import java.util.ArrayList;
import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = -100; i < 100; i++){
            System.out.print(i + "   ");
            System.out.print(CtoF(i));
            System.out.println();
        }
        ///double preTemp = getDouble(in, "Please enter the temperature in Fahrenheit");
        ///double postTemp = CtoF(preTemp);
        ///System.out.print("The equivalent temperature in Celsius is " + postTemp);
    }
    public static double CtoF(double Celsius){
        return ((Celsius - 32) * ((double) 5 / 9 ));
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
