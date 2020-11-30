import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	

	public class LabProgram {
        
     /*
     * Numerous engineering and scientific applications require finding
     * solutions to a set of equations. Ex: 8x + 7y = 38 and 3x - 5y = -1
     * have a solution x = 3, y = 2. Given integer coefficients of two linear
     * equations in variables x and y, use brute force to find an integer solution
     * for x and y in the range -10 to 10.
     * Ex: If the input is:
     *   8 7 38
     *   3 -5 -1
     * then the output is:
     *   3 2
     * Use this brute force approach:
     * For every value of x from -10 to 10
     *   For every value of y from -10 to 10
     *       Check if the current x and y satisfy both equations. If so, output the solution, and finish.]
     *   Ex: If no solution is found, output:
     *        No solution
     */
        
	    public static void main(String[] args) {

	        int coefX1;
	        int coefY1;
	        int equal1;
	

	        int coefX2;
	        int coefY2;
	        int equal2;
	

	        boolean isSolution = false;
	

	

	        String[] userInputArray1;
	        String[] userInputArray2;
	

	        String inputString1;
	        String inputString2;
	

	

	        Scanner scnr = new Scanner(System.in);
	        inputString1 = scnr.nextLine();
	        inputString2 = scnr.nextLine();
	

	        userInputArray1 = inputString1.split(" ");
	        userInputArray2 = inputString2.split(" ");
	

	        coefX1 = Integer.parseInt(userInputArray1[0]);
	        coefY1 = Integer.parseInt(userInputArray1[1]);
	        equal1 = Integer.parseInt(userInputArray1[2]);
	

	        coefX2 = Integer.parseInt(userInputArray2[0]);
	        coefY2 = Integer.parseInt(userInputArray2[1]);
	        equal2 = Integer.parseInt(userInputArray2[2]);
	

	        for(int x = -10; x <= 10; x++){
	            for(int y = -10; y<=10;y++){
	                if((coefX1 * x + coefY1 * y == equal1) && (coefX2 * x + coefY2 * y == equal2)){
	                    System.out.println(x + " " + y);
	                    isSolution = true;
	                }
	            }
	        }
	

	        if(!isSolution){
	            System.out.println("No solution");
	        }
	

	

	

	

	    }
	}

