package cricket;

import java.util.Queue;


public class CricketGameController {
	
	public void playGame(Queue<Batsman> batsmen, Integer runsNeeded, Integer ballsRemaining){
		
		Batsman striker = batsmen.poll();
		Batsman nonStriker = batsmen.poll();
		
		//no special coding for bowlers - assuming perfect bowler who bowls all legal balls.
		//we need at least 2 batsmen - otherwise game ends.
		while(ballsRemaining > 0 && runsNeeded > 0 && striker != null && nonStriker != null){
			
			//Striker faces the ball and we get the score based on probability.
			Score score = striker.faceBall();
			System.out.println(striker.getName() +" scored: "+score);
			if(Score.OUT.equals(score)){
				striker = batsmen.poll();
				continue;
			}
			
			runsNeeded -= score.getScore();
			ballsRemaining--;
			//rotate strike - when odd numbered runs are scored, or over changes.
			if(score.getScore()%2 == 1 || ballsRemaining%6 == 0){
				Batsman temp = striker;
				striker = nonStriker;
				nonStriker = temp;
			}
		}
		if(runsNeeded <= 0){
			System.out.println("Batting team wins");
		}else{
			System.out.println("Batting team loses");
		}
	}
}
