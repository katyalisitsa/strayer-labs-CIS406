import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram {

    /* Define your method here */
    public static int LargestNumber(int num1, int num2, int num3) {
        int largestNum = 0;
        if (num1 > num2 && num1 > num3) {
            largestNum = num1;
        } else if (num2 > num3) {
            largestNum = num2;
        } else {
            largestNum = num3;
        }
        return largestNum;
    }

    public static int SmallestNumber(int num1, int num2, int num3) {
        int smallestNumber = 0;
        if (num1 < num2 && num1 < num3) {
            smallestNumber = num1;
        } else if (num2 < num3) {
            smallestNumber = num2;
        } else {
            smallestNumber = num3;
        }
        return smallestNumber;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        String userInput;
        String[] userInputArray;
        int num1;
        int num2;
        int num3;

        List<Integer> intArray = new ArrayList<Integer>();

        Scanner scnr = new Scanner(System.in);
        userInput = scnr.nextLine();
        userInputArray = userInput.split(" ");

        int k = 0;
        for (String str : userInputArray) {
            intArray.add(k, Integer.valueOf(userInputArray[k]));
            k++;
        }

        num1 = intArray.get(0);
        num2 = intArray.get(1);
        num3 = intArray.get(2);

        System.out.println("largest: " + LargestNumber(num1, num2, num3));
        System.out.println("smallest: " + SmallestNumber(num1, num2, num3));


    }
}
