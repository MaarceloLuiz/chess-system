package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	//constructor without 'position' because the first position of a piece is 'null'
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Position getPosition() {
		return position;
	}
	
}
