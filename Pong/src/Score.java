
public class Score {
	
	int playerScore;
	int cpuScore;
	
	public Score() {
		playerScore=0;
		cpuScore=0;
	}
	
	public void addPlayerPoint() {
		playerScore++;
	}
	
	public void addCpuPoint() {
		cpuScore++;
	}
	
	public String playerScore() {
		return playerScore+"";
	}
	public String cpuScore() {
		return cpuScore+"";
	}
	
}
