
package calclargefactorials;

import java.util.Scanner;

/**
 * @author Devon Sherrell (009399947)
 * @version 1.0 - August 04, 2016
 * Contain main method to start the program
 */
public class Driver {
	
    /**
     * 
     * @param args
     * 
     */
    
    public static void main(String args[]) {
		LineWriter lw;
		
		Scanner in = new Scanner(System.in);
		Factorial fact = new Factorial();
		
		System.out.print("Enter a number to calculate it's factorial: ");
                
		while (in.hasNextInt()) {
			int base = in.nextInt();
                        System.out.println("You Entered: " + base);
			lw = new LineWriter("csis");
			fact.getLineWriter(lw);
			long start = System.currentTimeMillis();
			System.out.println(base + "!: ");
                        lw.println(base +"!: ");
			fact.fact(base);
			fact.print();
			long end = System.currentTimeMillis();
			System.out.println(" Seconds to calculate: " + (end - start) / 1000);
			lw.println(" Seconds to calculate: " + (end - start) / 1000);
			System.out.println();
			lw.close();
			System.out.println("Enter x to exit, or another");
			System.out.print("number to calculate it's factorial: ");
		}
	}
}