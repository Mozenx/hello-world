package Q2;

public class FromLetterWriter {
    // main method
    public static void main(String[] args) {
        displaySalutation("Morad");
        businessLetter();

        displaySalutation("Morad","Ghanbari");
        businessLetter();
    } //end method main

    //displaySalutation method
    public static void displaySalutation (String lastName){
        System.out.println("Dear Mr. " + lastName);
    }

    // overloaded displaySalutation method
    public static void displaySalutation (String firstName, String lastName){
        System.out.println("Dear " + firstName + " " +lastName);
    }

    // businessLetter method
    public static void businessLetter (){
        System.out.println("Thank you for your recent order.\n");
    }
}// end class FromLetterWriter
