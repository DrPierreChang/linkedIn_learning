public class returnType {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){

        double tip  = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax + listedMealPrice;

        return  result;
    }

    public static void main(String[] args) {

       double groupTotalMealPrice =  calculateTotalMealPrice(16, .2, .08);
       System.out.println(groupTotalMealPrice);

       double individualTotalMealPrice = groupTotalMealPrice / 5;
       System.out.println(individualTotalMealPrice);
    }
}
