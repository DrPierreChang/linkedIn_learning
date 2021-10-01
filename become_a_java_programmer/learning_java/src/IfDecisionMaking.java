import java.util.Scanner;

public class IfDecisionMaking {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int userNum = scanner.nextInt();

        if (userNum < 5) {
            System.out.println("Enjoy the good luck a friend brings your");
        }else {
            System.out.println("You will be dead soon");
        }
    }

}
