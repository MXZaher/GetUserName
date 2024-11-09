import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = getNonZeroLenString(in, "What would you like your message to say?");
        for(int i = 0; i < 60; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 0; j < 3; j++){
            System.out.print("*");
        }
        int distance = ((54 - message.length()) / 2);
        for(int k = 0; k < distance; k++){
            System.out.print(" ");
        }
        System.out.print(message);
        for(int k = 0; k < distance; k++){
            System.out.print(" ");
        }
        for(int l = 0; l < 3; l++){
            System.out.print("*");
        }
        System.out.println();
        for(int m = 0; m < 60; m++){
            System.out.print("*");
        }
    }
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.isEmpty());

        return retString;

    }
    
    
}
