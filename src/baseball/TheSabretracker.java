package baseball;

import java.util.ArrayList;
import java.util.Scanner;


public class TheSabretracker extends SeasonSelection
{
	/**
	 * Class will be used by the GUI to help run the program
	 * @author yeotaJMU
	 */
	
	private OneSeason currentSeason; //the current season used by the GUI, can retrieve info
	private ArrayList<OneGame> gamesInTheSeason = new ArrayList<OneGame>();
	
	public TheSabretracker ()
	{
		super();
	}
	
	/*
	 * create the season
	 * sets the current season for use of other methods
	 */
	public void createANewSeason (OneSeason o)
	{
		setCurrentSeason(o);//set current season to use in other methods
		SeasonSelection s = new SeasonSelection ();
		s.createTheSeason(currentSeason);
	}
	
	/*
	 * Uses currentSeason and methods from game selection to add game 1
	 */
	public void addGameOne ()
	{
		GameSelection g = new GameSelection ();
		g.createGameOne(currentSeason);
	}
	
	/*
	 * Method to add the game stats
	 * Takes stats from GUI and will write to file
	 */
	public void enterGameStats (String date, int PAs, int BBs, int hits, int outs, 
			int oneB, int twoB, int threeB, int hrs, int swingingK, int lookingK, 
			int sacF, int sacB, int lineD, int flyB, int RBI, int runs, int sb)
	{
		GameSelection g = new GameSelection();
		OneGame gameForStats = new OneGame(date, PAs, BBs, hits, outs, oneB, twoB, threeB,
				hrs, swingingK, lookingK, sacF, sacB, lineD, flyB, RBI, runs, sb);
		System.out.println("enterGameStats: " + currentSeason.toString());
		g.addStatsForGame(currentSeason, gameForStats);
	}
	
	/*
	 * Method will fill the JComboBox with the season choices
	 */
	public ArrayList<OneSeason> fillComboBox ()
	{
		SeasonSelection s = new SeasonSelection();
		ArrayList<OneSeason> comboBoxChoices = new ArrayList<OneSeason>();
		comboBoxChoices = s.selectSeasonToLoad(); //will fill an array from file
		return comboBoxChoices;
	}
	
	/*
	 * Method will get the game info from loaded season
	 * will read the game files, and load into array list
	 */
	public void loadSeasonAndGameInfo (OneSeason o)
	{
		setCurrentSeason(o);
		System.out.println("current season: "+ currentSeason);
		OneGame og = new OneGame();
		Scanner scanFile = TextFileIO.createTextRead(o.getGameSaveFile());
		while(scanFile.hasNextLine())
		{
			og.readGame(scanFile);
			gamesInTheSeason.add(og);
		}
		System.out.println("loadtest:\n" + gamesInTheSeason.toString());
	}
	
	/*
	 * Method will find out the game number
	 * will write the new game number to file
	 */
	public void findGameNumber ()
	{
		gamesInTheSeason.clear(); //clear the array to refill
		String fileToRead = currentSeason.getGameSaveFile();
		Scanner readFile = TextFileIO.createTextRead(fileToRead);
		OneGame og = new OneGame();
		while (readFile.hasNextLine()) //read all the games from file
			{
				og.readGame(readFile);
				gamesInTheSeason.add(og);
			}
		int arraySize = gamesInTheSeason.size(); //get the size to get the latest game
		int tempGameNumber = gamesInTheSeason.get(arraySize-1).getGameNumber();//get game # of last element
		GameSelection gs = new GameSelection();
		gs.addOneToGameNumber(currentSeason, tempGameNumber);
	}
	
	//getters and setters
	public OneSeason getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(OneSeason currentSeason) {
		this.currentSeason = currentSeason;
	}

	public ArrayList<OneGame> getGamesInTheSeason() {
		return gamesInTheSeason;
	}

	public void setGamesInTheSeason(ArrayList<OneGame> gamesInTheSeason) {
		this.gamesInTheSeason = gamesInTheSeason;
	}

	
	
}
