import java.util.Scanner;

public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;
        int charNum;
        // Add more variables as needed

        charNum = 0;

        userText = scnr.nextLine();  // Gets entire line, including spaces.

        char[] charArray = userText.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            if((!(Character.valueOf(charArray[i]).equals(" "))) && (!(Character.valueOf(charArray[i]).equals("."))) && (!(Character.valueOf(charArray[i]).equals(",")))){
            }else{
                charNum = charNum + 1;
            }

            /*if(!(Character.valueOf(charArray[i]).equals(" "))){

            }else if(!(Character.valueOf(charArray[i]).equals(","))){

            }else if(!(Character.valueOf(charArray[i]).equals("."))){

            }else{charNum = charNum + 1;}*/

        }
        System.out.println(charNum);
    }
}
