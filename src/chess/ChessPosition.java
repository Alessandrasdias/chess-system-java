package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instanting ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		//converting chess position to regular matrix
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		//converting regular matrix to a chess position
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		//"" is so the compiler can understand we are concatenating 2 strings
		return "" + column + row;
	}
}
