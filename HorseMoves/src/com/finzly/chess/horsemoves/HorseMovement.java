package com.finzly.chess.horsemoves;
import java.util.Scanner;
public class HorseMovement {
	static boolean[][] visited=new boolean[8][8];
	public static void main(String[] args) {
		
		int[][] chessboard=new int[8][8];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting position");
		int startX=sc.nextInt();
		int startY=sc.nextInt();
		
		
		
		if(isValidMove(startX, startY)) {
		visited[startX][startY]=true;
		
		int[][] possibleMoves=getKnightMoves(startX,startY);
		
		System.out.println("Starting position:("+startX+","+startY+")");
		System.out.println("Possible moves:");
		for(int i=0;i<possibleMoves.length;i++) {
			System.out.println("("+possibleMoves[i][0]+","+possibleMoves[i][1]+")");
		}
	}else {
		System.out.println("Invalid starting position");
	}
	}
	static int[][] getKnightMoves(int x,int y){
		int[][] moves=new int[8][2];
		int moveCount=0;
		
		int[][] positions= {{-2,1},{-1,2},{1,2},{2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
		for(int[] position:positions) {
			int newX=x+position[0];
			int newY=y+position[1];
			if(isValidMove(newX,newY) && !visited[newX][newY]) {
				moves[moveCount][0]=newX;
				moves[moveCount][1]=newY;
				moveCount++;
				visited[newX][newY]=true;
				
			}
		}
		return moves;
	}
	static boolean isValidMove(int x,int y) {
		return x>=0 && x<8 && y>=0 && y<8;
	}
	

}
