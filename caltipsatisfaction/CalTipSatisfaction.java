/*
 * ask user  to rate satfication 1 to 3 1=best, 2=ok, 3=bad
 * if 1 tip is 20%, if 2 tip is 15%, if 3 tip is 10%.
 * report level of sat. and tip in dollars and cents.
 */
package caltipsatisfaction;

import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class CalTipSatisfaction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     double bill=0;
     double tip=0;
     String msg = null;
     System.out.println("Enter Satisfaction rating 1 = Total satisfied, 2 = Satisfied, 3 = Dissatisfied: ");
     Scanner scan = new Scanner(System.in);
     int sat = scan.nextInt();
     
     
     if (sat >=3){// || sat !=2 ||  sat !=3){     
         System.out.println("You did not enter a correct number :( Start Program Over");   
     }
     
     else{
         
         System.out.println("Enter Bill: ");
         Scanner scann = new Scanner(System.in);
         bill = scann.nextDouble();
         
         
         if(sat == 1){
             tip =(.2*bill);
             msg = "1.Totally Satisfied";    
         }
         else if(sat == 2){
             tip =(.15*bill);
              msg = "2.Satisfied";     
         }
         else if(sat == 3){
             tip =(.1*bill);
              msg = "3.Dissatisfied";
         }
         System.out.println("Your tip is $"+ tip + " because your selected "+msg);
     }
    

    
    }
    
}
