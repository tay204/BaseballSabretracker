package baseball;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * GUI For Sabretracker
 * @author yeotaJMU
 */

public class SabretrackerGUI extends JPanel
{
	public class JBackgroundPanel extends JPanel //create class JBackgroundPanel to enable background img
	{
		  private BufferedImage img;
		 
		  public JBackgroundPanel() 
		  {
		    // load the background image
		    try {
		      img = ImageIO.read(new File("background.jpg"));
		    } catch(IOException e) {
		      e.printStackTrace();
		    }
		  }
		 
		  @Override //override graphics to draw the image
		  protected void paintComponent(Graphics g) 
		  {
		    super.paintComponent(g);
		    // paint the background image and scale it to fill the entire space
		    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		  }
		}
	
	//initialize JPanels
	JBackgroundPanel backgroundImage = new JBackgroundPanel();
	
	JPanel sabretrackerTitlePanel = new JPanel(); //title page
	JPanel titleQuestionPanel = new JPanel();
	JPanel seasonChoicePanel = new JPanel();
	JPanel teamNamePanel = new JPanel(); //new season page
	JPanel seasonSelectionPanel =  new JPanel();
	JPanel yearPanel = new JPanel();
	JPanel newSeasonSubmitButtonPanel = new JPanel();
	JPanel newSeasonAddGamePanel = new JPanel();
	JPanel loadSeasonPanel = new JPanel(); //load season page
	JPanel loadSeasonComboBoxPanel = new JPanel();
	JPanel addEditShowStatsPanel = new JPanel(); //add, edit, show stats page
	JPanel activeSeasonTitlePanel = new JPanel();
	JPanel addEditButtonPanel = new JPanel();
	JPanel showStatsPanel = new JPanel();
	JPanel addGameStatsPanel = new JPanel(); //games stats page
	JPanel gameDatePanel = new JPanel();
	JPanel plateAppearancesPanel = new JPanel();
	JPanel walksPanel = new JPanel();
	JPanel HBPsPanel = new JPanel();
	JPanel totalHitsPanel = new JPanel();
	JPanel outFCOrErrorPanel = new JPanel();
	JPanel singlesPanel = new JPanel();
	JPanel doublesPanel = new JPanel();
	JPanel triplesPanel = new JPanel();
	JPanel homeRunsPanel = new JPanel();
	JPanel strikeoutSwingingPanel = new JPanel();
	JPanel strikeoutLookingPanel = new JPanel();
	JPanel sacFlyPanel = new JPanel();
	JPanel sacBuntPanel = new JPanel();
	JPanel lineDrivePanel = new JPanel();
	JPanel flyBallPanel = new JPanel();
	JPanel RBIsPanel = new JPanel();
	JPanel runsScoredPanel = new JPanel();
	JPanel stolenBasesPanel = new JPanel();
	JPanel homeButtonPanel = new JPanel(); //home button always to be visible

	JLabel titleLabel = new JLabel(); //title page
	JLabel titleQuestionLabel = new JLabel();
	JLabel newSeasonLabel = new JLabel();
	JLabel loadSeasonLabel = new JLabel();
	JLabel teamNameLabel = new JLabel(); //new season page
	JLabel seasonSelectionLabel = new JLabel();
	JLabel yearLabel = new JLabel();
	JLabel newSeasonSubmitLabel = new JLabel();
	JLabel loadSeasonChoiceLabel = new JLabel(); //load season page
	JLabel activeSeasonTitleLabel = new JLabel(); //add edit stats page
	JLabel gameDateLabel = new JLabel(); //add stats page
	JLabel plateAppearancesLabel = new JLabel();
	JLabel walksLabel = new JLabel();
	JLabel HBPsLabel = new JLabel();
	JLabel totalHitsLabel = new JLabel();
	JLabel outFCOrErrorLabel = new JLabel();
	JLabel singlesLabel = new JLabel();
	JLabel doublesLabel = new JLabel();
	JLabel triplesLabel = new JLabel();
	JLabel homeRunsLabel = new JLabel();
	JLabel strikeoutSwingingLabel = new JLabel();
	JLabel strikeoutLookingLabel = new JLabel();
	JLabel sacFlyLabel = new JLabel();
	JLabel sacBuntLabel = new JLabel();
	JLabel lineDriveLabel = new JLabel();
	JLabel flyBallLabel = new JLabel();
	JLabel RBIsLabel = new JLabel();
	JLabel runsScoredLabel = new JLabel();
	JLabel stolenBasesLabel = new JLabel();

