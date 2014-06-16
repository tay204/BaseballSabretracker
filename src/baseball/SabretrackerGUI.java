package baseball;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * GUI For Sabretracker
 * @author yeotaJMU
 */

public class SabretrackerGUI extends JPanel
{
	
	private static final Color TEXT_COLOR = Color.LIGHT_GRAY; //one variable for all text colors
	
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
	
	//title page
	JPanel sabretrackerTitlePanel = new JPanel(); 
	JPanel titleQuestionPanel = new JPanel();
	JPanel seasonChoicePanel = new JPanel();
	//new season page
	JPanel teamNamePanel = new JPanel(); 
	JPanel seasonSelectionPanel =  new JPanel();
	JPanel yearPanel = new JPanel();
	JPanel newSeasonSubmitButtonPanel = new JPanel();
	JPanel newSeasonAddGamePanel = new JPanel();
	//load season page
	JPanel loadSeasonPanel = new JPanel(); 
	JPanel loadSeasonComboBoxPanel = new JPanel();
	//add, edit, show stats page
	JPanel addEditShowStatsPanel = new JPanel(); 
	JPanel activeSeasonTitlePanel = new JPanel();
	JPanel addEditButtonPanel = new JPanel();
	JPanel showStatsButtonPanel = new JPanel();
	//edit stats page
	JPanel selectGameToEditPanel = new JPanel();
	JPanel selectGameToEditComboPanel = new JPanel(); 
	JPanel editGameInstructionsPanel = new JPanel();
	JPanel gameToEditDisplayPanel = new JPanel();
	JPanel editGameSaveChangesPanel = new JPanel();
	JPanel editGameStatsPanel = new JPanel(); 
	JPanel editGameDatePanel = new JPanel();
	JPanel editPlateAppearancesPanel = new JPanel();
	JPanel editWalksPanel = new JPanel();
	JPanel editHBPsPanel = new JPanel();
	JPanel editTotalHitsPanel = new JPanel();
	JPanel editOutFCOrErrorPanel = new JPanel();
	JPanel editSinglesPanel = new JPanel();
	JPanel editDoublesPanel = new JPanel();
	JPanel editTriplesPanel = new JPanel();
	JPanel editHomeRunsPanel = new JPanel();
	JPanel editStrikeoutSwingingPanel = new JPanel();
	JPanel editStrikeoutLookingPanel = new JPanel();
	JPanel editSacFlyPanel = new JPanel();
	JPanel editSacBuntPanel = new JPanel();
	JPanel editLineDrivePanel = new JPanel();
	JPanel editFlyBallPanel = new JPanel();
	JPanel editRBIsPanel = new JPanel();
	JPanel editRunsScoredPanel = new JPanel();
	JPanel editStolenBasesPanel = new JPanel();
	//games stats page
	JPanel addGameStatsPanel = new JPanel(); 
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
	//show stats page
	JPanel showStatsPanel = new JPanel();
	JPanel statsTitlePanel = new JPanel();
	JPanel statsDisplayPart1Panel = new JPanel();
	JPanel statsDisplayPart2Panel = new JPanel();
	//home button always to be visible
	JPanel homeButtonPanel = new JPanel(); 

	//initialize JLabel
	//title page
	JLabel titleLabel = new JLabel();
	JLabel titleQuestionLabel = new JLabel();
	JLabel newSeasonLabel = new JLabel();
	JLabel loadSeasonLabel = new JLabel();
	//new season page
	JLabel teamNameLabel = new JLabel(); 
	JLabel seasonSelectionLabel = new JLabel();
	JLabel yearLabel = new JLabel();
	JLabel newSeasonSubmitLabel = new JLabel();
	//load season page
	JLabel loadSeasonChoiceLabel = new JLabel(); 
	//add edit stats page
	JLabel activeSeasonTitleLabel = new JLabel(); 
	JLabel editGameInstructionLabel = new JLabel();
	//edit stats page
	JLabel selectGameToEditComboLabel = new JLabel();
	JLabel editGameDateLabel = new JLabel();
	JLabel editPlateAppearancesLabel = new JLabel();
	JLabel editWalksLabel = new JLabel();
	JLabel editHBPsLabel = new JLabel();
	JLabel editTotalHitsLabel = new JLabel();
	JLabel editOutFCOrErrorLabel = new JLabel();
	JLabel editSinglesLabel = new JLabel();
	JLabel editDoublesLabel = new JLabel();
	JLabel editTriplesLabel = new JLabel();
	JLabel editHomeRunsLabel = new JLabel();
	JLabel editStrikeoutSwingingLabel = new JLabel();
	JLabel editStrikeoutLookingLabel = new JLabel();
	JLabel editSacFlyLabel = new JLabel();
	JLabel editSacBuntLabel = new JLabel();
	JLabel editLineDriveLabel = new JLabel();
	JLabel editFlyBallLabel = new JLabel();
	JLabel editRBIsLabel = new JLabel();
	JLabel editRunsScoredLabel = new JLabel();
	JLabel editStolenBasesLabel = new JLabel();
	//add stats page
	JLabel gameDateLabel = new JLabel();
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
	//show stats page
	JLabel statsTitleLabel = new JLabel();
	JLabel showGameNumberLabel = new JLabel();
	JLabel showPlateAppearancesLabel = new JLabel();
	JLabel showAtBatsLabel = new JLabel();
	JLabel showRunsLabel = new JLabel();
	JLabel showTotalHitsLabel = new JLabel();
	JLabel showDoublesLabel = new JLabel();
	JLabel showTriplesLabel = new JLabel();
	JLabel showHRLabel = new JLabel();
	JLabel showRBIsLabel = new JLabel();
	JLabel showSBLabel =  new JLabel();
	JLabel showBBsLabel = new JLabel();
	JLabel showTotalKsLabel = new JLabel();
	JLabel showLookingKsLabel = new JLabel();
	JLabel showSwingingKsLabel = new JLabel();
	JLabel showAVGLabel = new JLabel();
	JLabel showOBPLabel = new JLabel();
	JLabel showSLGLabel = new JLabel();
	JLabel showOPSLabel = new JLabel();
	JLabel showTBLabel = new JLabel();
	JLabel showHBPLabel = new JLabel();
	JLabel showSacBuntLabel = new JLabel();
	JLabel showSacFlyLabel = new JLabel();
	JLabel showBABIPLabel = new JLabel();
	JLabel showLDLabel = new JLabel();
	JLabel showFBLabel = new JLabel();
	JLabel showGBLabel = new JLabel();
	JLabel showBBPerLabel = new JLabel();
	JLabel showKPerLabel = new JLabel();
	JLabel showHRPerFBLabel = new JLabel();
	JLabel showGameNumberStatsLabel = new JLabel();
	JLabel showPlateAppearancesStatsLabel = new JLabel();
	JLabel showAtBatsStatsLabel = new JLabel();
	JLabel showRunsStatsLabel = new JLabel();
	JLabel showTotalHitsStatsLabel = new JLabel();
	JLabel showDoublesStatsLabel = new JLabel();
	JLabel showTriplesStatsLabel = new JLabel();
	JLabel showHRStatsLabel = new JLabel();
	JLabel showRBIsStatsLabel = new JLabel();
	JLabel showSBStatsLabel =  new JLabel();
	JLabel showBBsStatsLabel = new JLabel();
	JLabel showTotalKsStatsLabel = new JLabel();
	JLabel showLookingKsStatsLabel = new JLabel();
	JLabel showSwingingKsStatsLabel = new JLabel();
	JLabel showAVGStatsLabel = new JLabel();
	JLabel showOBPStatsLabel = new JLabel();
	JLabel showSLGStatsLabel = new JLabel();
	JLabel showOPSStatsLabel = new JLabel();
	JLabel showTBStatsLabel = new JLabel();
	JLabel showHBPStatsLabel = new JLabel();
	JLabel showSacBuntStatsLabel = new JLabel();
	JLabel showSacFlyStatsLabel = new JLabel();
	JLabel showBABIPStatsLabel = new JLabel();
	JLabel showLDStatsLabel = new JLabel();
	JLabel showFBStatsLabel = new JLabel();
	JLabel showGBStatsLabel = new JLabel();
	JLabel showBBPerStatsLabel = new JLabel();
	JLabel showKPerStatsLabel = new JLabel();
	JLabel showHRPerFBStatsLabel = new JLabel();
	

