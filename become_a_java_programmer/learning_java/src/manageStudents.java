public class manageStudents {
    public static void main(String[] args) {
        Students studentA = new Students("Andrey", "Lavrentev", 5.0,
                "FEFU", 2020);
        Students studentB = new Students("Nastya", "Antonova", 5.0,
                "FEFU", 2018);

        int studentAGraduation = (int) studentA.findGraduationYear();
        int studentBGraduation = (int) studentB.findGraduationYear();

        System.out.println("First student profile: ");
        System.out.println("First Name: " + studentA.firstName);
        System.out.println("Last Name: " + studentA.lastName);
        System.out.println("ICQ: " + studentA.ICQ);
        System.out.println("University: " + studentA.studentUniversity);
        System.out.println("Graduation Year: " + studentAGraduation);

        System.out.println("Second student profile: ");
        System.out.println("First Name: " + studentB.firstName);
        System.out.println("Last Name: " + studentB.lastName);
        System.out.println("ICQ: " + studentB.ICQ);
        System.out.println("University: " + studentB.studentUniversity);
        System.out.println("Graduation Year: " + studentBGraduation);
    }
}
