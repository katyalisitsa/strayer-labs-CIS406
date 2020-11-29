import java.util.Scanner;

public class LabProgram4 {

    /*
     *Write a program that reads a list of words.
     * Then, the program outputs those words and their
     * frequencies. The input begins with an integer indicating
     * the number of words that follow. Assume that the list will
     * always contain less than 20 words.
     * Ex: If the input is:
     * 5 hey hi Mark hi mark
     * Then, the output is:
     *   hey 1
     *   hi 2
     *   Mark 1
     *   hi 2
     *   mark 1
     * */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String inputString;
        String[] userList;
        int count = 1;

        inputString = scnr.nextLine();
        userList = inputString.split(" ");

        String len = userList[0];


        int numElements = Integer.parseInt(len);

        String[] userListString = new String[numElements]; //for strings
        int[] frequencies = new int[numElements]; //for frequencies


        for (int i = 1; i <= numElements; i++) {

            userListString[i - 1] = userList[i].toString();

        }


        for (int k = 0; k < numElements; k++) {
            for (int l = 1; l < numElements; l++) {


                if (userListString[k].equals(userListString[l])) {
                    count = count + 1;
                }


            }
            if (k != 0 && userListString[k].equals(userListString[0])) {
                count = count + 1;
            }
            frequencies[k] = count;
            count = 0;
            System.out.println(userListString[k] + " " + frequencies[k]);
        }


    }
}