	//initialize JButton
	JButton newSeasonButton = new JButton();
	JButton loadSeasonButton = new JButton();
	JButton newSeasonSubmitButton = new JButton();
	JButton newSeasonAddGameButton = new JButton();
	JButton addStatsSubmitButton = new JButton();
	JButton loadSeasonSubmitButton = new JButton();
	JButton addGameButton = new JButton();
	JButton editGameButton = new JButton();
	JButton showStatsButton = new JButton();
	JButton gameToEditSubmitButton = new JButton();
	JButton editGameSaveChangesButton = new JButton();
	
	JButton homeButton = new JButton();

	//initialize JTextField
	JTextField teamNameEntry = new JTextField(25);
	JTextField yearEntry = new JTextField(10);
	//add stats page
	JTextField dateEntry = new JTextField(15); 
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
	//edit stats page
	JTextField editDateEntry = new JTextField(15); 
	JTextField editPlateAppearancesEntry = new JTextField(5);
	JTextField editWalksEntry = new JTextField(5);
	JTextField editHBPsEntry = new JTextField(5);
	JTextField editTotalHitsEntry = new JTextField(5);
	JTextField editOutFCOrErrorEntry = new JTextField(5);
	JTextField editSinglesEntry = new JTextField(5);
	JTextField editDoublesEntry = new JTextField(5);
	JTextField editTriplesEntry = new JTextField(5);
	JTextField editHomeRunsEntry = new JTextField(5);
	JTextField editStrikeoutSwingingEntry = new JTextField(5);
	JTextField editStrikeoutLookingEntry = new JTextField(5);
	JTextField editSacFlyEntry = new JTextField(5);
	JTextField editSacBuntEntry = new JTextField(5);
	JTextField editLineDriveEntry = new JTextField(5);
	JTextField editFlyBallEntry = new JTextField(5);
	JTextField editRBIsEntry = new JTextField(5);
	JTextField editRunsScoredEntry = new JTextField(5);
	JTextField editStolenBasesEntry = new JTextField(5);
	
	//set up combo box for seasons
	String seasons[] = {"Spring", "Summer", "Fall", "Winter"};
	JComboBox<String> fourSeasons = new JComboBox<String>(seasons);
	JComboBox seasonToLoad; //will fill box later
	JComboBox gameToEdit; //will fill box later
	


