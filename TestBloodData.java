package Q4;

public class TestBloodData {

    public static void main(String[] args) {
        //create object with default constructor
        System.out.println("create object with default constructor");
        BloodData bd0 = new BloodData();
        System.out.println("Blood Data: " + bd0.getBloodType() + bd0.getRhFactor());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        //create object with parameter constructor
        System.out.println("create object with parameter constructor");
        BloodData bd1 = new BloodData("A", '-');
        System.out.println("Blood Data: " + bd1.getBloodType() + bd1.getRhFactor());
    }
}
