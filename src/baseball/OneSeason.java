package baseball;
import java.io.PrintWriter;
import java.util.Scanner;


public class OneSeason
{
	/**
	 * Class that contains the node for one season
	 */
	
	private String teamName;
	private String seasonName;
	private int seasonYear;
	private String gameSaveFile;
	
	/**
	 * Constructors for OneSeason
	 */
	public OneSeason ()
	{
		teamName = "";
		seasonName = "";
		seasonYear = 0;
		gameSaveFile = teamName + "_" + seasonName + "_" + seasonYear + ".txt";//will be used to create a game 
																			   //file to store stats for each season
	}
	
	public OneSeason (String team, String season, int year)
	{
		teamName = team;
		seasonName = season;
		seasonYear = year;
		gameSaveFile = teamName + "_" + seasonName + "_" + seasonYear + ".txt";
	}
	
	//read item from textfile
	public void readSeason (Scanner read)
	{
		teamName = read.nextLine();
		seasonName = read.nextLine();
		seasonYear = read.nextInt();
		read.nextLine();//resets the reader after reading the int
	}
	
	//write item to textfile
	public void writeSeason (PrintWriter textStream)
	{
		textStream.println(getTeamName());
		textStream.println(getTeamName());
		textStream.println(getSeasonYear());
	}

	//to String method
	public String toString ()
	{
		return (teamName + ", " + seasonName + " " + seasonYear + "\n");
	}
	
	
	//getters and setters
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public int getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(int seasonYear) {
		this.seasonYear = seasonYear;
	}

	public String getGameSaveFile() {
		return gameSaveFile;
	}

	public void setGameSaveFile(String gameSaveFile) {
		this.gameSaveFile = gameSaveFile;
	}
	
	
	
	
}
