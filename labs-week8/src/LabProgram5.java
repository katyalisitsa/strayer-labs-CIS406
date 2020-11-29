
import java.util.Scanner;

public class LabProgram5 {

    /*
     * Write a program that reads an integer,
     * a list of words, and a character. The integer
     * signifies how many words are in the list. The output
     * of the program is every word in the list that contains
     * the character at least once. Assume at least one word in
     * the list will contain the given character. Assume that the
     * list of words will always contain less than 20 words.
     * Ex: If the input is:
     *   4 hello zoo sleep drizzle z
     * then the output is:
     *   zoo
     *   drizzle
     * */

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String inputString;
        String[] userList;
        char inputChar;

        inputString = scnr.nextLine();
        userList = inputString.split(" ");

        String len = userList[0];
        int numElements = Integer.parseInt(len) + 1;


        inputChar = userList[numElements].charAt(0);

        String[] userListString = new String[numElements - 1]; //for strings


        for (int i = 1; i <= numElements - 1; i++) {

            userListString[i - 1] = userList[i].toString();

        }

        for (int k = 0; k < userListString.length; k++) {
            if ((userListString[k]).indexOf(inputChar) != -1) {
                System.out.println(userListString[k]);
            }
        }


    }
}
