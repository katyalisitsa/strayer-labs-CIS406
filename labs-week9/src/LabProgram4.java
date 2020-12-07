import java.util.Arrays;
import java.util.Scanner;

public class LabProgram4 {

    /*
     * A contact list is a place where you can store a specific contact with other
     * associated information such as a phone number, email address, birthday, etc.
     * Write a program that first takes as input an integer N that represents the number
     * of word pairs in the list to follow. Word pairs consist of a name and a phone number
     * (both strings). That list is followed by a name, and your program should output that
     * name's phone number. Assume that the list will always contain less than 20 word pairs.
     * Ex: If the input is:
     *   3 Joe 123-5432 Linda 983-4123 Frank 867-5309 Frank
     * the output is:
     *   867-5309
     */

    /* Define your method here */
    public static String GetPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize) {

        String phoneNum;
        int myIndex = 0;
        for (int i = 0; i < arraySize; i++) {
            if (nameVec[i].equals(contactName)) {
                myIndex = i;
            }
        }
        phoneNum = phoneNumberVec[myIndex];
        return phoneNum;
    }


    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        int numElements;
        String contactName;
        String userInput;

        userInput = scnr.nextLine();
        String[] userArray = userInput.split(" ");

        numElements = Integer.parseInt(userArray[0]);

        String[] names = new String[numElements];
        String[] phoneNums = new String[numElements];


        for (int i = 0; i < (numElements * 2); i++) {

            if (i % 2 == 0) {
                names[i / 2] = userArray[i + 1];
            } else {
                phoneNums[i / 2] = userArray[i + 1];
            }


        }

        contactName = userArray[numElements * 2 + 1];

        System.out.println(GetPhoneNumber(names, phoneNums, contactName, numElements));


    }
}
