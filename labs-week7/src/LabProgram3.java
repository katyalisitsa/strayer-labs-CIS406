import java.util.Scanner;

public class LabProgram3 {

    /* Define your method here */
    public static String RemoveSpaces (String userString){
        String noSpaces="";
        String[]userStringArray=userString.split(" ");
        for(int i=0; i<userStringArray.length;i++){
            noSpaces=noSpaces.concat(userStringArray[i]);
        }
        return noSpaces;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        String userInput;

        Scanner scnr = new Scanner(System.in);
        userInput=scnr.nextLine();

        System.out.println(RemoveSpaces(userInput));
    }
}
