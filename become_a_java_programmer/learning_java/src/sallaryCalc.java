public class sallaryCalc {


    public static void main(String[] args) {
        double moneyPerHour = 250;
        double amountOfWorkHours = 10000;
        double amountOfVacationHours = 2000;
        double result = moneyPerHour * amountOfWorkHours - amountOfVacationHours;
        System.out.println(result);
    }
}
