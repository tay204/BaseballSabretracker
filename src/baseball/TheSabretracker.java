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
	 * Uses helper metod fillGamesInTheSeasonArray();
	 */
	public void enterGameStats (String date, int PAs, int BBs, int hbp, int hits, int outs, 
			int oneB, int twoB, int threeB, int hrs, int swingingK, int lookingK, 
			int sacF, int sacB, int lineD, int flyB, int RBI, int runs, int sb)
	{
		GameSelection g = new GameSelection();
		OneGame gameForStats = new OneGame(date, PAs, BBs, hbp, hits, outs, oneB, twoB, threeB,
				hrs, swingingK, lookingK, sacF, sacB, lineD, flyB, RBI, runs, sb);
		//System.out.println("enterGameStats: " + currentSeason.toString());
		g.addStatsForGame(currentSeason, gameForStats);
		gamesInTheSeason = fillGamesInTheSeasonArray(currentSeason);//clear and refill array to update
	}
	
	/*
	 * Method will fill the JComboBox with the season choices
	 */
	public ArrayList<OneSeason> fillSeasonToLoadComboBox ()
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
		gamesInTheSeason.clear(); //clear the array to refill
		Scanner readFile = TextFileIO.createTextRead(o.getGameSaveFile());
		while(readFile.hasNextLine())
		{
			OneGame og = new OneGame(); //add one games info each iteration
			og.readGame(readFile);
			gamesInTheSeason.add(og);
		}
		//System.out.println("LOADTEST:\n" + gamesInTheSeason.toString());
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
	
	/*
	 * Method to compute season total stats
	 * Uses static method computeSeasonTotals() to collect aggregate stats
	 * Uses static method calculateStats() to calculate the final stats
	 */
	public ComputeStats compileSeasonStats ()
	{
		ComputeStats finalStats = new ComputeStats();
		OneGame seasonTotals = new OneGame();
		seasonTotals = computeSeasonTotals(gamesInTheSeason);
		System.out.println("SEASON TOTALS:\n" + seasonTotals.toString() + "\n");
		finalStats = calculateStats(seasonTotals);
		System.out.println("FINAL STATS:\n" + finalStats.toString());
		return finalStats;
	}
	
	/*
	 * Method to fill the combo box for edit game in GUI
	 */
	public ArrayList<String> fillGameToEditComboBox ()
	{
		ArrayList<String> gameNumAndDate = new ArrayList<String>();
		gamesInTheSeason.clear(); //clear the array to refill and update
		String fileToRead = currentSeason.getGameSaveFile();
		Scanner readFile = TextFileIO.createTextRead(fileToRead);
		while (readFile.hasNextLine()) //read all the games from file
			{
				OneGame og = new OneGame();
				String comboBoxDisplay; //create new string which we will add to gameNumAndDate
				og.readGame(readFile);
				gamesInTheSeason.add(og);
				comboBoxDisplay = "Game " + og.getGameNumber() + ", " + og.getGameDate(); 
				gameNumAndDate.add(comboBoxDisplay);
			}
		return gameNumAndDate;
	}
	/*
	 * Method to edit game stats
	 */
	public OneGame editStatsOfGame (int gameNum)
	{
		OneGame gameToEdit = new OneGame();
		for (OneGame og: gamesInTheSeason)
		{
			if (gameNum == og.getGameNumber())
			{
				gameToEdit = og;
				break;
			}
		}
		System.out.println("GAME TO EDIT:\n" + gameToEdit.toString());
		return gameToEdit;
	}
	
	/*
	 * Method to update the game stats
	 * Will take in the updated stats from GUI
	 * Will update the save file by re-writing
	 */
	public void updateGameStats (OneGame update)
	{
		System.out.println("UPDATED GAME:\n" + update.toString());
		//need to make all the GUI labels and entries separate
	}
	
	/*
	 * Helper method to add all stats to get season totals
	 */
	private OneGame computeSeasonTotals(ArrayList<OneGame> allGames)
	{
		//int count = 0;
		OneGame total = new OneGame();
		for (OneGame og: gamesInTheSeason)
		{
			//we will need to add the new stats on each iteration
			//set the number equal to the number + the new iteration
			total.setPlateAppearances(total.getPlateAppearances() + og.getPlateAppearances());
			total.setWalks(total.getWalks() + og.getWalks());
			total.setHBPs(total.getHBPs() + og.getHBPs());
			total.setTotalHits(total.getTotalHits() + og.getTotalHits());
			total.setOutFCOrError(total.getOutFCOrError() + og.getOutFCOrError());
			total.setSingles(total.getSingles() + og.getSingles());
			total.setDoubles(total.getDoubles() + og.getDoubles());
			total.setTriples(total.getTriples() + og.getTriples());
			total.setHomeRuns(total.getHomeRuns() + og.getHomeRuns());
			total.setStrikeoutSwinging(total.getStrikeoutSwinging() + og.getStrikeoutSwinging());
			total.setStrikeoutLooking(total.getStrikeoutLooking() + og.getStrikeoutLooking());
			total.setSacFly(total.getSacFly() + og.getSacFly());
			total.setSacBunt(total.getSacBunt() + og.getSacBunt());
			total.setLineDrive(total.getLineDrive() + og.getLineDrive());
			total.setFlyBall(total.getFlyBall() + og.getFlyBall());
			total.setRBIs(total.getRBIs() + og.getRBIs());
			total.setRunsScored(total.getRunsScored() + og.getRunsScored());
			total.setStolenBases(total.getStolenBases() + og.getStolenBases());
			//count++;
			//System.out.println("RUN #" + count + "\n" + total.toString());
		}
		//System.out.println("Season total check:\n" + total.toString());
		return total;
	}
	
	/*
	 * Helper method to calculate final overall stats
	 */
	private ComputeStats calculateStats (OneGame o)
	{
		ComputeStats c = new ComputeStats();
		//set stats
		//singluar total stats set directly
		//other stats set via methods
		c.setStatPAs(o.getPlateAppearances());
		int tempABs = c.computeOfficialAtBats(o.getPlateAppearances(), o.getWalks(), 
				o.getHBPs(), o.getSacFly(), o.getSacBunt());
		c.setStatABs(tempABs);
		c.setStatRuns(o.getRunsScored());
		c.setStatHits(o.getTotalHits());
		c.setStat2B(o.getDoubles());
		c.setStat3B(o.getTriples());
		c.setStatHR(o.getHomeRuns());
		c.setStatRBI(o.getRBIs());
		c.setStatSB(o.getStolenBases());
		c.setStatBB(o.getWalks());
		int tempK = c.computeTotalStrikeouts(o.getStrikeoutSwinging(), o.getStrikeoutLooking());
		c.setStatTotalK(tempK);
		c.setStatLookingK(o.getStrikeoutLooking());
		c.setStatSwingingK(o.getStrikeoutSwinging());
		double tempBA = c.computeBattingAverage(tempABs, o.getTotalHits());
		c.setStatBA(tempBA);
		double tempOBP = c.computeOnBasePercentage(tempABs, o.getWalks(), 
				o.getHBPs(), o.getTotalHits(), o.getSacFly());
		c.setStatOBP(tempOBP);
		int tempTB = c.computeTotalBases(o.getSingles(), o.getDoubles(), 
				o.getTriples(), o.getHomeRuns());
		c.setStatTB(tempTB);
		double tempSLG = c.computeSluggingPercentage(tempTB, tempABs);
		c.setStatSLG(tempSLG);
		double tempOPS = c.computeOPS(tempOBP, tempSLG);
		c.setStatOPS(tempOPS);
		c.setStatHBP(o.getHBPs());
		c.setStatSacB(o.getSacBunt());
		c.setStatSacF(o.getSacFly());
		double tempBABIP = c.computeBattingAvgOnBallsInPlay(o.getTotalHits(), 
				o.getHomeRuns(), tempK, tempABs, o.getSacFly());
		c.setStatBABIP(tempBABIP);
		double tempLDPer = c.computeLineDrivePercentage(o.getLineDrive(), o.getOutFCOrError(), 
				o.getTotalHits());
		c.setStatLDPer(tempLDPer);
		double tempFBPer = c.computeFlyBallPercentage(o.getFlyBall(), 
				o.getOutFCOrError(), o.getTotalHits());
		c.setStatFBPer(tempFBPer);
		double tempGBPer = c.computeGroundBallPercentage(tempLDPer, tempFBPer);
		c.setStatGBPer(tempGBPer);
		double tempBBPer = c.computeWalkPercentage(o.getWalks(), o.getPlateAppearances());
		c.setStatBBPer(tempBBPer);
		double tempKPer = c.computeStrikeoutPercentage(tempK, o.getPlateAppearances());
		c.setStatKPer(tempKPer);
		double tempHRPerFB = c.computeHRPerFlyBallPercentage(o.getHomeRuns(), o.getFlyBall());
		c.setStatHRPerFB(tempHRPerFB);
		return c;
	}
	
	/*
	 * Helper method to fill array
	 */
	private ArrayList<OneGame> fillGamesInTheSeasonArray (OneSeason o)
	{
		gamesInTheSeason.clear(); //clear the array to refill
		Scanner readFile = TextFileIO.createTextRead(o.getGameSaveFile());
		while(readFile.hasNextLine())
		{
			OneGame og = new OneGame(); //add one games info each iteration
			og.readGame(readFile);
			gamesInTheSeason.add(og);
		}
		return gamesInTheSeason;
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