	JButton newSeasonButton = new JButton();
	JButton loadSeasonButton = new JButton();
	JButton newSeasonSubmitButton = new JButton();
	JButton newSeasonAddGameButton = new JButton();
	JButton addStatsSubmitButton = new JButton();
	JButton loadSeasonSubmitButton = new JButton();
	JButton addGameButton = new JButton();
	JButton editGameButton = new JButton();
	JButton showStatsButton = new JButton();
	JButton homeButton = new JButton();

	JTextField teamNameEntry = new JTextField(25);
	JTextField yearEntry = new JTextField(10);
	JTextField dateEntry = new JTextField(15); //add stats page
	JTextField plateAppearancesEntry = new JTextField(5);
	JTextField walksEntry = new JTextField(5);
	JTextField HBPsEntry = new JTextField(5);
	JTextField totalHitsEntry = new JTextField(5);
	JTextField outFCOrErrorEntry = new JTextField(5);
	JTextField singlesEntry = new JTextField(5);
	JTextField doublesEntry = new JTextField(5);
	JTextField triplesEntry = new JTextField(5);
	JTextField homeRunsEntry = new JTextField(5);
	JTextField strikeoutSwingingEntry = new JTextField(5);
	JTextField strikeoutLookingEntry = new JTextField(5);
	JTextField sacFlyEntry = new JTextField(5);
	JTextField sacBuntEntry = new JTextField(5);
	JTextField lineDriveEntry = new JTextField(5);
	JTextField flyBallEntry = new JTextField(5);
	JTextField RBIsEntry = new JTextField(5);
	JTextField runsScoredEntry = new JTextField(5);
	JTextField stolenBasesEntry = new JTextField(5);
	
	
	//set up combo box for seasons
	String seasons[] = {"Spring", "Summer", "Fall", "Winter"};
	JComboBox fourSeasons = new JComboBox(seasons);
	JComboBox seasonToLoad; //will fill box later
	


