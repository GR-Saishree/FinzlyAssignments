package com.finzly.game.tictactoe;
import java.util.Scanner;
public class HumanPlayer extends Player {
	
	
	
	HumanPlayer(String pname,char chr){
		name=pname;
		ch=chr;
	}
	
	void makeMove() {
		Scanner scan=new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter the row and column");
			row=scan.nextInt();
			col=scan.nextInt();
			
		}while(!isValidMove(row, col));
		
		TicTacToe.placeChar(row, col, ch);
	}
	

}
