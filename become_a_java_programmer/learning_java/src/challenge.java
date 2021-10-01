import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        String question = "What city is the capital of Great Britain?";
        String choiceOne = "Moscow";
        String choiceTwo = "Soul";
        String choiceThree = "london";

        String correctAnswer = choiceThree;


        String tryAgain = "yes";
        while (tryAgain.equals("yes")) {
            System.out.println(question);
            Scanner input = new Scanner(System.in);
            String userAnswer = input.next();
            if (userAnswer.toLowerCase().equals(choiceThree)) {
                System.out.println("Your answer is correct! See you next time!");
                tryAgain = "no";
        }else {
                System.out.println("It is mistake! If you wand to try again type yes. Otherwise type no");
                Scanner inputTwo = new Scanner(System.in);
                tryAgain = inputTwo.next().toLowerCase();
               if (tryAgain.equals("no")) {
                    System.out.println("Goodbye! See you ");
                }

            }

        }


    }
}
