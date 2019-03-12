//package Q1;
// added comment
import java.util.Scanner;

public class EncryptString {
    private String inputString;
    private int inputInt;

    Scanner input = new Scanner(System.in);

    // encrypt method
    public char encrypt(int index) {

        return inputString.charAt(index);

    }// end method encrypt

    // encryptAll method
    public void encryptAll() {
        getMessage();
        getCode();

        // assign length of string into a variable
        int lengthOfString = inputString.length();
        System.out.println("Your encrypted String with number " + inputInt + " is: ");

        // encrypt each char in string except char space
        for (int i = 0; i < lengthOfString; i++) {
            int convertCharToInt = (int) encrypt(i);
            if (convertCharToInt == 32) {
                System.out.print(encrypt(i));
            }// end of if
            else {
                convertCharToInt += inputInt;
                char converIntTochar = (char) convertCharToInt;
                System.out.print(converIntTochar);
            }// end of else

        }// end of for

    }// end method encryptAll

    // getMessage method
    public void getMessage() {
        System.out.println("Enter your String: ");
        this.inputString = input.nextLine();
    }// end method getMessage

    //getCode
    public void getCode() {
        System.out.println("Enter your number: ");
        this.inputInt = input.nextInt();
    }// end method getCode

    //main method
    public static void main(String[] args) {
        EncryptString str = new EncryptString();
        str.encryptAll();
    }// end of main method

}// end class EncryptString
