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
		roll(20,0);
		assertThat(game.score(), is(0));
	}
	
	@Test
		public void camScoreGameOfOnes() {
			roll(20,1);
			assertThat(game.score(), is(20));
		}
		
	private void roll(int times, int pinsDown) {
		for (int i = 0; i < times; i++) {
			game.roll(pinsDown);
		}
	}
	
}
