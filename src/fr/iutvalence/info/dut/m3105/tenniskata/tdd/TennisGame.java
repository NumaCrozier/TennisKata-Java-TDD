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
		
		if (this.scoreServer == this.scoreReceiver)
			score += "-all";
		else {
			switch(this.scoreReceiver) {
			case 0: score += "-love"; break;
			case 1: score += "-fifteen"; break;
			case 2: score += "-thirty"; break;
			case 3: score += "-forty"; break;
			case 4: score += "advantage out"; break;
			}
		}			
		
		return score;
	}

	public void serverScores() {
		this.scoreServer++;		
	}

	public void receiverScore() {
		this.scoreReceiver++;
	}
}
