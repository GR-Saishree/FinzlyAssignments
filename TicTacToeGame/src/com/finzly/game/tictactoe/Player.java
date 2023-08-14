package com.finzly.game.tictactoe;

public abstract class Player {
	
	String name;
	char ch;
	
	abstract void makeMove();
	boolean isValidMove(int row,int col) {
		if(row>=0&&row<=2&&col>=0&&col<=2) {
			if(TicTacToe.gameBoard[row][col]==' ') {
				return true;
			}
		}
		return false;
	}
	

}
