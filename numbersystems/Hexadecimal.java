
package numbersystems;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Devon
 */
public class Hexadecimal {
    //int n;
    int decNum;
    String hexIn;
    String binNum = "";
    String temp;
    StringBuilder bin = new StringBuilder ("");
    PrintWriter pw;
    char tmp;
    
    public Hexadecimal(PrintWriter pw) throws FileNotFoundException{
        this.pw = pw;
    }
    //Calls methods
    public void hexToDec(){
        inputHex();
        toDec();
        outDec();
        
        }
    //Calls methods
    public void hexToBin(){
        
        inputHex();
        toBin();
        outBin();
        
    }
    //get input
    private void inputHex(){
       System.out.println("Enter a hexadecimal ");
       Scanner userInPut = new Scanner(System.in);
       hexIn = userInPut.next();
    }
    
    /*uses string to hold hex characters and iterates through 
    length of the input where i stops c gets index from string to use
    in formula to convert decimal = 16 * decimal + hexadecimal
    */
    private void toDec(){
        String digits = "0123456789ABCDEF";
        for (int i=0; i <hexIn.length();i++){
            char c = hexIn.charAt(i);
            int d = digits.indexOf(c);
            decNum = 16*decNum + d;
        }
    }
    //output decimal number
    private void outDec(){
        System.out.println("Your answer in decimal is " + decNum+"\n");
    }
    
    
    //only equation not working...?
   private void toBin(){
       
       char c = 0000;
       int w = hexIn.length()*4; 
       
       for (int i = 0; i< hexIn.length();i++){
            if(hexIn.substring(i).equals("0"))
               c = 0000;
            else if(hexIn.substring(i).equals("1"))
                c = 0001;
            else if (hexIn.substring(i).equals("2"))
                c = 0010;
            else if(hexIn.substring(i).equals("3"))
                c = 0011;
            else if(hexIn.substring(i).equals("4"))
                c = 0100;
            else if(hexIn.substring(i).equals("5"))
               c = 0101;
            else if(hexIn.substring(i).equals("6"))
                c = 0110;
            else if(hexIn.substring(i).equals("7"))
                c = 0111;
            else if(hexIn.substring(i).equals("8"))
                c = 1000;
            else if(hexIn.substring(i).equals("9"))
               c = 1001;
            else if(hexIn.substring(i).equals("A"))
                c = 1010;
            else if(hexIn.substring(i).equals("B"))
                c = 1011;          
            else if(hexIn.substring(i).equals("C"))
                c = 1100;
            else if(hexIn.substring(i).equals("D"))
                c = 1101;
            else if(hexIn.substring(i).equals("E"))
                c = 1110;
            else if(hexIn.substring(i).equals("F"))
                c = 1111;
                
            //tmp = bin.charAt(c);
                 
           // bin.append(c);
           
           for(int j=0; j<w;j+=4){   
             binNum += c;
           } 
          //tmp = bin.charAt(c);
         // binNum +=tmp;
        }
          
   } 
   
   //output decimal number
   private void outBin(){
       System.out.println("Your answer in binary is "+ binNum +"\n");
   }
}