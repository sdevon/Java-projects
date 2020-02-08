/*
 * menu class displays a menu and prompt the user for a menu selection
 * and receive input from the user 
 * extra credit if the input is validated  
 */
package numbersystems;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
//import javax.swing.JOptionPane;
/**
 *
 * @author Devon
 */
public class Menu {
    
    String returnChoice;
    
    PrintWriter pw;
    public Menu(PrintWriter pw){
        this.pw = pw;
    }
    
    public void display(){
        System.out.println("Welcome to the Number System converter ");
        System.out.println("Enter an Option:");
        System.out.println("Enter 1: for decimal to binary conversion ");
        System.out.println("Enter 2: for decimal to hexadecimal conversion");
        System.out.println("Enter 3: for binary to decimal conversion");
        System.out.println("Enter 4: for binary to hexadecimal converion");
        System.out.println("Enter 5: for hexadecimal to decimal conversion");
        System.out.println("Enter 6: for hexadecimal to binary conversion");
        
        
   //     String choice = JOptionPane.showInputDialog("Type 1 for decimal to binary, type 2 for decimal to hexadecimal,"
	//			+ "type 3 for binary to decimal, type 4 for binary to hexadecimal, type 5 for hexadeimal to decimal"
	//	returnChoice = choice;
    }
    
    public int getSelection(){
        Scanner inChoice = new Scanner(System.in);
        int num = inChoice.nextInt();
        return num;
        
     
      //  int i = Integer.parseInt(returnChoice);
	//	if(i >= 1 && i <=6) 
	//	return i;
	//	else
	//	return 7;
        
    }
    
}
