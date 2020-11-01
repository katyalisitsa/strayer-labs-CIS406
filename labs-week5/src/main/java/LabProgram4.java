import java.util.Scanner;

public class LabProgram4 {
    public static void main(String[] args) {

        int inputInt;
        int secondDigit;
        int firstDigit;

        Scanner scnr = new Scanner(System.in);

        inputInt = scnr.nextInt();

        secondDigit = inputInt%10;
        firstDigit = inputInt/10;

        //System.out.println(firstDigit);
        //System.out.println(secondDigit);

       if(inputInt >= 20 && inputInt <= 98){

            do{

                secondDigit = inputInt%10;
                firstDigit = inputInt/10;
                System.out.print(inputInt + " ");

                inputInt = inputInt -1;



            }while( firstDigit != secondDigit );

           System.out.println();
        }else{
           System.out.println("Input must be 20-98");
       }


    }
}
