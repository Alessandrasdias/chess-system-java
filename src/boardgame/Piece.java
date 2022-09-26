package boardgame;

//is associated with Board
public class Piece {
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

}
