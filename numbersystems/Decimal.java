
package numbersystems;

/**
 *
 * @author Devon
 */
import java.io.FileNotFoundException;
//import javax.swing.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class Decimal {
    
    PrintWriter pw;
    public Decimal(PrintWriter pw) throws FileNotFoundException{
        this.pw = pw;
    }
    
    int inDec;
    String binNum = "";
    String hexNum = "";
    int n,k;
    int reminder;
    String reverse = "";
    
    //Calls methods
    public void decToBin() {
 	inputDec();
 	toBin();
 	outBin();
    }
    
    //calls methods
    public void decToHex(){
        inputDec();
        toHex();
        outHex(); 
    }
    
    //uses scanner to get input for method
    private void inputDec(){
   // String userInPut;
    System.out.println("Enter a decimal ");
    Scanner userInPut = new Scanner(System.in);
    n = userInPut.nextInt();
    }
    
    /*
    divide by 2 if reminder then print 1 else 0
    then print in reverse order
    */
    public void toBin(){
        while (n != 0){ 
            reminder = n%2;
            if (reminder >0){
                k = 1;
            }
            else{
                k = 0;
            }
            binNum = binNum +k;
            n = n/2;  
           }
        for (int i= binNum.length()-1;i>=0;i--){
            reverse = reverse + binNum.charAt(i);
        }
        binNum = reverse;
    }
    
    //output Binary number
    private void outBin(){
       System.out.println("Your answer in Binary is: "+binNum+"\n");
    }  
    
    
    /*
    divide by 16 and multiple the reminder by hex reminder
    then print in reverse
    */
    private void toHex(){
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            while(n>0){
                reminder = n%16;
                hexNum = hex[reminder]+hexNum;
                n=n/16;
            }
    }
    //output hexadecimal number
    private void outHex(){
        System.out.println("Your answer in Hexadecimal is: " + hexNum+"\n");
    }     
}