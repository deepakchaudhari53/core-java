package cricket;

public enum Score {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), OUT(-1);
	
	private Integer score;
	private Score(Integer score){
		this.score = score;
	}
	public Integer getScore(){
		return this.score;
	}
}
