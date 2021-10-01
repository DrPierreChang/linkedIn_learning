public class Students {

    static int studyYears = 4;
    String firstName;
    String lastName;
    double ICQ;
    String studentUniversity;
    int startYear;

    public Students(String firstName, String lastName,
                    double ICQ, String studentUniversity, int startYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ICQ = ICQ;
        this.studentUniversity = studentUniversity;
        this.startYear = startYear;

    }

    public double findGraduationYear() {

        return (this.startYear + studyYears);
    }
}
