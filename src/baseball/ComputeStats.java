package baseball;

import java.text.DecimalFormat;

public class ComputeStats 
{
	/**
	 * Class to control the math to compute baseball stats
	 * Methods will compute each statistic, carrying in stats from TheSabretracker
	 * @author yeotaJMU
	 */
	
	private int statGamesPlayed, statPAs, statABs, statRuns, statHits, stat2B, stat3B,
		statHR, statRBI, statSB, statBB, statTotalK, statLookingK, 
		statSwingingK, statTB, statHBP, statSacB, statSacF;
	private double statBA, statOBP, statSLG, statOPS, statBABIP, statLDPer, 
		statFBPer, statGBPer, statBBPer, statKPer, statHRPerFB;
	DecimalFormat d = new DecimalFormat(".000"); //will be used to account for 3 digit standard
	
	//constructors
	public ComputeStats ()
	{
		setStatGamesPlayed(0);
		statPAs = 0;
		statABs = 0;
		statRuns = 0;
		statHits = 0;
		stat2B = 0;
		stat3B = 0;
		statHR = 0;
		statRBI = 0;
		statSB = 0;
		statBB = 0;
		statTotalK = 0;
		statLookingK = 0;
		statSwingingK = 0;
		statBA = 0;
		statOBP = 0;
		statSLG = 0;
		statOPS = 0;
		statTB = 0;
		statHBP = 0;
		statSacB = 0;
		statSacF = 0;
		statBABIP = 0;
		statLDPer = 0;
		statFBPer = 0;
		statGBPer = 0;
		statBBPer = 0;
		statKPer = 0;
		statHRPerFB = 0;
	}

	/*
	 * Method to compute official At-bats
	 */
	public Integer computeOfficialAtBats (int PAs, int BBs, int HBPs, int sacF, int sacB)
	{
		//at-bats are calculated by PAs less walks, HBPS, sac flys and sac bunts 
		statABs = PAs - (BBs + HBPs + sacF + sacB);
		return statABs;
	}
	
	/*
	 * Method to compute total Ks
	 */
	public Integer computeTotalStrikeouts (int swingingK, int lookingK)
	{
		//total Ks are calculated with swinging and looking Ks combined
		statTotalK = swingingK + lookingK;
		return statTotalK;
	}
	
	/*
	 * Method to compute total bases
	 */
	public Integer computeTotalBases (int oneB, int twoB, int threeB, int hr)
	{
		//total bases are calculated by adding up all bases from hits
		statTB = oneB + (2 * twoB) + (3 * threeB) + (4 * hr);
		return statTB;
	}
	
	/*
	 * Method to compute batting average
	 */
	public double computeBattingAverage (int ABs, int totalHits)
	{
		//batting avg is total hits per at bats
		statBA = (double) totalHits / (double) ABs;
		return statBA;
	}
	
	/*
	 * Method to compute on base percentage
	 */
	public double computeOnBasePercentage (int ABs, int BBs, int HBPs, int totalHits, int sacF)
	{
		//OBP is hits, walks, and HBPs per ABs, BBs, hits, HBPs, and sac flies
		statOBP = (double) (BBs + HBPs + totalHits) / (double) (ABs + BBs + HBPs + sacF);
		return statOBP;
	}
	
	/*
	 * Method to compute slugging percentage
	 */
	public double computeSluggingPercentage (int totalBases, int ABs)
	{
		//slugging is total bases over at bats
		statSLG = (double) totalBases / (double) ABs;
		return statSLG;
	}
	
	/*
	 * Method to compute OPS
	 */
	public double computeOPS (double obp, double slg)
	{
		//OPS is slugging plus on base percentage
		statOPS = obp + slg;
		return statOPS;
	}
	
	/*
	 * Method to compute BABIP
	 */
	public double computeBattingAvgOnBallsInPlay (int totalHits, int hr, int totalK, int ABs, int sacF)
	{
		//batting avg on balls in play is hits less home runs per at-bats, Ks, hr, and sac fly
		statBABIP = (double) (totalHits - hr) / (double) (ABs - totalK - hr + sacF);
		return statBABIP;
	}
	
