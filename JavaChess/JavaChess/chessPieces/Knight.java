package chessPieces;

import java.util.*;
import Board.Alliance;
import Board.Board;
import Board.Move;
import Board.Tile;
import Board.boardUtils;

public class Knight extends Piece{
	
	private final static int[] CANDIDATE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17};
	
	Knight(final int piecePosition, final Alliance pieceAlliance){
		super(piecePosition, pieceAlliance);
	}
	@Override
	public List<Move> calculateLegalMoves(Board board){
		int candidateDestinationCoordinate;
		final List<Move> legalMoves = new ArrayList<>();
		
		for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES) {
		
			candidateDestinationCoordinate = this.piecePosition + currentCandidateOffset;
			
			if(boardUtils.isValidTitleCoordinate(candidateDestinationCoordinate)) {
				
				if(isFirstColumnExclusion(this.piecePosition, currentCandidateOffset)) {
					continue;
				}
			
				final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);
				
				if(!candidateDestinationTile.isTileOccupied()) {
					legalMoves.add(new Move());
				}else {
					final Piece pieceDestination = candidateDestinationTile.getPiece();
					final Alliance pieceAlliance = pieceAtDestination.getpieceAlliance();
					
					if(this.pieceAlliance != pieceAlliance) {
						legalMoves.add(new Move());
					}
				}
			}
		}
		return ImmutableList.copyOf(legalMoves);
	}
	public static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {
		return boardUtils.FIRST_COLUMN[currentPosition] && ((candidateOffset == -17) || (candidateOffset == -10) || candidateOffset ==6 || candidateOffset ==15);
	}
	public static boolean isSecondColumnExclusion(final int currentPosition, final int candidateOffset) {
		return boardUtils.SECOND_COLUMN[currentPosition] && ((candidateOffset == -10) || (candidateOffset == 6));
	}
}
