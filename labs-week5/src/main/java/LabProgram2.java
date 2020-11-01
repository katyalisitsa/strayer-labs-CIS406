import java.util.Scanner;

public class LabProgram2 {
    public static void main(String[] args) {

        String inputString;
        String outputString;

        Scanner scnr = new Scanner(System.in);

        inputString = scnr.nextLine();

        outputString = inputString.replace(" ","");

        System.out.println(outputString);
    }
}
