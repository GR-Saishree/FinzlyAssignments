package com.finzly.game.tictactoe;

public class TicTacToe {

	
	static char[][] gameBoard;
	
	public TicTacToe(){
		gameBoard=new char[3][3];
		initBoard();
		
	}
	void initBoard() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				gameBoard[i][j]=' ';
			}
		}
	}
	static void dispBoard() {
		System.out.println(" -------------");
		for(int i=0;i<3;i++) {
			System.out.print(" | ");
			for(int j=0;j<3;j++) {
				
				System.out.print(gameBoard[i][j]+" | ");
			}
			System.out.println();
			System.out.println(" -------------");
			
		}
		
	}
	static void placeChar(int row,int col,char ch) {
		if(row>=0&&row<=2&&col>=0&&col<=2) {
		gameBoard[row][col]=ch;
		}
		else {
			System.out.println("Please enter valid row and column which should be 0 to 2");
		}
		
	}
	static boolean checkColWin() {
		for(int j=0;j<3;j++) {
			if(gameBoard[0][j]!=' '&&gameBoard[0][j]==gameBoard[1][j]&&gameBoard[1][j]==gameBoard[2][j]) {
				return true;
			}
		}
		return false;
	}
	static boolean checkRowWin() {
		for(int i=0;i<3;i++) {
			if(gameBoard[i][0]!=' '&&gameBoard[i][0]==gameBoard[i][1]&&gameBoard[i][1]==gameBoard[i][2]) {
				return true;
			}
		}
		return false;
	}
   static boolean checkDiagWin(){
    	if(gameBoard[0][0]!=' '&&gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]
    			||gameBoard[0][2]!=' '&&gameBoard[0][2]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][0]){
    	return true;
    	}
    	
    	return false;
    }
   static boolean isDraw() {
	   for(int i=0;i<=2;i++) {
		   for(int j=0;j<=2;j++) {
			   if(gameBoard[i][j]==' ') {
				   return false;
			   }
		   }
	   }
	   return true;
   }
}



