import java.util.Scanner;

public class LabProgram4 {

    /* Define your method here */
    public static String IntegerToBinary(int integerValue) {
        String integerToBinary = "";
        int intToBinary = 0;

        while (integerValue > 0) {
            intToBinary = integerValue % 2;
            integerToBinary = integerToBinary.concat(String.valueOf(intToBinary));
            integerValue = integerValue / 2;
        }

        return integerToBinary;
    }

    public static String ReverseString(String inputString) {
        String reverseString = "";
        String[] reverseStringArray =new String[inputString.length()];
        String[] inputStringArray = inputString.split("");
        for(int i = (inputStringArray.length-1);i>=0;i--){
            reverseStringArray[i]=inputStringArray[0+i];
            reverseString = reverseString.concat(reverseStringArray[i]);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        int integerValue;

        Scanner scnr = new Scanner(System.in);
        integerValue = scnr.nextInt();

        System.out.println(ReverseString(IntegerToBinary(integerValue)));

    }
}
