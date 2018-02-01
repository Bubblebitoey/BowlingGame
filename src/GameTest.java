import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;


public class GameTest {
	
	private Game game;
	
	@Before
	public void setUp() {
		game = new Game();
	}
		
	@Test
	public void canScoreCutterGame() {
		roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(0));
	}
	
	@Test
		public void canScoreGameOfOnes() {
			roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
			assertThat(game.score(), is(20));
		}
	
	@Test
	public void camScoreSpareFollowedByThree() {
		roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		game.roll(5);
		game.roll(5);
		game.roll(3);
		roll(17,0);
		assertThat(game.score(), is(16));
	}
		
	private void roll(int...rolls) {
		for (int pinsDown : rolls) {
			game.roll(pinsDown);
		}
	}
	
}
