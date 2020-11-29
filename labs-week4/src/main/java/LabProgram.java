import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        int numValues;
        Scanner scnr = new Scanner(System.in);
        List<Integer> userValues = new ArrayList();  // Set of data specified by the user
        // Number of items in the set of data
        int midVal1;
        int midVal2;
        int i = 0;
        int length = 0;
        userValues[i] = scnr.nextInt();


        while (userValues[i] > 0) {

            userValues[i] = scnr.nextInt();
            i++;
            length = i;

        }


        if (length % 2 == 0) {
            midVal1 = userValues[length / 2];
            midVal2 = userValues[length / 2 + 1];
            System.out.println(midVal1 + " " + midVal2);
        } else {
            midVal1 = userValues[length / 2];
            System.out.println(midVal1);
        }
    }
}
