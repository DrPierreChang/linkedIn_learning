import java.util.Locale;
import java.util.Scanner;

public class DataTypesAndVariables {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Andrey";
        String studentLastName = "Lavrentiev";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstName + ' ' + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want update it to?");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + ' ' + studentLastName + " now has an updated GPA of " + studentGPA);

    }
}
