import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram3 {

    /*
     * Statistics are often calculated with varying amounts of input data.
     * Write a program that takes any number of non-negative integers as input,
     * and outputs the average and max. A negative integer ends the input and is not included
     * in the statistics.
     * Ex: When the input is 15 20 0 5 -1, the output is: 10 20
     * You can assume that at least one non-negative integer is input.
     */

    public static void main(String[] args) {
        String userInput;
        int maxInt;
        int averageIntSum;
        int numValues;
        String[] userInputArray;
        //int[] intArray;

        List<Integer> intArray = new ArrayList<Integer>();


        numValues = 0;
        maxInt = 0;
        averageIntSum = 0;

        Scanner scnr = new Scanner(System.in);

        userInput = scnr.nextLine();
        userInputArray = userInput.split(" ");



        /*for(int j = 0; j< userInputArray.length; j++){
            intArray.add(0);
        }
         */

        int k = 0;
        for (String str : userInputArray) {

            //intarray[i]=Integer.parseInt(str.trim());
            //userInputArray[k]= Integer.parseInt(str.trim());
            //intArray.set(k, Integer.parseInt(userInputArray[k]));
            //intArray.add(k,Integer.parseInt(userInputArray[k]));
            intArray.add(k, Integer.valueOf(userInputArray[k]));

            k++;

        }

        for (int i = 0; i < intArray.size() - 1; i++) {

            if (intArray.get(i) >= 0) {
                numValues += 1;

                if (intArray.get(i) > maxInt) {
                    maxInt = intArray.get(i);
                }

                averageIntSum = averageIntSum + intArray.get(i);

            }
        }
        System.out.println((averageIntSum / numValues) + " " + maxInt);


    }


}