import java.util.Scanner;

public class LabProgram2 {

    /*
     * Write a program with total change amount as an integer input that outputs
     * the change using the fewest coins, one coin type per line. The coin types
     * are dollars, quarters, dimes, nickels, and pennies. Use singular and plural
     * coin names as appropriate, like 1 penny vs. 2 pennies.
     * Ex: If the input is 0 or less, output:
     *   no chang
     * Ex: If the input is 45, the output is:
     *   1 quarter
     *   2 dimes
     * Your program must define and call the following method. Positions 0-4 of coinVals
     * should contain the number of dollars, quarters, dimes, nickels, and pennies,
     * respectively.
     */

    public static void ExactChange(int userTotal, int[] coinVals) {

        if (coinVals[0] != 0) {
            if (coinVals[0] == 1) {
                System.out.println(coinVals[0] + " dollar");
            } else {
                System.out.println(coinVals[0] + " dollars");
            }
        }

        if (coinVals[1] != 0) {
            if (coinVals[1] == 1) {
                System.out.println(coinVals[1] + " quarter");
            } else {
                System.out.println(coinVals[1] + " quarters");
            }
        }

        if (coinVals[2] != 0) {
            if (coinVals[2] == 1) {
                System.out.println(coinVals[2] + " dime");
            } else {
                System.out.println(coinVals[2] + " dimes");
            }
        }
        if (coinVals[3] != 0) {
            if (coinVals[3] == 1) {
                System.out.println(coinVals[3] + " nickel");
            } else {
                System.out.println(coinVals[3] + " nickels");
            }
        }
        if (coinVals[4] != 0) {
            if (coinVals[4] == 1) {
                System.out.println(coinVals[4] + " penny");
            } else {
                System.out.println(coinVals[4] + " pennies");
            }
        }


    }

    public static void main(String[] args) {
        /* Type your code here. */

        int userTotal;
        int[] coinVals = new int[5];

        Scanner scnr = new Scanner(System.in);
        userTotal = scnr.nextInt();

        if (userTotal <= 0) {
            System.out.println("no change");
        }

        if (userTotal >= 100) {
            //dollars
            coinVals[0] = userTotal / 100;
            userTotal = userTotal - coinVals[0] * 100;
        }

        if (userTotal >= 25) {
            //quarters
            coinVals[1] = userTotal / 25;

            userTotal = userTotal - coinVals[1] * 25;
        }

        if (userTotal >= 10) {
            //dimes
            coinVals[2] = userTotal / 10;

            userTotal = userTotal - coinVals[2] * 10;
        }

        if (userTotal >= 5) {
            //nickels
            coinVals[3] = userTotal / 5;

            userTotal = userTotal - coinVals[3] * 5;
        }

        if (userTotal > 0) {

            //pennies
            coinVals[4] = userTotal;

            userTotal = userTotal - coinVals[4];
        }

        ExactChange(userTotal, coinVals);

    }
}
