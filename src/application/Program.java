package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		/*testing position
		Position test = new Position (4, 6);
		System.out.println(test);*/
		
		/*testing Board
		Board test = new Board (8, 8);
		System.out.println(test);*/
		
		//testing chessboard on a match
		
		ChessMatch chessMatch = new ChessMatch();
		//func to print pieces
		UI.printBoard(chessMatch.getpieces());
		
		
	}

}
