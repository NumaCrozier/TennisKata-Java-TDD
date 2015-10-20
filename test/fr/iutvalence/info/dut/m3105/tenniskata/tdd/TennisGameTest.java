package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame;
	
	@Before
	public void creationTennisGame()
	{
		tennisGame = new TennisGame();
	}
	
	@Test
	public void twoPlayersWithAScoreEqualToZeroMustReturnStringEqualsToLoveAll()
	{
		Assert.assertEquals(tennisGame.getScore(), "love-all");
	}
	
	@Test
	public void theServerWithFifteenAndTheOtherWithZeroMustReturnStringEqualsToFifteenLove()
	{
		tennisGame.serverScores();
		Assert.assertEquals(tennisGame.getScore(), "fifteen-love");		
	}
	
	@Test
	public void theServerWithZeroAndTheOtherWithFifteenMustReturnStringEqualsToLoveFifteen()
	{
		tennisGame.receiverScore();
		Assert.assertEquals(tennisGame.getScore(), "love-fifteen");
	}
}