	public SabretrackerGUI()
	{
		//*** set panel layouts
		//*** panels could be LEFT, or RIGHT justified.
		//title page
		sabretrackerTitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		sabretrackerTitlePanel.setOpaque(false);
		titleQuestionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		titleQuestionPanel.setOpaque(false);
		//season selection page
		seasonChoicePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
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
		//load season page
		loadSeasonPanel.setLayout(new BoxLayout(loadSeasonPanel, BoxLayout.Y_AXIS)); 
		loadSeasonPanel.setOpaque(false);
		loadSeasonComboBoxPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		loadSeasonComboBoxPanel.setOpaque(false);
		//add edit stats page
		addEditShowStatsPanel.setLayout(new BoxLayout(addEditShowStatsPanel, BoxLayout.Y_AXIS)); 
		addEditShowStatsPanel.setOpaque(false);
		activeSeasonTitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		activeSeasonTitlePanel.setOpaque(false);
		addEditButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		addEditButtonPanel.setOpaque(false);
		showStatsButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		showStatsButtonPanel.setOpaque(false);
		//edit stats page
		selectGameToEditPanel.setLayout(new BoxLayout(selectGameToEditPanel, BoxLayout.Y_AXIS));
		selectGameToEditPanel.setAlignmentX(CENTER_ALIGNMENT);
		selectGameToEditPanel.setOpaque(false);
		selectGameToEditComboPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		selectGameToEditComboPanel.setOpaque(false);
		editGameInstructionsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		editGameInstructionsPanel.setOpaque(false);
		gameToEditDisplayPanel.setLayout(new GridLayout(0,2));
		gameToEditDisplayPanel.setOpaque(false);
		addGameStatsPanel.setLayout(new BoxLayout(addGameStatsPanel, BoxLayout.Y_AXIS));
		addGameStatsPanel.setOpaque(false);
		editGameDatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editGameDatePanel.setOpaque(false);
		editPlateAppearancesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editPlateAppearancesPanel.setOpaque(false);
		editWalksPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editWalksPanel.setOpaque(false);
		editHBPsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editHBPsPanel.setOpaque(false);
		editTotalHitsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editTotalHitsPanel.setOpaque(false);
		editOutFCOrErrorPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editOutFCOrErrorPanel.setOpaque(false);
		editSinglesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editSinglesPanel.setOpaque(false);
		editDoublesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editDoublesPanel.setOpaque(false);
		editTriplesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editTriplesPanel.setOpaque(false);
		editHomeRunsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editHomeRunsPanel.setOpaque(false);
		editStrikeoutSwingingPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editStrikeoutSwingingPanel.setOpaque(false);
		editStrikeoutLookingPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editStrikeoutLookingPanel.setOpaque(false);
		editSacFlyPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editSacFlyPanel.setOpaque(false);
		editSacBuntPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editSacBuntPanel.setOpaque(false);
		editLineDrivePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editLineDrivePanel.setOpaque(false);
		editFlyBallPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editFlyBallPanel.setOpaque(false);
		editRBIsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editRBIsPanel.setOpaque(false);
		editRunsScoredPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editRunsScoredPanel.setOpaque(false);
		editStolenBasesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editStolenBasesPanel.setOpaque(false);
		editGameSaveChangesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		editGameSaveChangesPanel.setOpaque(false);
		//add stats page
		addGameStatsPanel.setLayout(new BoxLayout(addGameStatsPanel, BoxLayout.Y_AXIS));
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
		//show stats page
		showStatsPanel.setLayout(new BoxLayout(showStatsPanel, BoxLayout.Y_AXIS));
		statsTitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		statsTitlePanel.setOpaque(false);
		statsDisplayPart1Panel.setLayout(new GridLayout(2, 14));
		statsDisplayPart1Panel.setBackground(Color.WHITE);
		statsDisplayPart2Panel.setLayout(new GridLayout(2, 15));
		statsDisplayPart2Panel.setBackground(Color.WHITE);
		//homeButton
		homeButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		homeButtonPanel.setAlignmentY(BOTTOM_ALIGNMENT);
		homeButtonPanel.setBackground(Color.DARK_GRAY);		
		
		//various fonts
		Font titleFont = new Font("Stencil", Font.PLAIN, 45);
		Font bigFont = new Font("Helvetica Bold", Font.BOLD, 30);
		Font medFont = new Font("Helvetica Bold", Font.BOLD, 20);
		Font smallFont = new Font("Helvetica Bold", Font.BOLD, 15);
		
		
		//set up label appearances
		//title page
		titleLabel.setFont(titleFont); 
		titleLabel.setForeground(TEXT_COLOR);
		titleQuestionLabel.setFont(bigFont);
		titleQuestionLabel.setForeground(TEXT_COLOR);
		//new season page
		teamNameLabel.setFont(medFont); 
		teamNameLabel.setForeground(TEXT_COLOR);
		seasonSelectionLabel.setFont(medFont); 
		seasonSelectionLabel.setForeground(TEXT_COLOR);
		yearLabel.setFont(medFont);
		yearLabel.setForeground(TEXT_COLOR);
		//load season page
		loadSeasonChoiceLabel.setFont(bigFont); 
		loadSeasonChoiceLabel.setForeground(TEXT_COLOR);
		//add edit stats page
		activeSeasonTitleLabel.setFont(bigFont); 
		activeSeasonTitleLabel.setForeground(TEXT_COLOR);
		//edit stats page
		selectGameToEditComboLabel.setFont(bigFont); 
		selectGameToEditComboLabel.setForeground(TEXT_COLOR);
		editGameInstructionLabel.setFont(bigFont);
		editGameInstructionLabel.setForeground(TEXT_COLOR);
		editGameDateLabel.setFont(medFont); 
		editGameDateLabel.setForeground(TEXT_COLOR);
		editPlateAppearancesLabel.setFont(medFont);
		editPlateAppearancesLabel.setForeground(TEXT_COLOR);
		editWalksLabel.setFont(medFont); 
		editWalksLabel.setForeground(TEXT_COLOR);
		editHBPsLabel.setFont(medFont);
		editHBPsLabel.setForeground(TEXT_COLOR);
		editTotalHitsLabel.setFont(medFont);
		editTotalHitsLabel.setForeground(TEXT_COLOR);
		editOutFCOrErrorLabel.setFont(medFont);
		editOutFCOrErrorLabel.setForeground(TEXT_COLOR);
		editSinglesLabel.setFont(medFont);
		editSinglesLabel.setForeground(TEXT_COLOR);
		editDoublesLabel.setFont(medFont);
		editDoublesLabel.setForeground(TEXT_COLOR);
		editTriplesLabel.setFont(medFont);
		editTriplesLabel.setForeground(TEXT_COLOR);
		editHomeRunsLabel.setFont(medFont);
		editHomeRunsLabel.setForeground(TEXT_COLOR);
		editStrikeoutSwingingLabel.setFont(medFont);
		editStrikeoutSwingingLabel.setForeground(TEXT_COLOR);
		editStrikeoutLookingLabel.setFont(medFont);
		editStrikeoutLookingLabel.setForeground(TEXT_COLOR);
		editSacFlyLabel.setFont(medFont);
		editSacFlyLabel.setForeground(TEXT_COLOR);
		editSacBuntLabel.setFont(medFont);
		editSacBuntLabel.setForeground(TEXT_COLOR);
		editLineDriveLabel.setFont(medFont);
		editLineDriveLabel.setForeground(TEXT_COLOR);
		editFlyBallLabel.setFont(medFont);
		editFlyBallLabel.setForeground(TEXT_COLOR);
		editRBIsLabel.setFont(medFont);
		editRBIsLabel.setForeground(TEXT_COLOR);
		editRunsScoredLabel.setFont(medFont);
		editRunsScoredLabel.setForeground(TEXT_COLOR);
		editStolenBasesLabel.setFont(medFont);
		editStolenBasesLabel.setForeground(TEXT_COLOR);
		//add stats label
		gameDateLabel.setFont(medFont); 
		gameDateLabel.setForeground(TEXT_COLOR);
		plateAppearancesLabel.setFont(medFont);
		plateAppearancesLabel.setForeground(TEXT_COLOR);
		walksLabel.setFont(medFont); 
		walksLabel.setForeground(TEXT_COLOR);
		HBPsLabel.setFont(medFont);
		HBPsLabel.setForeground(TEXT_COLOR);
		totalHitsLabel.setFont(medFont);
		totalHitsLabel.setForeground(TEXT_COLOR);
		outFCOrErrorLabel.setFont(medFont);
		outFCOrErrorLabel.setForeground(TEXT_COLOR);
		singlesLabel.setFont(medFont);
		singlesLabel.setForeground(TEXT_COLOR);
		doublesLabel.setFont(medFont);
		doublesLabel.setForeground(TEXT_COLOR);
		triplesLabel.setFont(medFont);
		triplesLabel.setForeground(TEXT_COLOR);
		homeRunsLabel.setFont(medFont);
		homeRunsLabel.setForeground(TEXT_COLOR);
		strikeoutSwingingLabel.setFont(medFont);
		strikeoutSwingingLabel.setForeground(TEXT_COLOR);
		strikeoutLookingLabel.setFont(medFont);
		strikeoutLookingLabel.setForeground(TEXT_COLOR);
		sacFlyLabel.setFont(medFont);
		sacFlyLabel.setForeground(TEXT_COLOR);
		sacBuntLabel.setFont(medFont);
		sacBuntLabel.setForeground(TEXT_COLOR);
		lineDriveLabel.setFont(medFont);
		lineDriveLabel.setForeground(TEXT_COLOR);
		flyBallLabel.setFont(medFont);
		flyBallLabel.setForeground(TEXT_COLOR);
		RBIsLabel.setFont(medFont);
		RBIsLabel.setForeground(TEXT_COLOR);
		runsScoredLabel.setFont(medFont);
		runsScoredLabel.setForeground(TEXT_COLOR);
		stolenBasesLabel.setFont(medFont);
		stolenBasesLabel.setForeground(TEXT_COLOR);
		//show stats
		showGameNumberLabel.setFont(smallFont);
		showGameNumberLabel.setForeground(Color.BLACK);
		showPlateAppearancesLabel.setFont(smallFont);
		showPlateAppearancesLabel.setForeground(Color.BLACK);
		showAtBatsLabel.setFont(smallFont);
		showAtBatsLabel.setForeground(Color.BLACK);
		showRunsLabel.setFont(smallFont);
		showRunsLabel.setForeground(Color.BLACK);
		showTotalHitsLabel.setFont(smallFont);
		showTotalHitsLabel.setForeground(Color.BLACK);
		showDoublesLabel.setFont(smallFont);
		showDoublesLabel.setForeground(Color.BLACK);
		showTriplesLabel.setFont(smallFont);
		showTriplesLabel.setForeground(Color.BLACK);
		showHRLabel.setFont(smallFont);
		showHRLabel.setForeground(Color.BLACK);
		showRBIsLabel.setFont(smallFont);
		showRBIsLabel.setForeground(Color.BLACK);
		showSBLabel.setFont(smallFont);
		showSBLabel.setForeground(Color.BLACK);
		showBBsLabel.setFont(smallFont);
		showBBsLabel.setForeground(Color.BLACK);
		showTotalKsLabel.setFont(smallFont);
		showTotalKsLabel.setForeground(Color.BLACK);
		showLookingKsLabel.setFont(smallFont);
		showLookingKsLabel.setForeground(Color.BLACK);
		showSwingingKsLabel.setFont(smallFont);
		showSwingingKsLabel.setForeground(Color.BLACK);
		showAVGLabel.setFont(smallFont);
		showAVGLabel.setForeground(Color.BLACK);
		showOBPLabel.setFont(smallFont);
		showOBPLabel.setForeground(Color.BLACK);
		showSLGLabel.setFont(smallFont);
		showSLGLabel.setForeground(Color.BLACK);
		showOPSLabel.setFont(smallFont);
		showOPSLabel.setForeground(Color.BLACK);
		showTBLabel.setFont(smallFont);
		showTBLabel.setForeground(Color.BLACK);
		showHBPLabel.setFont(smallFont);
		showHBPLabel.setForeground(Color.BLACK);
		showSacBuntLabel.setFont(smallFont);
		showSacBuntLabel.setForeground(Color.BLACK);
		showSacFlyLabel.setFont(smallFont);
		showSacFlyLabel.setForeground(Color.BLACK);
		showBABIPLabel.setFont(smallFont);
		showBABIPLabel.setForeground(Color.BLACK);
		showLDLabel.setFont(smallFont);
		showLDLabel.setForeground(Color.BLACK);
		showFBLabel.setFont(smallFont);
		showFBLabel.setForeground(Color.BLACK);
		showGBLabel.setFont(smallFont);
		showGBLabel.setForeground(Color.BLACK);
		showBBPerLabel.setFont(smallFont);
		showBBPerLabel.setForeground(Color.BLACK);
		showKPerLabel.setFont(smallFont);
		showKPerLabel.setForeground(Color.BLACK);
		showHRPerFBLabel.setFont(smallFont);
		showHRPerFBLabel.setForeground(Color.BLACK);
		showGameNumberStatsLabel.setFont(smallFont);
		showGameNumberStatsLabel.setForeground(Color.BLACK);
		showPlateAppearancesStatsLabel.setFont(smallFont);
		showPlateAppearancesStatsLabel.setForeground(Color.BLACK);
		showAtBatsStatsLabel.setFont(smallFont);
		showAtBatsStatsLabel.setForeground(Color.BLACK);
		showRunsStatsLabel.setFont(smallFont);
		showRunsStatsLabel.setForeground(Color.BLACK);
		showTotalHitsStatsLabel.setFont(smallFont);
		showTotalHitsStatsLabel.setForeground(Color.BLACK);
		showDoublesStatsLabel.setFont(smallFont);
		showDoublesStatsLabel.setForeground(Color.BLACK);
		showTriplesStatsLabel.setFont(smallFont);
		showTriplesStatsLabel.setForeground(Color.BLACK);
		showHRStatsLabel.setFont(smallFont);
		showHRStatsLabel.setForeground(Color.BLACK);
		showRBIsStatsLabel.setFont(smallFont);
		showRBIsStatsLabel.setForeground(Color.BLACK);
		showSBStatsLabel.setFont(smallFont);
		showSBStatsLabel.setForeground(Color.BLACK);
		showBBsStatsLabel.setFont(smallFont);
		showBBsStatsLabel.setForeground(Color.BLACK);
		showTotalKsStatsLabel.setFont(smallFont);
		showTotalKsStatsLabel.setForeground(Color.BLACK);
		showLookingKsStatsLabel.setFont(smallFont);
		showLookingKsStatsLabel.setForeground(Color.BLACK);
		showSwingingKsStatsLabel.setFont(smallFont);
		showSwingingKsStatsLabel.setForeground(Color.BLACK);
		showAVGStatsLabel.setFont(smallFont);
		showAVGStatsLabel.setForeground(Color.BLACK);
		showOBPStatsLabel.setFont(smallFont);
		showOBPStatsLabel.setForeground(Color.BLACK);
		showSLGStatsLabel.setFont(smallFont);
		showSLGStatsLabel.setForeground(Color.BLACK);
		showOPSStatsLabel.setFont(smallFont);
		showOPSStatsLabel.setForeground(Color.BLACK);
		showTBStatsLabel.setFont(smallFont);
		showTBStatsLabel.setForeground(Color.BLACK);
		showHBPStatsLabel.setFont(smallFont);
		showHBPStatsLabel.setForeground(Color.BLACK);
		showSacBuntStatsLabel.setFont(smallFont);
		showSacBuntStatsLabel.setForeground(Color.BLACK);
		showSacFlyStatsLabel.setFont(smallFont);
		showSacFlyStatsLabel.setForeground(Color.BLACK);
		showBABIPStatsLabel.setFont(smallFont);
		showBABIPStatsLabel.setForeground(Color.BLACK);
		showLDStatsLabel.setFont(smallFont);
		showLDStatsLabel.setForeground(Color.BLACK);
		showFBStatsLabel.setFont(smallFont);
		showFBStatsLabel.setForeground(Color.BLACK);
		showGBStatsLabel.setFont(smallFont);
		showGBStatsLabel.setForeground(Color.BLACK);
		showBBPerStatsLabel.setFont(smallFont);
		showBBPerStatsLabel.setForeground(Color.BLACK);
		showKPerStatsLabel.setFont(smallFont);
		showKPerStatsLabel.setForeground(Color.BLACK);
		showHRPerFBStatsLabel.setFont(smallFont);
		showHRPerFBStatsLabel.setForeground(Color.BLACK);
		
		//set label texts
		//title page
		titleLabel.setText("BASEBALL SABRETRACKER"); 
		titleQuestionLabel.setText("Select a New Season or Load a Season:");
		teamNameLabel.setText("Enter the team name:");
		//new season page
		seasonSelectionLabel.setText("Select the season:"); 
		yearLabel.setText("Enter the year:");
		//load season page
		loadSeasonChoiceLabel.setText("Select a Season to Load:"); 
		//edit game panel
		selectGameToEditComboLabel.setText("Select a Game to Edit:"); 
		editGameDateLabel.setText("Enter the Game Date:"); 
		editPlateAppearancesLabel.setText("Plate Appearances:");
		editWalksLabel.setText("Walks:");
		editHBPsLabel.setText("HBPs:");
		editTotalHitsLabel.setText("Total Hits:");
		editOutFCOrErrorLabel.setText("Outs/Fielder's Choice/Errors/K's:");
		editSinglesLabel.setText("Singles:");
		editDoublesLabel.setText("Doubles:");
		editTriplesLabel.setText("Triples:");
		editHomeRunsLabel.setText("Home Runs:");
		editStrikeoutSwingingLabel.setText("Swinging K's:");
		editStrikeoutLookingLabel.setText("Looking K's:");
		editSacFlyLabel.setText("Sac Fly's:");
		editSacBuntLabel.setText("Sac Bunts:");
		editLineDriveLabel.setText("Line Drives:");
		editFlyBallLabel.setText("Fly Balls:");
		editRBIsLabel.setText("RBIs:");
		editRunsScoredLabel.setText("Runs:");
		editStolenBasesLabel.setText("Stolen Bases:");
		//add stats page
		gameDateLabel.setText("Enter the Game Date:"); 
		plateAppearancesLabel.setText("Plate Appearances:");
		walksLabel.setText("Walks:");
		HBPsLabel.setText("HBPs:");
		totalHitsLabel.setText("Total Hits:");
		outFCOrErrorLabel.setText("Outs/Fielder's Choice/Errors/K's:");
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
		//show stats
		showGameNumberLabel.setText("G");
		showPlateAppearancesLabel.setText("PA");
		showAtBatsLabel.setText("AB");
		showRunsLabel.setText("R");
		showTotalHitsLabel.setText("H");
		showDoublesLabel.setText("2B");
		showTriplesLabel.setText("3B");
		showHRLabel.setText("HR");
		showRBIsLabel.setText("RBI");
		showSBLabel.setText("SB");
		showBBsLabel.setText("BB");
		showTotalKsLabel.setText("K");
		showLookingKsLabel.setText("Looking K");
		showSwingingKsLabel.setText("Swinging K");
		showAVGLabel.setText("AVG");
		showOBPLabel.setText("OBP");
		showSLGLabel.setText("SLG");
		showOPSLabel.setText("OPS");
		showTBLabel.setText("TB");
		showHBPLabel.setText("HBP");
		showSacBuntLabel.setText("Sac Bunt");
		showSacFlyLabel.setText("Sac Fly");
		showBABIPLabel.setText("BABIP");
		showLDLabel.setText("LD%");
		showFBLabel.setText("FB%");
		showGBLabel.setText("GB%");
		showBBPerLabel.setText("BB%");
		showKPerLabel.setText("K%");
		showHRPerFBLabel.setText("HR/FB%");
		
		
		//set up textfield texts
		dateEntry.setText("XX/XX/XXXX");
		
		
		
		//set up buttons
		//title page
		newSeasonButton.setText(" New Season "); 
		newSeasonButton.setPreferredSize(new Dimension(250, 150));
		newSeasonButton.setFont(medFont);
		loadSeasonButton.setText(" Load Season ");
		loadSeasonButton.setPreferredSize(new Dimension(250, 150));
		loadSeasonButton.setFont(medFont);
		//new season page
		newSeasonSubmitButton.setText(" Submit "); 
		newSeasonAddGameButton.setText(" Add Game ");
		newSeasonAddGameButton.setFont(medFont);
		newSeasonAddGameButton.setPreferredSize(new Dimension(250, 150));
		newSeasonAddGameButton.setFont(medFont);
		//load season page
		loadSeasonSubmitButton.setText(" Submit ");
		//add edit show stats page
		addGameButton.setText(" Add Game "); 
		addGameButton.setFont(medFont);
		addGameButton.setPreferredSize(new Dimension(250,150));
		editGameButton.setText(" Edit Game ");
		editGameButton.setFont(medFont);
		editGameButton.setPreferredSize(new Dimension(250,150));
		showStatsButton.setText(" Show Stats ");
		showStatsButton.setFont(medFont);
		showStatsButton.setPreferredSize(new Dimension(250,150));
		//add stats page
		addStatsSubmitButton.setText(" Submit "); 
		//edit stats page
		gameToEditSubmitButton.setText(" Submit "); 
		editGameSaveChangesButton.setText(" Save Changes ");
		//show stats page
		statsTitleLabel.setFont(bigFont);
		statsTitleLabel.setForeground(TEXT_COLOR);
		//home button
		homeButton.setText(" Home "); 
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
		gameToEditSubmitButton.addActionListener(new gameToEditSubmitButton());
		editGameSaveChangesButton.addActionListener(new editGameSaveChangesButton());
		homeButton.addActionListener(new homeButton());
		
		//add labels and buttons to panels
		//title page
		sabretrackerTitlePanel.add(titleLabel); 
		titleQuestionPanel.add(titleQuestionLabel);
		titleQuestionPanel.add(Box.createVerticalStrut(150));	
		seasonChoicePanel.add(newSeasonButton);
		seasonChoicePanel.add(Box.createHorizontalStrut(24));//add space between buttons
		seasonChoicePanel.add(loadSeasonButton);
		//new season page
		teamNamePanel.add(teamNameLabel); 
		teamNamePanel.add(teamNameEntry);
		seasonSelectionPanel.add(seasonSelectionLabel);
		seasonSelectionPanel.add(fourSeasons);
		yearPanel.add(yearLabel);
		yearPanel.add(yearEntry);
		newSeasonSubmitButtonPanel.add(newSeasonSubmitButton);
		newSeasonAddGamePanel.add(newSeasonAddGameButton);
		//add edit show stats page
		activeSeasonTitlePanel.add(activeSeasonTitleLabel); 
		addEditShowStatsPanel.add(activeSeasonTitlePanel); 
		addEditButtonPanel.add(addGameButton); 
		addEditButtonPanel.add(editGameButton);
		showStatsButtonPanel.add(showStatsButton);
		showStatsButtonPanel.add(Box.createVerticalStrut(150));
		addEditShowStatsPanel.add(addEditButtonPanel);
		addEditShowStatsPanel.add(showStatsButtonPanel);
		//add stats page		
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
		//edit stats page
		editGameDatePanel.add(editGameDateLabel);//first, add labels to panels for edit stats page
		editGameDatePanel.add(editDateEntry);
		editPlateAppearancesPanel.add(editPlateAppearancesLabel);
		editPlateAppearancesPanel.add(editPlateAppearancesEntry);
		editWalksPanel.add(editWalksLabel);
		editWalksPanel.add(editWalksEntry);
		editHBPsPanel.add(editHBPsLabel);
		editHBPsPanel.add(editHBPsEntry);
		editTotalHitsPanel.add(editTotalHitsLabel);
		editTotalHitsPanel.add(editTotalHitsEntry);
		editOutFCOrErrorPanel.add(editOutFCOrErrorLabel);
		editOutFCOrErrorPanel.add(editOutFCOrErrorEntry);
		editSinglesPanel.add(editSinglesLabel);
		editSinglesPanel.add(editSinglesEntry);
		editDoublesPanel.add(editDoublesLabel);
		editDoublesPanel.add(editDoublesEntry);
		editTriplesPanel.add(editTriplesLabel);
		editTriplesPanel.add(editTriplesEntry);
		editHomeRunsPanel.add(editHomeRunsLabel);
		editHomeRunsPanel.add(editHomeRunsEntry);
		editStrikeoutSwingingPanel.add(editStrikeoutSwingingLabel);
		editStrikeoutSwingingPanel.add(editStrikeoutSwingingEntry);
		editStrikeoutLookingPanel.add(editStrikeoutLookingLabel);
		editStrikeoutLookingPanel.add(editStrikeoutLookingEntry);
		editSacFlyPanel.add(editSacFlyLabel);
		editSacFlyPanel.add(editSacFlyEntry);
		editSacBuntPanel.add(editSacBuntLabel);
		editSacBuntPanel.add(editSacBuntEntry);
		editLineDrivePanel.add(editLineDriveLabel);
		editLineDrivePanel.add(editLineDriveEntry);
		editFlyBallPanel.add(editFlyBallLabel);
		editFlyBallPanel.add(editFlyBallEntry);
		editRBIsPanel.add(editRBIsLabel);
		editRBIsPanel.add(editRBIsEntry);
		editRunsScoredPanel.add(editRunsScoredLabel);
		editRunsScoredPanel.add(editRunsScoredEntry);
		editStolenBasesPanel.add(editStolenBasesLabel);
		editStolenBasesPanel.add(editStolenBasesEntry);
		editGameInstructionsPanel.add(editGameInstructionLabel);
		gameToEditDisplayPanel.add(editGameDatePanel);
		gameToEditDisplayPanel.add(editPlateAppearancesPanel);
		gameToEditDisplayPanel.add(editWalksPanel);
		gameToEditDisplayPanel.add(editHBPsPanel);
		gameToEditDisplayPanel.add(editTotalHitsPanel);
		gameToEditDisplayPanel.add(editOutFCOrErrorPanel);
		gameToEditDisplayPanel.add(editSinglesPanel);
		gameToEditDisplayPanel.add(editDoublesPanel);
		gameToEditDisplayPanel.add(editTriplesPanel);
		gameToEditDisplayPanel.add(editHomeRunsPanel);
		gameToEditDisplayPanel.add(editStrikeoutSwingingPanel);
		gameToEditDisplayPanel.add(editStrikeoutLookingPanel);
		gameToEditDisplayPanel.add(editSacFlyPanel);
		gameToEditDisplayPanel.add(editSacBuntPanel);
		gameToEditDisplayPanel.add(editLineDrivePanel);
		gameToEditDisplayPanel.add(editFlyBallPanel);
		gameToEditDisplayPanel.add(editRBIsPanel);
		gameToEditDisplayPanel.add(editRunsScoredPanel);
		gameToEditDisplayPanel.add(editStolenBasesPanel);
		editGameSaveChangesPanel.add(editGameSaveChangesButton);
		gameToEditDisplayPanel.add(editGameSaveChangesPanel);
		//show stats page
		statsTitlePanel.add(statsTitleLabel);
		showStatsPanel.add(statsTitlePanel);
		statsDisplayPart1Panel.add(showGameNumberLabel); //fill the tables with stats
		statsDisplayPart1Panel.add(showPlateAppearancesLabel);
		statsDisplayPart1Panel.add(showAtBatsLabel);
		statsDisplayPart1Panel.add(showRunsLabel);
		statsDisplayPart1Panel.add(showTotalHitsLabel);
		statsDisplayPart1Panel.add(showDoublesLabel);
		statsDisplayPart1Panel.add(showTriplesLabel);
		statsDisplayPart1Panel.add(showHRLabel);
		statsDisplayPart1Panel.add(showRBIsLabel);
		statsDisplayPart1Panel.add(showSBLabel);
		statsDisplayPart1Panel.add(showBBsLabel);
		statsDisplayPart1Panel.add(showTotalKsLabel);
		statsDisplayPart1Panel.add(showLookingKsLabel);
		statsDisplayPart1Panel.add(showSwingingKsLabel);
		statsDisplayPart1Panel.add(showGameNumberStatsLabel);
		statsDisplayPart1Panel.add(showPlateAppearancesStatsLabel);
		statsDisplayPart1Panel.add(showAtBatsStatsLabel);
		statsDisplayPart1Panel.add(showRunsStatsLabel);
		statsDisplayPart1Panel.add(showTotalHitsStatsLabel);
		statsDisplayPart1Panel.add(showDoublesStatsLabel);
		statsDisplayPart1Panel.add(showTriplesStatsLabel);
		statsDisplayPart1Panel.add(showHRStatsLabel);
		statsDisplayPart1Panel.add(showRBIsStatsLabel);
		statsDisplayPart1Panel.add(showSBStatsLabel);
		statsDisplayPart1Panel.add(showBBsStatsLabel);
		statsDisplayPart1Panel.add(showTotalKsStatsLabel);
		statsDisplayPart1Panel.add(showLookingKsStatsLabel);
		statsDisplayPart1Panel.add(showSwingingKsStatsLabel);
		statsDisplayPart2Panel.add(showAVGLabel); //table 2
		statsDisplayPart2Panel.add(showOBPLabel);
		statsDisplayPart2Panel.add(showSLGLabel);
		statsDisplayPart2Panel.add(showOPSLabel);
		statsDisplayPart2Panel.add(showTBLabel);
		statsDisplayPart2Panel.add(showHBPLabel);
		statsDisplayPart2Panel.add(showSacBuntLabel);
		statsDisplayPart2Panel.add(showSacFlyLabel);
		statsDisplayPart2Panel.add(showBABIPLabel);
		statsDisplayPart2Panel.add(showLDLabel);
		statsDisplayPart2Panel.add(showFBLabel);
		statsDisplayPart2Panel.add(showGBLabel);
		statsDisplayPart2Panel.add(showBBPerLabel);
		statsDisplayPart2Panel.add(showKPerLabel);
		statsDisplayPart2Panel.add(showHRPerFBLabel);
		statsDisplayPart2Panel.add(showAVGStatsLabel);
		statsDisplayPart2Panel.add(showOBPStatsLabel);
		statsDisplayPart2Panel.add(showSLGStatsLabel);
		statsDisplayPart2Panel.add(showOPSStatsLabel);
		statsDisplayPart2Panel.add(showTBStatsLabel);
		statsDisplayPart2Panel.add(showHBPStatsLabel);
		statsDisplayPart2Panel.add(showSacBuntStatsLabel);
		statsDisplayPart2Panel.add(showSacFlyStatsLabel);
		statsDisplayPart2Panel.add(showBABIPStatsLabel);
		statsDisplayPart2Panel.add(showLDStatsLabel);
		statsDisplayPart2Panel.add(showFBStatsLabel);
		statsDisplayPart2Panel.add(showGBStatsLabel);
		statsDisplayPart2Panel.add(showBBPerStatsLabel);
		statsDisplayPart2Panel.add(showKPerStatsLabel);
		statsDisplayPart2Panel.add(showHRPerFBStatsLabel);
		showStatsPanel.add(statsDisplayPart1Panel);
		showStatsPanel.add(statsDisplayPart2Panel);
		homeButtonPanel.add(homeButton); //home button

		//set unneeded buttons/panels to false visibility
		teamNamePanel.setVisible(false);
		seasonSelectionPanel.setVisible(false);
		yearPanel.setVisible(false);
		newSeasonSubmitButtonPanel.setVisible(false);
		newSeasonAddGamePanel.setVisible(false);
		addGameStatsPanel.setVisible(false);
		addEditShowStatsPanel.setVisible(false);
		editGameInstructionsPanel.setVisible(false);
		gameToEditDisplayPanel.setVisible(false);
		gameToEditDisplayPanel.setVisible(false);
		showStatsPanel.setVisible(false);
		homeButton.setVisible(false);
	
		//panels need to be added on top of the background image
		setLayout(new BorderLayout());
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
		backgroundImage.add(showStatsPanel);
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
			boxChoice = ts.fillSeasonToLoadComboBox();
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
			//we need to split the comboBox string into separate components to use for OneSeason
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
			addEditShowStatsPanel.setVisible(false);
			ts.findGameNumber();
			addGameStatsPanel.setVisible(true);
		}
	}
	
	class editGameButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			addEditShowStatsPanel.setVisible(false);
			ArrayList<String> comboBoxChoice = new ArrayList<String>();
			comboBoxChoice = ts.fillGameToEditComboBox();
			gameToEdit = new JComboBox(comboBoxChoice.toArray());
			selectGameToEditComboLabel.setAlignmentX(CENTER_ALIGNMENT);
			selectGameToEditComboPanel.add(gameToEdit);
			selectGameToEditComboPanel.add(gameToEditSubmitButton);
			selectGameToEditPanel.add(selectGameToEditComboLabel);
			selectGameToEditPanel.add(selectGameToEditComboPanel);
			selectGameToEditPanel.setVisible(true);
			backgroundImage.add(selectGameToEditPanel);
		}
	}
	
	class gameToEditSubmitButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String gameChoice = gameToEdit.getSelectedItem().toString();
			String[] splitGameChoice = gameChoice.split(",|\\s"); //split the string into pieces
			int gameNum = Integer.parseInt(splitGameChoice[1]);//extract game number
			OneGame gameToEditDisplay = new OneGame();
			gameToEditDisplay = ts.gameNumberToEditStats(gameNum); //set gameToEditDisplay to use in JTextFields
			editGameInstructionLabel.setText("Edit Stats for Game #" + gameToEditDisplay.getGameNumber() 
					+ " and Save Changes:");
			selectGameToEditPanel.add(editGameInstructionsPanel);//add panels so they appear in order
			selectGameToEditPanel.add(gameToEditDisplayPanel);
			editGameInstructionsPanel.setVisible(true);
			gameToEditDisplayPanel.setVisible(true);
			//set JTextAreas to current value
			editDateEntry.setText(gameToEditDisplay.getGameDate().toString());
			editPlateAppearancesEntry.setText(Integer.toString(gameToEditDisplay.getPlateAppearances()));
			editWalksEntry.setText(Integer.toString(gameToEditDisplay.getWalks()));
			editHBPsEntry.setText(Integer.toString(gameToEditDisplay.getHBPs()));
			editTotalHitsEntry.setText(Integer.toString(gameToEditDisplay.getTotalHits()));
			editOutFCOrErrorEntry.setText(Integer.toString(gameToEditDisplay.getOutFCOrError()));
			editSinglesEntry.setText(Integer.toString(gameToEditDisplay.getSingles()));
			editDoublesEntry.setText(Integer.toString(gameToEditDisplay.getDoubles()));
			editTriplesEntry.setText(Integer.toString(gameToEditDisplay.getTriples()));
			editHomeRunsEntry.setText(Integer.toString(gameToEditDisplay.getHomeRuns()));
			editStrikeoutSwingingEntry.setText(Integer.toString(gameToEditDisplay.getStrikeoutSwinging()));
			editStrikeoutLookingEntry.setText(Integer.toString(gameToEditDisplay.getStrikeoutLooking()));
			editSacFlyEntry.setText(Integer.toString(gameToEditDisplay.getSacFly()));
			editSacBuntEntry.setText(Integer.toString(gameToEditDisplay.getSacBunt()));
			editLineDriveEntry.setText(Integer.toString(gameToEditDisplay.getLineDrive()));
			editFlyBallEntry.setText(Integer.toString(gameToEditDisplay.getFlyBall()));
			editRBIsEntry.setText(Integer.toString(gameToEditDisplay.getRBIs()));
			editRunsScoredEntry.setText(Integer.toString(gameToEditDisplay.getRunsScored()));
			editStolenBasesEntry.setText(Integer.toString(gameToEditDisplay.getStolenBases()));
		}
	}
	
	class editGameSaveChangesButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//split the Label string to extract game number
			String[] splitString = editGameInstructionLabel.getText().split("#");
			String[] splitStringForGameNum = splitString[1].split("\\s");
			int gameNum = Integer.parseInt(splitStringForGameNum[0]);
			System.out.println("Save Changes #:" + gameNum);
			OneGame updatedGame = new OneGame();
			updatedGame.setGameNumber(gameNum);
			//get input from JTextField
			updatedGame.setPlateAppearances(Integer.parseInt(editPlateAppearancesEntry.getText()));
			updatedGame.setWalks(Integer.parseInt(editWalksEntry.getText()));
			updatedGame.setHBPs(Integer.parseInt(editHBPsEntry.getText()));
			updatedGame.setTotalHits(Integer.parseInt(editTotalHitsEntry.getText()));
			updatedGame.setOutFCOrError(Integer.parseInt(editOutFCOrErrorEntry.getText()));
			updatedGame.setSingles(Integer.parseInt(editSinglesEntry.getText()));
			updatedGame.setDoubles(Integer.parseInt(editDoublesEntry.getText()));
			updatedGame.setTriples(Integer.parseInt(editTriplesEntry.getText()));
			updatedGame.setHomeRuns(Integer.parseInt(editHomeRunsEntry.getText()));
			updatedGame.setStrikeoutSwinging(Integer.parseInt(editStrikeoutSwingingEntry.getText()));
			updatedGame.setStrikeoutLooking(Integer.parseInt(editStrikeoutLookingEntry.getText()));
			updatedGame.setSacFly(Integer.parseInt(editSacFlyEntry.getText()));
			updatedGame.setSacBunt(Integer.parseInt(editSacBuntEntry.getText()));
			updatedGame.setLineDrive(Integer.parseInt(editLineDriveEntry.getText()));
			updatedGame.setFlyBall(Integer.parseInt(editFlyBallEntry.getText()));
			updatedGame.setRBIs(Integer.parseInt(editRBIsEntry.getText()));
			updatedGame.setRunsScored(Integer.parseInt(editRunsScoredEntry.getText()));
			updatedGame.setStolenBases(Integer.parseInt(editStolenBasesEntry.getText()));
			ts.updateGameStats(updatedGame);
		}
	}
	
	class showStatsButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ComputeStats statsToDisplay = ts.compileSeasonStats();
			DecimalFormat d = new DecimalFormat(".000"); //set format to display
			addEditShowStatsPanel.setVisible(false);
			statsTitleLabel.setText(ts.getCurrentSeason().toString());//set name to current season
			//set label component texts to match compiled stats
			showGameNumberStatsLabel.setText(Integer.toString(statsToDisplay.getStatGamesPlayed()));
			showPlateAppearancesStatsLabel.setText(Integer.toString(statsToDisplay.getStatPAs()));
			showAtBatsStatsLabel.setText(Integer.toString(statsToDisplay.getStatABs()));
			showRunsStatsLabel.setText(Integer.toString(statsToDisplay.getStatRuns()));
			showTotalHitsStatsLabel.setText(Integer.toString(statsToDisplay.getStatHits()));
			showDoublesStatsLabel.setText(Integer.toBinaryString(statsToDisplay.getStat2B()));
			showTriplesStatsLabel.setText(Integer.toString(statsToDisplay.getStat3B()));
			showHRStatsLabel.setText(Integer.toString(statsToDisplay.getStatHR()));
			showRBIsStatsLabel.setText(Integer.toString(statsToDisplay.getStatRBI()));
			showSBStatsLabel.setText(Integer.toString(statsToDisplay.getStatSB()));
			showBBsStatsLabel.setText(Integer.toString(statsToDisplay.getStatBB()));
			showTotalKsStatsLabel.setText(Integer.toString(statsToDisplay.getStatTotalK()));
			showLookingKsStatsLabel.setText(Integer.toString(statsToDisplay.getStatLookingK()));
			showSwingingKsStatsLabel.setText(Integer.toString(statsToDisplay.getStatSwingingK()));
			showAVGStatsLabel.setText(d.format(statsToDisplay.getStatBA()));
			showOBPStatsLabel.setText(d.format(statsToDisplay.getStatOBP()));
			showSLGStatsLabel.setText(d.format(statsToDisplay.getStatSLG()));
			showOPSStatsLabel.setText(d.format(statsToDisplay.getStatOPS()));
			showTBStatsLabel.setText(Integer.toString(statsToDisplay.getStatTB()));
			showHBPStatsLabel.setText(Integer.toString(statsToDisplay.getStatHBP()));
			showSacBuntStatsLabel.setText(Integer.toString(statsToDisplay.getStatSacB()));
			showSacFlyStatsLabel.setText(Integer.toString(statsToDisplay.getStatSacF()));
			showBABIPStatsLabel.setText(d.format(statsToDisplay.getStatBABIP()));
			showLDStatsLabel.setText(d.format(statsToDisplay.getStatLDPer()));
			showFBStatsLabel.setText(d.format(statsToDisplay.getStatFBPer()));
			showGBStatsLabel.setText(d.format(statsToDisplay.getStatGBPer()));
			showBBPerStatsLabel.setText(d.format(statsToDisplay.getStatBBPer()));
			showKPerStatsLabel.setText(d.format(statsToDisplay.getStatKPer()));
			showHRPerFBStatsLabel.setText(d.format(statsToDisplay.getStatHRPerFB()));
			
			showStatsPanel.setVisible(true);
		}
	}
	class addStatsSubmitButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//get the input from JTextField
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
			
			ts.enterGameStats(date, plateAps, walks, hbp, hits, outs, oneB, twoB, threeB, 
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
			selectGameToEditPanel.setVisible(false);
			
			//need to set all textfields to empty
			
			loadSeasonComboBoxPanel.removeAll();
			loadSeasonPanel.removeAll();
		}
	}
	

}