	/*
	 * Method to compute line drive percentage
	 */
	public double computeLineDrivePercentage (int ld, int outs, int totalHits)
	{
		//line drive percentage is the line drives per balls in play - outs and hits
		statLDPer = (double) ld / (double) (outs + totalHits);
		return statLDPer;
	}
	
	/*
	 * Method to compute fly ball percentage
	 */
	public double computeFlyBallPercentage (int fb, int outs, int totalHits)
	{
		//fly ball percentage is the fly balls per balls in play - outs and hits
		statFBPer = (double) fb / (double) (outs + totalHits);
		return statFBPer;
	}
	
	/*
	 * Method to compute ground ball percentage
	 */
	public double computeGroundBallPercentage (double ldPer, double fbPer)
	{
		//ground ball percentage is the ground balls per balls in play
		//gbPer, fbPer, and ldPer add up to 100%
		statGBPer = (double) 1 - (double) (ldPer + fbPer);
		return statGBPer;
	}
	
	/*
	 * Method to compute walk percentage
	 */
	public double computeWalkPercentage (int BBs, int PAs)
	{
		//walk percentage is BBs per plate appearances
		statBBPer = (double) BBs / (double) PAs;
		return statBBPer;
	}
	
	/*
	 * Method to compute strikeout percentage
	 */
	public double computeStrikeoutPercentage (int totalK, int PAs)
	{
		//K percentage is Ks per plate appearances
		statKPer = (double) totalK / (double) PAs;
		return statKPer;
	}
	
	/*
	 * Method to compute HRs per fly ball percentage
	 */
	public double computeHRPerFlyBallPercentage (int hrs, int flyB)
	{
		//HR per fly ball percentage is the home runs per fly bals
		statHRPerFB = (double) hrs / (double) flyB;
		return statHRPerFB;
	}
	
	/*
	 * To string method
	 */
	public String toString ()
	{
		return ("Games: " + statGamesPlayed + "\n"
				+ "PAs: " + statPAs + "\n"
				+ "ABs: " + statABs + "\n"
				+ "Runs: " + statRuns + "\n"
				+ "Hits: " + statHits + "\n"
				+ "2B: " + stat2B + "\n"
				+ "3B: " + stat3B + "\n"
				+ "HR: " + statHR + "\n"
				+ "RBIs: " + statRBI + "\n"
				+ "SBs: " + statSB + "\n"
				+ "BBs: " + statBB + "\n"
				+ "SOs: " + statTotalK + "\n"
				+ "Looking K: " + statLookingK + "\n"
				+ "Swinging K: " + statSwingingK + "\n"
				+ "AVG: " + d.format(statBA) + "\n"
				+ "OBP: " + d.format(statOBP) + "\n"
				+ "SLG: " + d.format(statSLG) + "\n"
				+ "OPS: " + d.format(statOPS) + "\n"
				+ "TB: " + statTB + "\n"
				+ "HBP: " + statHBP + "\n"
				+ "Sac Bunt: " + statSacB + "\n"
				+ "Sac Fly: " + statSacF + "\n"
				+ "BABIP: " + d.format(statBABIP) + "\n"
				+ "LD%: " + d.format(statLDPer) + "\n"
				+ "FB%: " + d.format(statFBPer) + "\n"
				+ "GB%: " + d.format(statGBPer) + "\n"
				+ "BB%: " + d.format(statBBPer) + "\n"
				+ "K%: " + d.format(statKPer) + "\n"
				+ "HRperFB% " + d.format(statHRPerFB) + "\n");
	}
	
	//getters and setters
	public int getStatGamesPlayed() {
		return statGamesPlayed;
	}

	public void setStatGamesPlayed(int statGamesPlayed) {
		this.statGamesPlayed = statGamesPlayed;
	}

	public int getStatPAs() {
		return statPAs;
	}

	public void setStatPAs(int statPAs) {
		this.statPAs = statPAs;
	}

