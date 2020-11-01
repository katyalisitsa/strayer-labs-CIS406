import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        boolean isDigit;

        isDigit = true;


        userString = scnr.next();

        char[] charArray = new char[userString.length()];


        for(int k = 0; k <userString.length(); k++){
            charArray[k] = userString.charAt(k);
        }

        for(int i = 0; i< userString.length(); i++){
            if(!Character.isDigit(charArray[i])){
                isDigit = false;
            }
        }

        if(isDigit){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
