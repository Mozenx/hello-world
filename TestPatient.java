package Q4;

public class TestPatient {

    public static void main(String[] args) {
        //create object with default constructor
        System.out.println("create object with default constructor\n" + "************************************");
        Patient pa1 = new Patient();
        System.out.println("Patient ID: " + pa1.getIdNumber() + "\nPatient age: " + pa1.getAge() + "\npatient Blood Date: " +
                pa1.getBloodData().getBloodType() + pa1.getBloodData().getRhFactor());

        System.out.println("==============================================================" +
                "\n##############################################################" +
                "\n==============================================================");

        // create object using parameter
        System.out.println("create object using parameter constructor\n" + "************************************");
        Patient pa2 = new Patient(1, 18, "AB", '-');
        System.out.println("Patient ID: " + pa2.getIdNumber() + "\nPatient age: " + pa2.getAge() + "\nPatient BloodData: " +
                pa2.getBloodData().getBloodType() + pa2.getBloodData().getRhFactor());
    }
}