	public SabretrackerGUI()
	{
		//*** set panel layouts
		//*** panels could be LEFT, or RIGHT justified.
		sabretrackerTitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER)); //title page
		sabretrackerTitlePanel.setOpaque(false);
		titleQuestionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		titleQuestionPanel.setOpaque(false);
		seasonChoicePanel.setLayout(new FlowLayout(FlowLayout.CENTER));//season selection page
		seasonChoicePanel.setOpaque(false);
		teamNamePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		teamNamePanel.setOpaque(false);
		seasonSelectionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		seasonSelectionPanel.setOpaque(false);
		yearPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		yearPanel.setOpaque(false);
		newSeasonSubmitButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		newSeasonSubmitButtonPanel.setOpaque(false);
		newSeasonAddGamePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		newSeasonAddGamePanel.setOpaque(false);
		loadSeasonPanel.setLayout(new BoxLayout(loadSeasonPanel, BoxLayout.Y_AXIS)); //load season page
		loadSeasonPanel.setOpaque(false);
		loadSeasonComboBoxPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		loadSeasonComboBoxPanel.setOpaque(false);
		addEditShowStatsPanel.setLayout(new BoxLayout(addEditShowStatsPanel, BoxLayout.Y_AXIS)); //add edit stats page
		addEditShowStatsPanel.setAlignmentX(CENTER_ALIGNMENT);
		addEditShowStatsPanel.setOpaque(false);
		activeSeasonTitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		activeSeasonTitlePanel.setOpaque(false);
		addEditButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		addEditButtonPanel.setOpaque(false);
		showStatsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		showStatsPanel.setOpaque(false);
		addGameStatsPanel.setLayout(new BoxLayout(addGameStatsPanel, BoxLayout.Y_AXIS));//add stats page
		addGameStatsPanel.setOpaque(false);
		gameDatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		gameDatePanel.setOpaque(false);
		plateAppearancesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		plateAppearancesPanel.setOpaque(false);
		walksPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		walksPanel.setOpaque(false);
		HBPsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		HBPsPanel.setOpaque(false);
		totalHitsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		totalHitsPanel.setOpaque(false);
		outFCOrErrorPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		outFCOrErrorPanel.setOpaque(false);
		singlesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		singlesPanel.setOpaque(false);
		doublesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		doublesPanel.setOpaque(false);
		triplesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		triplesPanel.setOpaque(false);
		homeRunsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		homeRunsPanel.setOpaque(false);
		strikeoutSwingingPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		strikeoutSwingingPanel.setOpaque(false);
		strikeoutLookingPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		strikeoutLookingPanel.setOpaque(false);
		sacFlyPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		sacFlyPanel.setOpaque(false);
		sacBuntPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		sacBuntPanel.setOpaque(false);
		lineDrivePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		lineDrivePanel.setOpaque(false);
		flyBallPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		flyBallPanel.setOpaque(false);
		RBIsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		RBIsPanel.setOpaque(false);
		runsScoredPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		runsScoredPanel.setOpaque(false);
		stolenBasesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		stolenBasesPanel.setOpaque(false);
		homeButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		homeButtonPanel.setAlignmentY(BOTTOM_ALIGNMENT);
		homeButtonPanel.setBackground(Color.DARK_GRAY);		
		
		//various fonts
		Font titleFont = new Font("Stencil", Font.PLAIN, 45);
		Font bigFont = new Font("Helvetica Bold", Font.BOLD, 30);
		Font medFont = new Font("Helvetica Bold", Font.BOLD, 20);
		Font smallFont = new Font("Helvetica Bold", Font.BOLD, 15);
		
		//set up label appearances
		titleLabel.setFont(titleFont); //title page
		titleLabel.setForeground(Color.WHITE);
		titleQuestionLabel.setFont(bigFont);
		titleQuestionLabel.setForeground(Color.WHITE);
		teamNameLabel.setFont(medFont); //new season page
		teamNameLabel.setForeground(Color.WHITE);
		seasonSelectionLabel.setFont(medFont); 
		seasonSelectionLabel.setForeground(Color.WHITE);
		yearLabel.setFont(medFont);
		yearLabel.setForeground(Color.WHITE);
		loadSeasonChoiceLabel.setFont(bigFont); //load season page
		loadSeasonChoiceLabel.setForeground(Color.WHITE);
		activeSeasonTitleLabel.setFont(bigFont); //add edit stats page
		activeSeasonTitleLabel.setForeground(Color.WHITE);
		gameDateLabel.setFont(medFont); //add stats label
		gameDateLabel.setForeground(Color.WHITE);
		plateAppearancesLabel.setFont(medFont);
		plateAppearancesLabel.setForeground(Color.WHITE);
		walksLabel.setFont(medFont); 
		walksLabel.setForeground(Color.WHITE);
		HBPsLabel.setFont(medFont);
		HBPsLabel.setForeground(Color.WHITE);
		totalHitsLabel.setFont(medFont);
		totalHitsLabel.setForeground(Color.WHITE);
		outFCOrErrorLabel.setFont(medFont);
		outFCOrErrorLabel.setForeground(Color.WHITE);
		singlesLabel.setFont(medFont);
		singlesLabel.setForeground(Color.WHITE);
		doublesLabel.setFont(medFont);
		doublesLabel.setForeground(Color.WHITE);
		triplesLabel.setFont(medFont);
		triplesLabel.setForeground(Color.WHITE);
		homeRunsLabel.setFont(medFont);
		homeRunsLabel.setForeground(Color.WHITE);
		strikeoutSwingingLabel.setFont(medFont);
		strikeoutSwingingLabel.setForeground(Color.WHITE);
		strikeoutLookingLabel.setFont(medFont);
		strikeoutLookingLabel.setForeground(Color.WHITE);
		sacFlyLabel.setFont(medFont);
		sacFlyLabel.setForeground(Color.WHITE);
		sacBuntLabel.setFont(medFont);
		sacBuntLabel.setForeground(Color.WHITE);
		lineDriveLabel.setFont(medFont);
		lineDriveLabel.setForeground(Color.WHITE);
		flyBallLabel.setFont(medFont);
		flyBallLabel.setForeground(Color.WHITE);
		RBIsLabel.setFont(medFont);
		RBIsLabel.setForeground(Color.WHITE);
		runsScoredLabel.setFont(medFont);
		runsScoredLabel.setForeground(Color.WHITE);
		stolenBasesLabel.setFont(medFont);
		stolenBasesLabel.setForeground(Color.WHITE);
		
		//set label texts
		titleLabel.setText("BASEBALL SABRETRACKER"); //title page
		titleQuestionLabel.setText("Select a New Season or Load a Season:");
		teamNameLabel.setText("Enter the team name:");
		seasonSelectionLabel.setText("Select the season:"); //new season page
		yearLabel.setText("Enter the year:");
		loadSeasonChoiceLabel.setText("Select a Season to Load:"); //load season page
		gameDateLabel.setText("Enter the Game Date:"); //add stats page
		plateAppearancesLabel.setText("Plate Appearances:");
		walksLabel.setText("Walks:");
		HBPsLabel.setText("HBPs:");
		totalHitsLabel.setText("Total Hits:");
		outFCOrErrorLabel.setText("Outs/Fielder's Choice/Errors:");
		singlesLabel.setText("Singles:");
		doublesLabel.setText("Doubles:");
		triplesLabel.setText("Triples:");
		homeRunsLabel.setText("Home Runs:");
		strikeoutSwingingLabel.setText("Swinging K's:");
		strikeoutLookingLabel.setText("Looking K's:");
		sacFlyLabel.setText("Sac Fly's:");
		sacBuntLabel.setText("Sac Bunts:");
		lineDriveLabel.setText("Line Drives:");
		flyBallLabel.setText("Fly Balls:");
		RBIsLabel.setText("RBIs:");
		runsScoredLabel.setText("Runs:");
		stolenBasesLabel.setText("Stolen Bases:");
		
		
		
		//set up buttons
		newSeasonButton.setText(" New Season "); //title page
		newSeasonButton.setPreferredSize(new Dimension(250, 150));
		newSeasonButton.setFont(medFont);
		loadSeasonButton.setText(" Load Season ");
		loadSeasonButton.setPreferredSize(new Dimension(250, 150));
		loadSeasonButton.setFont(medFont);
		newSeasonSubmitButton.setText(" Submit "); //new season page
		newSeasonAddGameButton.setText(" Add Game ");
		newSeasonAddGameButton.setFont(medFont);
		newSeasonAddGameButton.setPreferredSize(new Dimension(250, 150));
		newSeasonAddGameButton.setFont(medFont);
		loadSeasonSubmitButton.setText(" Submit "); //load season page
		addGameButton.setText(" Add Game "); //add edit show stats page
		addGameButton.setFont(medFont);
		addGameButton.setPreferredSize(new Dimension(250,150));
		editGameButton.setText(" Edit Game ");
		editGameButton.setFont(medFont);
		editGameButton.setPreferredSize(new Dimension(250,150));
		showStatsButton.setText(" Show Stats ");
		showStatsButton.setFont(medFont);
		showStatsButton.setPreferredSize(new Dimension(250,150));
		addStatsSubmitButton.setText(" Submit "); //add stats page
		homeButton.setText(" Home "); //home button
		homeButton.setFont(medFont);
		homeButton.setBackground(Color.BLACK);
		homeButton.setForeground(Color.WHITE);
		homeButton.setPreferredSize(new Dimension(150, 50));
		
		//add action listeners
		newSeasonButton.addActionListener(new newSeasonButton());
		loadSeasonButton.addActionListener(new loadSeasonButton());
		newSeasonSubmitButton.addActionListener(new newSeasonSubmitButton());
		newSeasonAddGameButton.addActionListener(new newSeasonAddGameButton());
		addStatsSubmitButton.addActionListener(new addStatsSubmitButton());
		loadSeasonSubmitButton.addActionListener(new loadSeasonSubmitButton());
		addGameButton.addActionListener(new addGameButton());
		editGameButton.addActionListener(new editGameButton());
		showStatsButton.addActionListener(new showStatsButton());
		homeButton.addActionListener(new homeButton());
		
		//add labels and buttons to panels
		sabretrackerTitlePanel.add(titleLabel); //title page
		titleQuestionPanel.add(titleQuestionLabel);
		titleQuestionPanel.add(Box.createVerticalStrut(150));	
		seasonChoicePanel.add(newSeasonButton);
		seasonChoicePanel.add(Box.createHorizontalStrut(24));//add space between buttons
		seasonChoicePanel.add(loadSeasonButton);
		teamNamePanel.add(teamNameLabel); //new season page
		teamNamePanel.add(teamNameEntry);
		seasonSelectionPanel.add(seasonSelectionLabel);
		seasonSelectionPanel.add(fourSeasons);
		yearPanel.add(yearLabel);
		yearPanel.add(yearEntry);
		newSeasonSubmitButtonPanel.add(newSeasonSubmitButton);
		newSeasonAddGamePanel.add(newSeasonAddGameButton);
		activeSeasonTitlePanel.add(activeSeasonTitleLabel); //add edit show stats page
		addEditShowStatsPanel.add(activeSeasonTitlePanel); 
		addEditButtonPanel.add(addGameButton); 
		addEditButtonPanel.add(editGameButton);
		showStatsPanel.add(showStatsButton);
		showStatsPanel.add(Box.createVerticalStrut(150));
		addEditShowStatsPanel.add(addEditButtonPanel);
		addEditShowStatsPanel.add(showStatsPanel);
		
		gameDatePanel.add(gameDateLabel);//first, add labels to panels for add stats page
		gameDatePanel.add(dateEntry);
		plateAppearancesPanel.add(plateAppearancesLabel);
		plateAppearancesPanel.add(plateAppearancesEntry);
		walksPanel.add(walksLabel);
		walksPanel.add(walksEntry);
		HBPsPanel.add(HBPsLabel);
		HBPsPanel.add(HBPsEntry);
		totalHitsPanel.add(totalHitsLabel);
		totalHitsPanel.add(totalHitsEntry);
		outFCOrErrorPanel.add(outFCOrErrorLabel);
		outFCOrErrorPanel.add(outFCOrErrorEntry);
		singlesPanel.add(singlesLabel);
		singlesPanel.add(singlesEntry);
		doublesPanel.add(doublesLabel);
		doublesPanel.add(doublesEntry);
		triplesPanel.add(triplesLabel);
		triplesPanel.add(triplesEntry);
		homeRunsPanel.add(homeRunsLabel);
		homeRunsPanel.add(homeRunsEntry);
		strikeoutSwingingPanel.add(strikeoutSwingingLabel);
		strikeoutSwingingPanel.add(strikeoutSwingingEntry);
		strikeoutLookingPanel.add(strikeoutLookingLabel);
		strikeoutLookingPanel.add(strikeoutLookingEntry);
		sacFlyPanel.add(sacFlyLabel);
		sacFlyPanel.add(sacFlyEntry);
		sacBuntPanel.add(sacBuntLabel);
		sacBuntPanel.add(sacBuntEntry);
		lineDrivePanel.add(lineDriveLabel);
		lineDrivePanel.add(lineDriveEntry);
		flyBallPanel.add(flyBallLabel);
		flyBallPanel.add(flyBallEntry);
		RBIsPanel.add(RBIsLabel);
		RBIsPanel.add(RBIsEntry);
		runsScoredPanel.add(runsScoredLabel);
		runsScoredPanel.add(runsScoredEntry);
		stolenBasesPanel.add(stolenBasesLabel);
		stolenBasesPanel.add(stolenBasesEntry);
		addGameStatsPanel.add(gameDatePanel); //add panels to stats page
		addGameStatsPanel.add(plateAppearancesPanel);
		addGameStatsPanel.add(walksPanel);
		addGameStatsPanel.add(HBPsPanel);
		addGameStatsPanel.add(totalHitsPanel);
		addGameStatsPanel.add(outFCOrErrorPanel);
		addGameStatsPanel.add(singlesPanel);
		addGameStatsPanel.add(doublesPanel);
		addGameStatsPanel.add(triplesPanel);
		addGameStatsPanel.add(homeRunsPanel);
		addGameStatsPanel.add(strikeoutSwingingPanel);
		addGameStatsPanel.add(strikeoutLookingPanel);
		addGameStatsPanel.add(sacFlyPanel);
		addGameStatsPanel.add(sacBuntPanel);
		addGameStatsPanel.add(lineDrivePanel);
		addGameStatsPanel.add(flyBallPanel);
		addGameStatsPanel.add(RBIsPanel);
		addGameStatsPanel.add(runsScoredPanel);
		addGameStatsPanel.add(stolenBasesPanel);
		addGameStatsPanel.add(addStatsSubmitButton);
		homeButtonPanel.add(homeButton); //home button

		//set unneeded buttons/panels to false visibility
		teamNamePanel.setVisible(false);
		seasonSelectionPanel.setVisible(false);
		yearPanel.setVisible(false);
		newSeasonSubmitButtonPanel.setVisible(false);
		newSeasonAddGamePanel.setVisible(false);
		addGameStatsPanel.setVisible(false);
		addEditShowStatsPanel.setVisible(false);
		homeButton.setVisible(false);
	
		//panels need to be added on top of the background image
		setLayout(new BorderLayout());
		//backgroundImage.setLayout(new GridLayout());
		backgroundImage.add(sabretrackerTitlePanel);
		backgroundImage.add(titleQuestionPanel);
		backgroundImage.add(seasonChoicePanel);
		backgroundImage.add(teamNamePanel);
		backgroundImage.add(seasonSelectionPanel);
		backgroundImage.add(yearPanel);
		backgroundImage.add(newSeasonSubmitButtonPanel);
		backgroundImage.add(newSeasonAddGamePanel);
		backgroundImage.add(addGameStatsPanel);
		backgroundImage.add(addEditShowStatsPanel);
		backgroundImage.add(homeButtonPanel);
		add(homeButtonPanel, BorderLayout.SOUTH);
		
	}
	/**
	 * Set up the display method
	 */
	public void display()
	{	
		JFrame theFrame = new JFrame("Sabretracker");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setContentPane(this);
		theFrame.setPreferredSize(new Dimension(800, 900));
		theFrame.setLocationRelativeTo(null);
		theFrame.add(backgroundImage);//add the background to the frame
		theFrame.pack();
		//*** make the window visible
		theFrame.setVisible(true);
	}
	
	
	TheSabretracker ts = new TheSabretracker ();
	
	/*
	 * Action Listeners for all buttons
	 */
	class newSeasonButton implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			titleQuestionPanel.setVisible(false);
			seasonChoicePanel.setVisible(false);
			teamNamePanel.setVisible(true);
			seasonSelectionPanel.setVisible(true);
			yearPanel.setVisible(true);
			newSeasonSubmitButtonPanel.setVisible(true);
			homeButton.setVisible(true);
		}
	}
	
	class loadSeasonButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ts.selectSeasonToLoad(); 
			titleQuestionPanel.setVisible(false);
			seasonChoicePanel.setVisible(false);
			ArrayList<OneSeason> boxChoice = new ArrayList<OneSeason>();
			boxChoice = ts.fillComboBox();
			seasonToLoad = new JComboBox(boxChoice.toArray()); //fill options for combo box
			loadSeasonChoiceLabel.setAlignmentX(CENTER_ALIGNMENT);
			loadSeasonComboBoxPanel.add(seasonToLoad);
			loadSeasonComboBoxPanel.add(loadSeasonSubmitButton);
			loadSeasonPanel.add(loadSeasonChoiceLabel); //add items to load season panel
			loadSeasonPanel.add(loadSeasonComboBoxPanel);
			loadSeasonPanel.setVisible(true);
			backgroundImage.add(loadSeasonPanel);
			homeButton.setVisible(true);
		}
	}
	
	class loadSeasonSubmitButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String seasonFromCombo = seasonToLoad.getSelectedItem().toString();
			//we need to split the comboBox string into seperate components to use for OneSeason
			//will allow us to get the file name where games are stored
			String[] splitStringForTeamName = seasonFromCombo.split(",");
			String[] splitStringForSeason = splitStringForTeamName[1].split("\\s");
			String comboTeamName = splitStringForTeamName[0];
			String comboSeason = splitStringForSeason[1];
			int comboYear = Integer.parseInt(splitStringForSeason[2]);
			OneSeason o = new OneSeason(comboTeamName, comboSeason, comboYear);
			ts.loadSeasonAndGameInfo(o);
			
			loadSeasonComboBoxPanel.removeAll();//remove, it gets added back when load button is pushed
			loadSeasonPanel.removeAll();
			activeSeasonTitleLabel.setText(ts.getCurrentSeason().toString()); //get the current season info
			addEditShowStatsPanel.setVisible(true);
		}
	}
	
	class newSeasonSubmitButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String enteredTeamName = teamNameEntry.getText(); //get input from GUI
			String enteredSeason = (String) fourSeasons.getSelectedItem();
			int enteredYear = Integer.parseInt(yearEntry.getText());
			
			OneSeason newSeason = new OneSeason (enteredTeamName, enteredSeason, enteredYear);//edit the newSeason info to carry into method
			ts.createANewSeason(newSeason);
			
			teamNamePanel.setVisible(false);
			seasonSelectionPanel.setVisible(false);
			yearPanel.setVisible(false);
			newSeasonSubmitButtonPanel.setVisible(false);
			
			newSeasonAddGamePanel.setVisible(true);	
		}
	}
	
	class newSeasonAddGameButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			newSeasonAddGameButton.setVisible(false);
			ts.addGameOne();
			
			addGameStatsPanel.setVisible(true);
		}
	}
	
	class addGameButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ts.findGameNumber();
			addGameStatsPanel.setVisible(true);
			addEditShowStatsPanel.setVisible(false);
		}
	}
	
	class editGameButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			addEditShowStatsPanel.setVisible(false);
		}
	}
	
	class showStatsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			addEditShowStatsPanel.setVisible(false);
		}
	}
	class addStatsSubmitButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String date = dateEntry.getText();
			int plateAps = Integer.parseInt(plateAppearancesEntry.getText());
			int walks = Integer.parseInt(walksEntry.getText());
			int hbp = Integer.parseInt(HBPsEntry.getText());
			int hits = Integer.parseInt(totalHitsEntry.getText());
			int outs = Integer.parseInt(outFCOrErrorEntry.getText());
			int oneB = Integer.parseInt(singlesEntry.getText());
			int twoB = Integer.parseInt(doublesEntry.getText());
			int threeB = Integer.parseInt(triplesEntry.getText());
			int hr = Integer.parseInt(homeRunsEntry.getText());
			int soS = Integer.parseInt(strikeoutSwingingEntry.getText());
			int soL = Integer.parseInt(strikeoutLookingEntry.getText());
			int sacF = Integer.parseInt(sacFlyEntry.getText());
			int sacB = Integer.parseInt(sacBuntEntry.getText());
			int ld = Integer.parseInt(lineDriveEntry.getText());
			int fb = Integer.parseInt(flyBallEntry.getText());
			int RBI = Integer.parseInt(RBIsEntry.getText());
			int runs = Integer.parseInt(runsScoredEntry.getText());
			int sb = Integer.parseInt(stolenBasesEntry.getText());
			
			ts.enterGameStats(date, plateAps, hbp, hits, outs, oneB, twoB, threeB, 
					hr, soS, soL, sacF, sacB, ld, fb, RBI, runs, sb);
			
			addGameStatsPanel.setVisible(false);
			addEditShowStatsPanel.setVisible(true);
		}
	}
		
	class homeButton implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			titleQuestionPanel.setVisible(true);
			seasonChoicePanel.setVisible(true);
			homeButton.setVisible(false);
			
			teamNamePanel.setVisible(false); //make all un-needed panels not visible
			seasonSelectionPanel.setVisible(false);
			yearPanel.setVisible(false);
			newSeasonSubmitButtonPanel.setVisible(false);
			newSeasonAddGamePanel.setVisible(false);
			addGameStatsPanel.setVisible(false);
			addEditShowStatsPanel.setVisible(false);
			
			loadSeasonComboBoxPanel.removeAll();
			loadSeasonPanel.removeAll();
		}
	}
	

}