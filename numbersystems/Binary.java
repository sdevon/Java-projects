
package numbersystems;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Devon
 */
public class Binary {
    StringBuilder hex = new StringBuilder ("00000000");
    String hexNum;// = {""};
    int decNum;
    int power = 0;
    int n,in;
    int reminder;
    String bin;
    char c;
    
    PrintWriter pw;
        public Binary(PrintWriter pw) throws FileNotFoundException{
        this.pw = pw;
    }
    //Calls methods
    public void binToDec(){
        inputBin();
        toDec();
        outDec();
    }   
    //Calls methods
    public void binToHex(){
        inputBin();
        toHex();
        outHex();
    }
    //get input
     public void inputBin(){
        System.out.println("input a binary number");
        Scanner userInPut = new Scanner(System.in);
        bin = userInPut.next();
        n = Integer.parseInt(bin);
    }    
        // get reverse order multiply by 2 to the power appropriate
    public void toDec(){
        while(n!=0){
                //(int i= 0, i < bin.length(), i++){
            int lastdigit = n%10;
            decNum+= lastdigit * Math.pow(2,power);
            n=n/10;  
            power++;  
        }
    }
        //output decimal number
    public void outDec(){
            System.out.println("Your answer in decimal is " +decNum+"\n");
    }
       
    /*
    followed book instructions page 50
    */
    public void toHex(){
      
        for(int i=0;i<bin.length();i+=4){
            
            for (int j=0;j<bin.length();j++){
                if(bin.substring(i, i+4).equals("0000"))
                hex.setCharAt(j, '0');
                else if(bin.substring(i, i+4).equals("0001"))
                hex.setCharAt(j,'1');
                else if (bin.substring(i, i+4).equals("0010"))
                hex.setCharAt(j,'2');
                else if(bin.substring(i, i+4).equals("0011"))
                hex.setCharAt(j,'3');
                else if(bin.substring(i, i+4).equals("0100"))
                hex.setCharAt(j,'4');
                else if(bin.substring(i, i+4).equals("0101"))
                hex.setCharAt(j,'5');
                else if(bin.substring(i, i+4).equals("0110"))
                hex.setCharAt(j,'6');
                else if(bin.substring(i, i+4).equals("0111"))
                hex.setCharAt(j,'7');
                else if(bin.substring(i, i+4).equals("1000"))
                hex.setCharAt(j,'8');
                else if(bin.substring(i, i+4).equals("1001"))
                hex.setCharAt(j,'9');
                else if(bin.substring(i, i+4).equals("1010"))
                hex.setCharAt(j,'A');
                else if(bin.substring(i, i+4).equals("1011"))
                hex.setCharAt(j,'B');
                else if(bin.substring(i, i+4).equals("1100"))
                hex.setCharAt(j,'C');
                else if(bin.substring(i, i+4).equals("1101"))
                hex.setCharAt(j,'D');
                else if(bin.substring(i, i+4).equals("1110"))
                hex.setCharAt(j,'E');
                else if(bin.substring(i, i+4).equals("1111"))
                hex.setCharAt(j,'F');
                //gets hex
                c = hex.charAt(j); 
           }
            //sets hex in String
            hexNum += c;
        }
    }
      //outout hexadecimal number
     public void outHex(){
        System.out.println("Your answer in hex is : "+ hexNum);  
    } 
}       