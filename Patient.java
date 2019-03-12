package Q4;

public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    //default constructor
    Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    // constructor provides values for each fields
    Patient(int idNumber, int age, String bloodType, char rhFactor) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

    //getter for idNumber
    public int getIdNumber() {
        return idNumber;
    }

    //getter for age
    public int getAge() {
        return age;
    }

    //getter for bloodData
    public BloodData getBloodData() {
        return bloodData;
    }

}// end Patient class
