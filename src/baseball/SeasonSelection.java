package baseball;
import java.io.FileWriter;  
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class SeasonSelection extends GameSelection
{
	/**
	 * Class to create a new season for stat tracking
	 * @author yeotaJMU
	 */
	
	private static ArrayList <OneSeason> allSeasons = new ArrayList<OneSeason>();
	private static final String seasonFile = "seasons.txt";
	
	public SeasonSelection ()
	{
		super();
	}
	
	/*
	 * Method to create a new season
	 */
	public void createTheSeason (OneSeason seasonForStats)
	{
		appendToSeasonFile(seasonForStats);//add the new season to the text file
		allSeasons = fillArray();//set arraylist to the filled array
	}
		
	/*
	 * Method to select a season to load
	 */
	public ArrayList<OneSeason> selectSeasonToLoad ()
	{
		allSeasons = fillArray();//fill the array
		return allSeasons;
	}
	
	//static helping methods
	/*
	 * helper method to append the season info to text file
	 */
	private static void appendToSeasonFile(OneSeason o)
	{
		try {
			PrintWriter outStream = new PrintWriter(new FileWriter(seasonFile, true));//create new outstream with filename
			outStream.println(o.getTeamName());
			outStream.println(o.getSeasonName());
			outStream.println(o.getSeasonYear());
			outStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Helper method to update arraylist when file is changed
	 */
	private static ArrayList<OneSeason> fillArray ()
	{
		allSeasons.clear();
		Scanner fileToScan = TextFileIO.createTextRead(seasonFile);//create text read for file
		while (fileToScan.hasNextLine())//read file until no new lines
		{
			OneSeason o = new OneSeason();
			o.readSeason(fileToScan);
			allSeasons.add(o);//add each read OneSeason to arraylist
		}
		return allSeasons;
	}

	
	//getters and setters
	public static ArrayList<OneSeason> getAllSeasons() {
		return allSeasons;
	}

	public static void setAllSeasons(ArrayList<OneSeason> allSeasons) {
		SeasonSelection.allSeasons = allSeasons;
	}

	public static String getSavefile() {
		return seasonFile;
	}
}
