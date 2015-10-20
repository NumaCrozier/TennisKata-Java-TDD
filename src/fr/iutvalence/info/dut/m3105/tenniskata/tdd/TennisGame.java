package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private int scoreServer;
	private int scoreReceiver;
	
	public String getScore() {
		String score = "";
		
		switch(this.scoreServer) {
		case 0: score = "love"; break;
		case 1: score = "fifteen"; break;
		case 2: score = "thirty"; break;
		case 3: score = "forty"; break;
		case 4: score = "advantage in"; break;
		}
		
		// NON FINI
		if (this.scoreReceiver == this.scoreServer)
			score += "-all";
		
		
		if (this.scoreServer == 0 && this.scoreReceiver == 0)
			score = "love-all";
		if (this.scoreServer == 1 && this.scoreReceiver == 0)
			score = "fifteen-love";
		if (this.scoreServer == 0 && this.scoreReceiver == 1)
			score = "love-fifteen";
		
		
		
		return score;
	}

	public void serverScores() {
		this.scoreServer++;		
	}

	public void receiverScore() {
		this.scoreReceiver++;
	}
}
