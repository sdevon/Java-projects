
package connectfour;

import java.util.Scanner;

/**
 * @author Devon
 */
public class Connect4Driver {
    
      public static void main(String[] args) {
          
        Board b = new Board();
        Connect4Play play = new Connect4Play(b);  
        Scanner scan = new Scanner(System.in);
        
        String option, yes = "yes", no = "no";
        
        
        System.out.println("Would you like to play against AI? (yes/no)");
        option = scan.next();
    
        if(option.equals(yes)){
            play.playAgainstAIConsole();
        }
        else if(option.equals(no)){
            play.playAgainstPlayer();
        }
        else{
            System.out.println("You did not anser yes or no, end program!");
        }
    }
}
