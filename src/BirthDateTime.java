import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner in = new Scanner(System.in);
        String hourType = "AM";
        int year = getRangedInt(in, "What year were you born on?", 1950, 2015);
        int month = getRangedInt(in, "What month were you born on? [1-12]", 1, 12);
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> getRangedInt(in, "What day were you born on? [1-31]", 1, 31);
            case 4, 6, 9, 11 -> getRangedInt(in, "What day were you born on? [1-30]", 1, 30);
            case 2 -> getRangedInt(in, "What day were you born on? [1-29]", 1, 29);
            default -> day = 0;
        };
        int hour = getRangedInt(in, "What hour were you born on? [1-24]", 1, 24);
        int min = getRangedInt(in, "What minute were born on? [1-59]", 1, 59);
        if(hour >= 12){
            hourType = "PM";
        }
        if (hour > 12) {
            hour = hour - 12;
        }
        System.out.print("You were born on " + monthList[month - 1] + " " + day + " " + year + " at " + hour + ":" + min + " " + hourType);
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int number = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                if (low < number && number < high) {
                    validInput = true;
                } else {
                    System.out.print("Please enter an integer within the valid range.");
                }
            } else {
                System.out.print("Invalid input, please enter an integer.");
                pipe.next();
            }
        } while (!validInput);
        return number;
    }
}
