import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	public BowlingGame testGame = new BowlingGame();
	

	@Test
	public void testAddFrame() throws BowlingException {
		String frames = testGame.addFrame();
		assertEquals("testAddFrame", frames);
	}

}
