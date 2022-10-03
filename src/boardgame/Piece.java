package boardgame;

//is associated with Board
public abstract class Piece {
	//Shouldn't be visible bc is abstract
	protected Position position;
	private Board board;
	
	//position will be at first null, no need to add, Java does it.
	public Piece(Board board) {
		this.board = board;		
	}

	//Board can't be altered by user so no set
	//Only classes inside the package and subclasses can access board
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
