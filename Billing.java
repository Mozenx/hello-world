package Q3;

public class Billing {
    private static int tax;
    private static int off;
    private static int totalDue;
    // main method
    public static void main(String[] args) {
        System.out.println("computeBill with one parameter: \n" + "Total Due: " + computeBill(100)+ "\n");
        System.out.println("computeBill with two parameter: \n" + "Total Due: " + computeBill(100, 2)+ "\n");
        System.out.println("computeBill with three parameter: \n" + "Total Due: " +
                computeBill(100, 2, 10)+ "\n");
    }// end of main

    // computeBill method by one parameter
    public static int computeBill(int price){
        // calculate tax
        tax = price * 8 / 100;
        // added tax
        totalDue = price + tax;
        return totalDue;
    }
    // computeBill method by two parameter
    public static int computeBill(int price, int quantity){
        //calculate tax
        tax = price * quantity *8 / 100;
        // added tax
        totalDue = price + tax;
        return totalDue;
    }
    // computeBill method by three parameter
    public static int computeBill (int price, int quantity, int coupon){
        // calculate off
        off = price * quantity * coupon / 100;
        // subtracted off(coupon)
        totalDue = price * quantity - off;
        // calculate tax
        tax = totalDue * 8 / 100;
        // added tax
        totalDue += tax;
        return totalDue;
    }


}
