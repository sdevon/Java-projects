
package pkg1913taxcalc;

import java.util.Scanner;

/**
 * @author Devon
 */
public class Main {

    public static void main(String[] args) {
       
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter your income: ");
	final double INAMOUNT = keyboard.nextDouble();
		
	double tax1 = 0;
	double tax2 = 0;
	double tax3 = 0;		
        double tax4 = 0;
	double tax5 = 0;
	double tax6 = 0;
	double taxItMore = 0;
	double incomeTax = 0;
		
		
	if (INAMOUNT <= 50000){ 
	tax1 = INAMOUNT * .01;}
        
	else if (INAMOUNT > 50000 && INAMOUNT <= 75000){ 
		tax1 = 50000 * .01;
		taxItMore = INAMOUNT - 50000;
		tax2 = taxItMore * .02;
	}
        
	else if (INAMOUNT > 75000 && INAMOUNT <= 100000){ 
		tax1 = 50000 * .01;
		tax2 = 25000 * .02;
		taxItMore = INAMOUNT - 75000;
		tax3 = taxItMore * .03;
	}
	
        else if (INAMOUNT > 100000 && INAMOUNT <= 250000){ 
		tax1 = 50000 * .01;
		tax2 = 25000 * .02;
		tax3 = 25000 * .03;
		taxItMore = INAMOUNT - 100000;
		tax4 = taxItMore * .04;
	}
	
        else if (INAMOUNT > 250000 && INAMOUNT <= 500000){ 
		tax1 = 50000 * .01;
		tax2 = 25000 * .02;
		tax3 = 25000 * .03;
		tax4 = 150000 * .04;
		taxItMore = INAMOUNT - 150000;
		tax5 = taxItMore * .05;
	}
		
        else if (INAMOUNT > 500000){ 
		tax1 = 50000 * .01;
		tax2 = 25000 * .02;
		tax3 = 25000 * .03;
		tax4 = 150000 * .04;
		tax5 = 250000 * .05;
		taxItMore = INAMOUNT - 250000;
		tax6 = taxItMore * .06;
	}
		
	incomeTax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6;
	System.out.printf("\ntax is $%5.2f ",  incomeTax );
    } 
}
