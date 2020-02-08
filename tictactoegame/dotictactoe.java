/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

/**
 *
 * @author Devon
 */
public class dotictactoe {
    
    private int [][]board = new int [3][3];
	
    public dotictactoe(){
		
	for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){			
                board[i][j]=0;
            }
	}		
    }
	
    public boolean makeMove(int r,int c, int p){
	if(isValidMove(r,c)){
            board[r][c] = p;
            return true;
	}
	else {return false;}
    }
	
	
    private boolean isValidMove(int r, int c){	
	if(r<0||r>2||c<0||c>2){
            return false;
	}
	else if(board[r][c]!=0){
            return false;
	}
	else{return true;}
	}
	
	
    public void printBoard(){
		
        System.out.println("----------");
        for(int i=0; i<3; i++ ){
            System.out.print("|");
            for(int j = 0 ; j <3;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println(" ");
            System.out.println("----------");
        }
    }
	
	
    public boolean isTie(){
	int product =1;
	if(checkWin()==0){
            for(int i = 0; i<3; i ++){
		for(int j=0;j<3;j++){
                    product *= board[i][j];
		}
            }
	}
	if(product == 0){
            return false;
	}
	else{return true;}	
	}
	
	
	public int checkWin(){
		
            int product =1;
		
            //check vert
            for(int j=0;j<3;j++){
                product = board[0][j]*board[1][j]*board[2][j];
		if(product !=0){
                    if(product ==1){
			return (1);
                    }
                    else if (product ==2){
			return(2);
                    }
		}
		
            }
		
		//check hor.
		for  (int k=0; k<3; k++ ){
			product = board[k][0]*board[k][1]*board[k][2];
			
			if(product !=0){
				if(product ==1){
					return (1);
				}
				else if (product ==2){
					return(2);
				}
			}
			
		}
	
		product = board[0][0]*board[1][1]*board[2][2];
				
		if(product !=0){
			if(product ==1){
				return (1);
			}
			else if (product ==2){
					return(2);
			}
				
		
			product = board[2][0]*board[1][1]*board[0][2];
			
			if(product !=0){
				if(product ==1){
					return (1);
				}
				else if (product ==2){
						return(2);
				}
			}
			
}
		return(0);
}	
}

