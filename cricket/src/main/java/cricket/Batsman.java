package cricket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Batsman {

	private String name;
	
	//internal variables
	//Maintain an array of size 100. it will contain runs as per batsman configuration.
	List<Score> scoringProbability= new ArrayList<Score>(100);
	Random random = new Random();
	
	
	public Batsman(String name, Map<Score, Integer> scoringProbability) {
		//fill up the scoring array.
		for(Score key : scoringProbability.keySet()){
			for(int i = 0; i < scoringProbability.get(key); i++){
				this.scoringProbability.add(key);
			}
		}
		this.name = name;
	}
	
	public Score faceBall(){
		//random 0 - 99 - read from array and return.
		//the array already has the scores in the ratio of the defined probability.
		return scoringProbability.get(random.nextInt(100));
	}
	
	public String getName() {
		return name;
	}
}
