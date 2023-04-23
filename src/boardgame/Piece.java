package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	//constructor without 'position' because the first position of a piece is 'null'
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		//hook methods
		//using a possible abstract method from a subclass
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0;j < mat.length; j++) {
				// if mat[i][j] == true;
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}