package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
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
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getpieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				//Show print board
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getpieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			
		}
		
	}

}
