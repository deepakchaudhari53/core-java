package cricket;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.junit.Test;

public class TestCricketGame {
	
	CricketGameController cricketGame = new CricketGameController();
	
	@Test
	public void testCricketGame(){
		//Setup
		Queue<Batsman> batsmen = new LinkedList<Batsman>();
		Map<Score, Integer> scoringProbability = new HashMap<Score, Integer>();
		scoringProbability.put(Score.SIX, 15);
		scoringProbability.put(Score.FIVE, 5);
		scoringProbability.put(Score.FOUR, 15);
		scoringProbability.put(Score.THREE, 15);
		scoringProbability.put(Score.TWO, 20);
		scoringProbability.put(Score.ONE, 25);
		scoringProbability.put(Score.OUT, 5);
		batsmen.add(new Batsman("Virat Kohli", scoringProbability));
		
		scoringProbability = new HashMap<Score, Integer>();
		scoringProbability.put(Score.SIX, 15);
		scoringProbability.put(Score.FIVE, 5);
		scoringProbability.put(Score.FOUR, 15);
		scoringProbability.put(Score.THREE, 15);
		scoringProbability.put(Score.TWO, 20);
		scoringProbability.put(Score.ONE, 25);
		scoringProbability.put(Score.OUT, 5);
		batsmen.add(new Batsman("Rohit Sharma", scoringProbability));
		
		scoringProbability = new HashMap<Score, Integer>();
		scoringProbability.put(Score.SIX, 30);
		scoringProbability.put(Score.FIVE, 0);
		scoringProbability.put(Score.FOUR, 30);
		scoringProbability.put(Score.THREE, 5);
		scoringProbability.put(Score.TWO, 5);
		scoringProbability.put(Score.ONE, 10);
		scoringProbability.put(Score.OUT, 20);
		batsmen.add(new Batsman("M. S. Dhoni", scoringProbability));
		
		cricketGame.playGame(batsmen, 40, 18);
	}
}
