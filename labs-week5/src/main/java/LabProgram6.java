import java.util.Scanner;

public class LabProgram6 {
    public static void main(String[] args) {

        String inputString;

        Scanner scnr = new Scanner(System.in);
        inputString = scnr.nextLine();
        while(!(inputString.equals("Quit")) && !(inputString.equals("quit")) && !(inputString.equals("q"))){

            char[] charArray = inputString.toCharArray();

            for(int i =charArray.length - 1; i >= 0 ;i--){
                System.out.print(charArray[i]);

            }
            System.out.println();
            inputString = scnr.nextLine();


        }
    }
}
