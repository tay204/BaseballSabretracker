package baseball;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GameSelection 
{
	/**
	 * Class to create a new game
	 * @author yeotaJMU
	 */
	
	private static ArrayList<OneGame> allGames = new ArrayList<OneGame>();
	
	public void addOrEditGame (OneSeason o)
	{
		String choices [] = {"Add Game", "Edit Game"};//used in optionDialog
		int choice = JOptionPane.showOptionDialog(null, "Add a new game or edit existing game?", 
						"Add/Edit Game", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, 
						null, choices, 
						choices[0]//"Add Game"
								);
		if (choice == 0)
		{
			//createNewGame(o); //create a new game
		}
		else
			{
				//selectGameToLoad(); //select existing game to edit
			}
	}
	
	/*
	 * method to add a new game to the season
	 */
	public void createGameOne (OneSeason o)
	{
		OneGame og = new OneGame();
		og.setGameNumber(1);
		appendGameNumberToGameFile(o, og);
	}
	/*
	 * method will add one to game number and append the file
	 */
	public void addOneToGameNumber (OneSeason o, int gameNumber)
	{
		gameNumber++; //add one to gameNumber
		OneGame og = new OneGame();
		og.setGameNumber(gameNumber);
		appendGameNumberToGameFile(o, og);
	}
	
	/*
	 * will take in stats from GUI
	 * append the stats to the file
	 */
	public void addStatsForGame (OneSeason o, OneGame og)
	{
		appendStatsToGameFile(o, og);
	}
	
	//static helping methods
	/*
	 * method to append the game number to the game file
	 */
	private static void appendGameNumberToGameFile (OneSeason o, OneGame og)
	{
		try {
			PrintWriter outStream = new PrintWriter(new FileWriter(o.getGameSaveFile(), true));//create new outstream with filename
			outStream.println(og.getGameNumber());
			outStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * method to append stats to file
	 */
	private static void appendStatsToGameFile (OneSeason o, OneGame og)
	{
		try {
			PrintWriter outStream = new PrintWriter(new FileWriter(o.getGameSaveFile(), true));
			outStream.println(og.getGameDate());
			outStream.println(og.getPlateAppearances());
			outStream.println(og.getWalks());
			outStream.println(og.getHBPs());
			outStream.println(og.getTotalHits());
			outStream.println(og.getOutFCOrError());
			outStream.println(og.getSingles());
			outStream.println(og.getDoubles());
			outStream.println(og.getTriples());
			outStream.println(og.getHomeRuns());
			outStream.println(og.getStrikeoutSwinging());
			outStream.println(og.getStrikeoutLooking());
			outStream.println(og.getSacFly());
			outStream.println(og.getSacBunt());
			outStream.println(og.getLineDrive());
			outStream.println(og.getFlyBall());
			outStream.println(og.getRBIs());
			outStream.println(og.getRunsScored());
			outStream.println(og.getStolenBases());
			outStream.close();
		}catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
