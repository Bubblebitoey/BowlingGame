
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class GameTest {
	
//	@Test
//	public void canMakeGame() {
//		new Game();
//	}
	
	@Test
		public void canRollBall() {
			Game game = new Game();
			game.roll(0);
		}
		
	@Test
	public void canScoreCutterGame() {
		Game game = new Game();
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertThat(game.score(), is(0));
	}
}