	public int getStatABs() {
		return statABs;
	}

	public void setStatABs(int statABs) {
		this.statABs = statABs;
	}

	public int getStatRuns() {
		return statRuns;
	}

	public void setStatRuns(int statRuns) {
		this.statRuns = statRuns;
	}

	public int getStatHits() {
		return statHits;
	}

	public void setStatHits(int statHits) {
		this.statHits = statHits;
	}

	public int getStat2B() {
		return stat2B;
	}

	public void setStat2B(int stat2b) {
		stat2B = stat2b;
	}

	public int getStat3B() {
		return stat3B;
	}

	public void setStat3B(int stat3b) {
		stat3B = stat3b;
	}

	public int getStatHR() {
		return statHR;
	}

	public void setStatHR(int statHR) {
		this.statHR = statHR;
	}

	public int getStatRBI() {
		return statRBI;
	}

	public void setStatRBI(int statRBI) {
		this.statRBI = statRBI;
	}

	public int getStatSB() {
		return statSB;
	}

	public void setStatSB(int statSB) {
		this.statSB = statSB;
	}

	public int getStatBB() {
		return statBB;
	}

	public void setStatBB(int statBB) {
		this.statBB = statBB;
	}

	public int getStatTotalK() {
		return statTotalK;
	}

	public void setStatTotalK(int statTotalK) {
		this.statTotalK = statTotalK;
	}

	public int getStatLookingK() {
		return statLookingK;
	}

	public void setStatLookingK(int statLookingK) {
		this.statLookingK = statLookingK;
	}

	public int getStatSwingingK() {
		return statSwingingK;
	}

	public void setStatSwingingK(int statSwingingK) {
		this.statSwingingK = statSwingingK;
	}

	public int getStatTB() {
		return statTB;
	}

	public void setStatTB(int statTB) {
		this.statTB = statTB;
	}

	public int getStatHBP() {
		return statHBP;
	}

	public void setStatHBP(int statHBP) {
		this.statHBP = statHBP;
	}

	public int getStatSacB() {
		return statSacB;
	}

	public void setStatSacB(int statSacB) {
		this.statSacB = statSacB;
	}

	public int getStatSacF() {
		return statSacF;
	}

	public void setStatSacF(int statSacF) {
		this.statSacF = statSacF;
	}

	public double getStatBA() {
		return statBA;
	}

	public void setStatBA(double statBA) {
		this.statBA = statBA;
	}

	public double getStatOBP() {
		return statOBP;
	}

	public void setStatOBP(double statOBP) {
		this.statOBP = statOBP;
	}

	public double getStatSLG() {
		return statSLG;
	}

	public void setStatSLG(double statSLG) {
		this.statSLG = statSLG;
	}

	public double getStatOPS() {
		return statOPS;
	}

	public void setStatOPS(double statOPS) {
		this.statOPS = statOPS;
	}

	public double getStatBABIP() {
		return statBABIP;
	}

	public void setStatBABIP(double statBABIP) {
		this.statBABIP = statBABIP;
	}

	public double getStatLDPer() {
		return statLDPer;
	}

	public void setStatLDPer(double statLDPer) {
		this.statLDPer = statLDPer;
	}

	public double getStatFBPer() {
		return statFBPer;
	}

	public void setStatFBPer(double statFBPer) {
		this.statFBPer = statFBPer;
	}

	public double getStatGBPer() {
		return statGBPer;
	}

	public void setStatGBPer(double statGBPer) {
		this.statGBPer = statGBPer;
	}

	public double getStatBBPer() {
		return statBBPer;
	}

	public void setStatBBPer(double statBBPer) {
		this.statBBPer = statBBPer;
	}

	public double getStatKPer() {
		return statKPer;
	}

	public void setStatKPer(double statKPer) {
		this.statKPer = statKPer;
	}

	public double getStatHRPerFB() {
		return statHRPerFB;
	}

	public void setStatHRPerFB(double statHRPerFB) {
		this.statHRPerFB = statHRPerFB;
	}
	
	
}
