package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		/*testing position
		Position test = new Position (4, 6);
		System.out.println(test);*/
		
		/*testing Board
		Board test = new Board (8, 8);
		System.out.println(test);*/
		
		//testing chessboard on a match
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		//func to print pieces
		while(true) {
			UI.printBoard(chessMatch.getpieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
			
			
		}
		
	}

}
