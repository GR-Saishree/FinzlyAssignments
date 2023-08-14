package com.finzly.game.tictactoe;

public class PlayGame {
	public static void main(String[] args) {
		TicTacToe t=new TicTacToe();
		
		HumanPlayer hp1=new HumanPlayer("Sai shree", 'X');
		ComputerPlayer comp1=new ComputerPlayer("Computer", 'O');
		
		Player cp;
		cp=hp1;
		while(true) {
		System.out.println(cp.name+" turn:");
		cp.makeMove();
		TicTacToe.dispBoard();
		if(TicTacToe.checkRowWin()||TicTacToe.checkColWin()||TicTacToe.checkDiagWin()) {
			System.out.println(cp.name+" has won the game");
			break;
		}
		else if(TicTacToe.isDraw()) {
			System.out.println("Game is a draw");
			break;
		}
		else {
			if(cp==hp1) {
				cp=comp1;
			}
			else {
				cp=hp1;
			}
		}
	}}

}
