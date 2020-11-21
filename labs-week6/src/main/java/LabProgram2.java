import java.util.Scanner;

public class LabProgram2 {

    public static void main(String[] args) {

        String userPhrase;


        Scanner scnr = new Scanner(System.in);
        userPhrase = scnr.nextLine();

        System.out.println(CreateAcronym(userPhrase));


    }

    public static String CreateAcronym(String userPhrase) {

        String[] userPhraseArray;
        String acronym;
        userPhraseArray = userPhrase.split(" ");
        acronym = "";

        for (int i = 0; i < userPhraseArray.length; i++) {
            userPhraseArray[i] = String.valueOf(userPhraseArray[i].charAt(0));
            if(userPhraseArray[i].equals(userPhraseArray[i].toUpperCase())){
            acronym = acronym.concat(userPhraseArray[i]);}

        }
        return acronym;
    }
}
