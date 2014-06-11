package baseball;

public class ComputeStats 
{
	/**
	 * Class to control the math to compute baseball stats
	 * Methods will compute each statistic, carrying in stats from TheSabretracker
	 * @author yeotaJMU
	 */
	
	private int statPAs, statABs, statRuns, statHits, stat2B, stat3B,
		statHR, statRBI, statSB, statBB, statTotalK, statLookingK, 
		statSwingingK, statTB, statHBP, statSacB, statSacF;
	private double statBA, statOBP, statSLG, statOPS, statBABIP, statLDPer, 
		statFBPer, statBBPer, statKPer, statHRPerFB;
	
	//constructors
	public ComputeStats ()
	{
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
		statTB = oneB = (2 * twoB) + (3 * threeB) + (4 * hr);
		return statTB;
	}
	
	/*
	 * Method to compute batting average
	 */
	public double computeBattingAverage (int ABs, int totalHits)
	{
		//batting avg is total hits per at bats
		statBA = totalHits / ABs;
		return statBA;
	}
	
	
	//getters and setters
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
