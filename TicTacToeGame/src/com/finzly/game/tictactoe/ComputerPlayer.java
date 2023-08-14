package com.finzly.game.tictactoe;
import java.util.Random;
import java.util.Scanner;
public class ComputerPlayer extends Player {
	
	
	
	ComputerPlayer(String cname,char cchr) {
		name=cname;
		ch=cchr;
	}
	
	void makeMove() {
		Scanner scan=new Scanner(System.in);
		int row;
		int col;
		do {
			Random rd=new Random();
			row=rd.nextInt(3);
			col=rd.nextInt(3);
		}while(!isValidMove(row, col));
		TicTacToe.placeChar(row, col, ch);
			
	}
	

}
