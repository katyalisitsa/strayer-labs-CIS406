import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        /* Type your code here. */

        int coefX1;
        int coefY1;
        int equal1;

        int coefX2;
        int coefY2;
        int equal2;

        boolean isSolution = false;


        String[] userInputArray1;
        String[] userInputArray2;

        String inputString1;
        String inputString2;


        Scanner scnr = new Scanner(System.in);
        inputString1 = scnr.nextLine();
        inputString2 = scnr.nextLine();

        userInputArray1 = inputString1.split(" ");
        userInputArray2 = inputString2.split(" ");

        coefX1 = Integer.parseInt(userInputArray1[0]);
        coefY1 = Integer.parseInt(userInputArray1[1]);
        equal1 = Integer.parseInt(userInputArray1[2]);

        coefX2 = Integer.parseInt(userInputArray2[0]);
        coefY2 = Integer.parseInt(userInputArray2[1]);
        equal2 = Integer.parseInt(userInputArray2[2]);

        for(int x = -10; x <= 10; x++){
            for(int y = -10; y<=10;y++){
                if((coefX1 * x + coefY1 * y == equal1) && (coefX2 * x + coefY2 * y == equal2)){
                    System.out.println(x + " " + y);
                    isSolution = true;
                }
            }
        }

        if(!isSolution){
            System.out.println("No solution");
        }




    }
}
