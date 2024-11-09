import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = getRegExString(in, "Please enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String UCM = getRegExString(in, "Please enter your UC M number", "^(M|m)\\d{5}$");
        String menuChoice = getRegExString(in, "Please enter a menu option (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Your SSN is " + SSN);
        System.out.println("Your UC M number is: " + UCM);
        System.out.println("Your menu option was: " + menuChoice);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String regExString = "";
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            String input = pipe.nextLine();
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                regExString = input;
                validInput = true;
            }else {
                System.out.println("Invalid format.");
            }
        } while (!validInput);
        return regExString;
    }

}
