package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	
	//only accessible on the same package and subclasses
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		//is p not null and different then or current piece color 
		return p != null && p.getColor() != color;
	}
}
