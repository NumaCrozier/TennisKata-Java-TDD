package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private int scorePlayer1;
	private int scorePlayer2;
	
	public String getScore() {
		String score = "";
		if (this.scorePlayer1 == 0 && this.scorePlayer2 == 0)
			score = "love-all";
		if (this.scorePlayer1 == 1 && this.scorePlayer2 == 0)
			score = "fifteen-love";
		if (this.scorePlayer1 == 0 && this.scorePlayer2 == 1)
			score = "love-fifteen";
		return score;
	}
	
	public void addPointServer() {
		this.scorePlayer1++;
	}
	
	public void addPointOpponent() {
		this.scorePlayer2++;
	}
}
