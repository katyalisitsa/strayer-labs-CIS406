import java.util.Scanner;

public class LabProgram7 {
    public static void main(String[] args) {

        String inputString;
        char[] charArray;
        boolean isPalindrome;
        String inputStringNoSpace;

        isPalindrome = true;

        Scanner scnr = new Scanner(System.in);
        inputString = scnr.nextLine();

        inputStringNoSpace = inputString.replace(" ","");

        charArray = inputStringNoSpace.toCharArray();
        for(int i = 0; i <charArray.length/2;i++){
            if(charArray[i] != (charArray[charArray.length - i - 1])){
                //System.out.print(charArray[i]);
                //System.out.print(charArray[charArray.length - i - 1]);
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println(inputString + " is a palindrome");
        }else{
            System.out.println(inputString + " is not a palindrome");
        }


    }
}
