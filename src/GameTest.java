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
		game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(0));
	}
	
	@Test
	public void canScoreGameOfOnes() {
		game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
		assertThat(game.score(), is(20));
	}
	@Test
	public void canScoreStrikeFollowedByThreeThenThree() {
		game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(22));
	}
	
	
	  
}
