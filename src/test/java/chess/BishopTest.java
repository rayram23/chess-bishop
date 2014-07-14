package chess;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * This unit test exercises the Bishop class
 */
public class BishopTest {

    private Bishop bishop;
    private Position start;

    @Before
    public void setUp() {
        bishop = new Bishop();
        start = new Position("d4");
    }

    @Test
    public void testNextPositionsNotNull() throws Exception {
        assertNotNull("The set of next positions can never be null", bishop.getNextPositions(start));
    }
    @Test
    public void testCantGoFartherNorthEast(){
    	Position maxNE = new Position(Position.MAX_COLUMN,Position.MAX_ROW);
    	Bishop b  = new Bishop();
    	Set<Position> shouldBeEmpty = b.getNextPositions(maxNE);
    	assertNotNull(shouldBeEmpty);
    	assertTrue(shouldBeEmpty.isEmpty());
    	
    }

}
