package chess;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a basic description of a Bishop chess piece.
 */
public class Bishop {

    /**
     * This method should retrieve the possible positions of a piece on a chess board.
     */
    public Set<Position> getNextPositions(Position origin) {
       
    	Set<Position> validPositions = new HashSet<Position>();
    	//northeast
    	for(int i = origin.getRow(); i <= Position.MAX_ROW; i++){
    		for(char c = origin.getColumn(); c <= Position.MAX_COLUMN; c++ ){
    			Position ne = new Position(c,i);
    			validPositions.add(ne);
    		}
    	}
    	//northwest
    	//southeast
    	//southwest
    	
    	return validPositions;
    }
    private void genreateAllPostion(Set<Position> positions, Position currentPosition){
    	char currentColumn = currentPosition.getColumn();
    	int currentRow = currentPosition.getRow();
    	if(currentRow < Position.MAX_ROW){
    		if(currentColumn < Position.MAX_COLUMN){
    			char nextColumn = currentColumn++;
    			int nextRow = currentRow++;
    			Position northEast = new Position(nextColumn,nextRow);
    			positions.add(northEast);
    			this.genreateAllPostion(positions, northEast);
    		}
    		if(currentColumn > Position.MIN_COLUMN){
    			char nextColumn = currentColumn--;
    			int nextRow = currentRow++;
    			Position northWest = new Position(nextColumn,nextRow);
    			positions.add(northWest);
    			this.genreateAllPostion(positions, northWest);
    		}
    	}
    	
    	
    }
   
}
