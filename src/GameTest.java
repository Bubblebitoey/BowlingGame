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
		int times = 20;
		int pinsDown = 0;
		assertThat(game.score(), is(0));
	}
	
	@Test
		public void camScoreGameOfOnes() {
			for (int i = 0; i < 20; i++) {
				game.roll(1);
			}
			assertThat(game.score(), is(20));
		}
		
	private void roll(int times, int pinsDown) {
		for (int i = 0; i < times; i++) {
			game.roll(pinsDown);
		}
	}
	
}
