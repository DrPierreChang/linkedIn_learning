public class parameters {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){

        double tip  = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;
        System.out.println("Your total meal price is: " + result);

    }

    public static void main(String[] args) {
        //calculateTotalMealPrice(40, 2, 13);
        calculateTotalMealPrice(25, .18, .08);

    }
}
