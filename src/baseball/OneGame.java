package baseball;
import java.io.PrintWriter;
import java.util.Scanner;


public class OneGame extends OneSeason
{
	/**
	 * Class defines One Game 
	 * @author yeotaJMU 
	 */
	
	private int gameNumber;
	private String gameDate;
	private int plateAppearances, walks, HBPs, totalHits, battedOutsKsFCOrError, singles, doubles, triples, homeRuns, 
		strikeoutSwinging, strikeoutLooking, sacFly, sacBunt, lineDrive, flyBall, RBIs, runsScored, stolenBases;
	
	//constructors
	public OneGame ()
	{
		super();
		gameNumber = 0;
		gameDate = "";
		plateAppearances = 0;
		walks = 0;
		HBPs = 0;
		totalHits = 0;
		battedOutsKsFCOrError = 0;
		singles = 0;
		doubles = 0;
		triples = 0;
		homeRuns = 0;
		strikeoutSwinging = 0;
		strikeoutLooking = 0;
		sacFly = 0;
		sacBunt = 0;
		lineDrive = 0;
		flyBall = 0;
		RBIs = 0;
		runsScored = 0;
		stolenBases = 0;
		
	}
	
	public OneGame (int number, String date)
	{
		super();
		setGameNumber(number);
		setGameDate(date);
	}
	
	public OneGame (String date, int PAs, int BBs, int hbp, int hits, int outs, 
			int oneB, int twoB, int threeB, int hrs, int swingingK, int lookingK, 
			int sacF, int sacB, int lineD, int flyB, int RBI, int runs, int sb)
			{
				gameDate = date;
				plateAppearances = PAs;
				walks = BBs;
				HBPs = hbp;
				totalHits = hits;
				battedOutsKsFCOrError = outs;
				singles = oneB;
				doubles = twoB;
				triples = threeB;
				homeRuns = hrs;
				strikeoutSwinging = swingingK;
				strikeoutLooking= lookingK;
				sacFly = sacF;
				sacBunt = sacB;
				lineDrive = lineD;
				flyBall = flyB;
				RBIs = RBI;
				runsScored = runs;
				stolenBases = sb;				
			}

	/**
	 * method to read the game data from text file
	 */
	public void readGame (Scanner read)
	{
		gameNumber = read.nextInt();
		read.nextLine();//set to next line after reading int
		gameDate = read.nextLine();
		plateAppearances = read.nextInt();
		walks = read.nextInt();
		HBPs = read.nextInt();
		totalHits = read.nextInt();
		battedOutsKsFCOrError = read.nextInt();
		singles = read.nextInt();
		doubles = read.nextInt();
		triples = read.nextInt();
		homeRuns = read.nextInt();
		strikeoutSwinging = read.nextInt();
		strikeoutLooking = read.nextInt();
		sacFly = read.nextInt();
		sacBunt = read.nextInt();
		lineDrive = read.nextInt();
		flyBall = read.nextInt();
		RBIs = read.nextInt();
		runsScored = read.nextInt();
		stolenBases = read.nextInt();
		read.nextLine();
	}
	
	/**
	 * method to write the game data to the text file
	 */
	public void writeGame (PrintWriter textStream)
	{
		textStream.println(gameNumber);
		textStream.println(gameDate);
		textStream.println(plateAppearances);
		textStream.println(walks);
		textStream.println(HBPs);
		textStream.println(totalHits);
		textStream.println(battedOutsKsFCOrError);
		textStream.println(singles);
		textStream.println(doubles);
		textStream.println(triples);
		textStream.println(homeRuns);
		textStream.println(strikeoutSwinging);
		textStream.println(strikeoutLooking);
		textStream.println(sacFly);
		textStream.println(sacBunt);
		textStream.println(lineDrive);
		textStream.println(flyBall);
		textStream.println(RBIs);
		textStream.println(runsScored);
		textStream.println(stolenBases);
	}
	
	/**
	 * method to print a string
	 * @return 
	 */
	public String toString ()
	{
		return ("Game Number " + gameNumber + ", " + gameDate + "\n"
				+ "Plate Appearances: " + plateAppearances + "\n"
				+ "Walks: " + walks + "\n"
				+ "HBPs: " + HBPs + "\n"
				+ "Total Hits: " + totalHits + "\n"
				+ "Outs/Fielder's Choice/Errors: " + battedOutsKsFCOrError + "\n"
				+ "Singles: " + singles + "\n"
				+ "Doubles: " + doubles + "\n"
				+ "Triples: " + triples + "\n"
				+ "Home Runs: " + homeRuns + "\n"
				+ "Strikeouts Swinging: " + strikeoutSwinging + "\n"
				+ "Strikeouts Looking: " + strikeoutLooking + "\n"
				+ "Sac Fly: " + sacFly + "\n"
				+ "Sac Bunts: " + sacBunt + "\n"
				+ "Line Drives: " + lineDrive + "\n"
				+ "Fly Balls: " + flyBall + "\n"
				+ "RBIs: " + RBIs + "\n"
				+ "Runs: " + runsScored + "\n"
				+ "Stolen Bases: " + stolenBases + "\n");
	
	}
	
	//getters and setters
	public int getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}

	public String getGameDate() {
		return gameDate;
	}

	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}

	public int getPlateAppearances() {
		return plateAppearances;
	}

	public void setPlateAppearances(int plateAppearances) {
		this.plateAppearances = plateAppearances;
	}

	public int getWalks() {
		return walks;
	}

	public void setWalks(int walks) {
		this.walks = walks;
	}

	public int getHBPs() {
		return HBPs;
	}

	public void setHBPs(int hBPs) {
		HBPs = hBPs;
	}

	public int getTotalHits() {
		return totalHits;
	}

	public void setTotalHits(int totalHits) {
		this.totalHits = totalHits;
	}

	public int getOutFCOrError() {
		return battedOutsKsFCOrError;
	}

	public void setOutFCOrError(int outFCOrError) {
		this.battedOutsKsFCOrError = outFCOrError;
	}

	public int getSingles() {
		return singles;
	}

	public void setSingles(int singles) {
		this.singles = singles;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public int getStrikeoutSwinging() {
		return strikeoutSwinging;
	}

	public void setStrikeoutSwinging(int strikeoutSwinging) {
		this.strikeoutSwinging = strikeoutSwinging;
	}

	public int getStrikeoutLooking() {
		return strikeoutLooking;
	}

	public void setStrikeoutLooking(int strikeoutLooking) {
		this.strikeoutLooking = strikeoutLooking;
	}

	public int getSacFly() {
		return sacFly;
	}

	public void setSacFly(int sacFly) {
		this.sacFly = sacFly;
	}

	public int getSacBunt() {
		return sacBunt;
	}

	public void setSacBunt(int sacBunt) {
		this.sacBunt = sacBunt;
	}

	public int getLineDrive() {
		return lineDrive;
	}

	public void setLineDrive(int lineDrive) {
		this.lineDrive = lineDrive;
	}

	public int getFlyBall() {
		return flyBall;
	}

	public void setFlyBall(int flyBall) {
		this.flyBall = flyBall;
	}

	public int getRBIs() {
		return RBIs;
	}

	public void setRBIs(int rBIs) {
		RBIs = rBIs;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getStolenBases() {
		return stolenBases;
	}

	public void setStolenBases(int stolenBases) {
		this.stolenBases = stolenBases;
	}
}
