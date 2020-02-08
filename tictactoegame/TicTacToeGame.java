
package tictactoegame;

import java.util.Scanner;

/**
 * @author Devon
 */


public class TicTacToeGame {

    
 public static void main (String[]args){
		
		dotictactoe game = new dotictactoe();
		Scanner in = new Scanner(System.in);
		
		int r;
		int c;
		
		while(!(game.isTie())&&(game.checkWin()==0)){
			
			
			game.printBoard();
			System.out.println("enter move (player 1) by entering row number then colume");
			
			do{
				 r = in.nextInt();
				 c = in.nextInt();		 
			}while(!game.makeMove(r,c,1));
				
			
			if(game.isTie()){
				System.out.println("tie game");
				break;
			}
			else if(game.checkWin()!=0){
				System.out.println("Palyer "+ game.checkWin()+" Wins!");
				break;
			}
			
			
			game.printBoard();
			System.out.println("enter move (player 2)");
			do{
				 r = in.nextInt();
				 c = in.nextInt();		 	
			}while(!game.makeMove(r, c, 2));
			
			
			if(game.isTie()){
				System.out.println("tie game");
				break;
			}

        else if(game.checkWin()!=0){
				System.out.println("Palyer "+ game.checkWin()+" Wins!");
				break;
			}
		
		}
		
		in.close();
		System.exit(1);
		
	}
	
    
    
    
}
