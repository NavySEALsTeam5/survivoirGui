import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;

public class GameContent extends JPanel {
  boolean leftPanelVisible = false;
  
  JPanel leftPanel = new JPanel();
  
  Label story = new Label();
  
  Label elevator = new Label();
  
  Label infoMoney = new Label();
  
  Label infoArmor = new Label();
  
  Label infoHealth = new Label();
  
  Label infoCurrentItem = new Label();
  
  Label infoAmmo = new Label();
  
  Label infoObtained = new Label();
  
  Label infoObtained2 = new Label();
  
  Label infoKeys = new Label();
  
  Label inElevatorLabel = new Label();
  
  Panel topWall = new Panel();
  
  Panel leftWall = new Panel();
  
  Panel rightWallTopBottomFloor = new Panel();
  
  Panel rightWallBottomBottomFloor = new Panel();
  
  Panel rightWall = new Panel();
  
  Panel bottomWall = new Panel();
  
  int Screen_width = 1010;
  
  int Screen_hiegth = 700;
  
  public String[][][] building = new String[60][100][17];
  
  public String[][][] roomArrangeMentBottomFloor = new String[60][100][17];
  
  public String[] carpetDesign = new String[10];
  
  public int floorSquares;
  
  public int[][][] itemChart = new int[60][100][17];
  
  public static Set<SearchableItemRare> rareItemsFound = new HashSet<>();
  
  int[][] deskXCoordinates = new int[10][17];
  
  int[][] deskYCoordinates = new int[10][17];
  
  int[][] deskDirection = new int[10][17];
  
  int[][] zombieX = new int[10][17];
  
  int[][] zombieY = new int[10][17];
  
  int[] zombieXRoof = new int[15];
  
  int[] zombieYRoof = new int[15];
  
  int[][] moneyX = new int[10][17];
  
  int[][] moneyY = new int[10][17];
  
  int[] moneyXArmory = new int[4];
  
  int[] moneyYArmory = new int[4];
  
  int[][] boxX = new int[2][17];
  
  int[][] boxY = new int[2][17];
  
  int xOfObject;
  
  int yOfObject;
  
  String[] objects = new String[8];
  
  int[] moneyPiles = new int[50];
  
  int totalMoney;
  
  int moneyFound;
  
  boolean moneyFoundBoolean;
  
  Random rando = new Random();
  
  String name = "";
  
  Scanner mainScanner = new Scanner(System.in);
  
  String action = "";
  
  String message1 = "";
  
  String[] message = new String[100];
  
  int playerPositionX;
  
  int playerPositionY;
  
  int whereToX = 0;
  
  int whereToY = 0;
  
  int x = 295;
  
  int y = 350;
  
  boolean validMove;
  
  String direction = "";
  
  boolean hasBasementKey = true;
  
  boolean hasRoofKey = true;
  
  boolean hasRadio = true;
  
  boolean infoVisible = false;
  
  int health = 100;
  
  boolean healthVisible = false;
  
  int armor = 100;
  
  int ammo;
  
  int timesMoved = 0;
  
  int messageChoice = 0;
  
  String itemName = "";
  
  boolean storyWatched = false;
  
  int floorWanted = 0;
  
  public int currentFloor = 1;
  
  boolean oneIsPressed = false;
  
  boolean inElevator = false;
  
  boolean eCutSeenWatched = true;
  
  boolean hasKey;
  
  boolean floorLocked = false;
  
  boolean keepOrNot = false;
  
  int currentItemInt = 1;
  
  int items = 0;
  
  String[] inventory = new String[12];
  
  int playerTotalItems = 0;
  
  String[] obtainableItemsCommon = new String[20];
  
  String[] obtainableItemsRare = new String[10];
  
  String[] obtainableItemsEpic = new String[10];
  
  int armoryFloor;
  
  boolean armoryOpen = false;
  
  boolean hasArmoryKey = false;
  
  int[][][] boxNumTracker = new int[60][100][17];
  
  int[][][] keyNumTracker = new int[60][100][17];
  
  int boxOneKeyFloor;
  
  int boxNumOn = 1;
  
  int boxNums = 0;
  
  public static String[] boxItemArray = new String[30];
  
  boolean[] hasBoxKeyNum = new boolean[15];
  
  boolean[] floorHasKey = new boolean[15];
  
  boolean boxJustOpened = false;
  
  boolean startBoxOpen = false;
  
  boolean zombieGame = false;
  
  String[][] board = new String[25][60];
  
  int[][] boardValues = new int[25][60];
  
  int playerCurrentY = 10;
  
  int miniY;
  
  int timeDelay = 0;
  
  int damage = 5;
  
  int reloadTime = 0;
  
  int reloadTimeNeeded = 6000;
  
  boolean semiAuto = true;
  
  boolean explosive = false;
  
  int difficulty = 0;
  
  int timeBeforeNextWave;
  
  int timeBeforeNextMove;
  
  int zombHealth = 100;
  
  int deadZombies;
  
  int zombiesKilledOnFloor;
  
  int zombiesAllowedPerLevel = 15;
  
  int totalZombies = 0;
  
  boolean canShoot = true;
  
  boolean reloaded = true;
  
  boolean mortarTeam = false;
  
  boolean RPGOut = false;
  
  int timeBeforeRpgMove = 0;
  
  boolean RPGreload = true;
  
  int RPG;
  
  int shotsFired = 0;
  
  int lane0;
  
  int lane1;
  
  int lane2;
  
  int lane3;
  
  int lane4;
  
  int lane5;
  
  int lane6;
  
  int lane7;
  
  int lane8;
  
  int lane9;
  
  int lane10;
  
  int lane11;
  
  int lane12;
  
  int lane13;
  
  int lane14;
  
  int lane15;
  
  int lane16;
  
  int lane17;
  
  int lane18;
  
  int lane19;
  
  int lane20;
  
  int lane21;
  
  int lane22;
  
  int lane23;
  
  int lane24;
  
  int lane0Move;
  
  int lane1Move;
  
  int lane2Move;
  
  int lane3Move;
  
  int lane4Move;
  
  int lane5Move;
  
  int lane6Move;
  
  int lane7Move;
  
  int lane8Move;
  
  int lane9Move;
  
  int lane10Move;
  
  int lane11Move;
  
  int lane12Move;
  
  int lane13Move;
  
  int lane14Move;
  
  int lane15Move;
  
  int lane16Move;
  
  int lane17Move;
  
  int lane18Move;
  
  int lane19Move;
  
  int lane20Move;
  
  int lane21Move;
  
  int lane22Move;
  
  int lane23Move;
  
  int lane24Move;
  
  boolean timerExist = false;
  
  boolean timerExist2 = false;
  
  Timer timer = new Timer();
  
  Timer timer2 = new Timer();
  
  TimerTask task;
  
  TimerTask task2;
  
  int time = 0;
  
  int time2 = 0;
  
  int time3 = 0;
  
  int time4 = 0;
  
  boolean running = false;
  
  boolean running1 = false;
  
  boolean running2 = false;
  
  String[] music = new String[5];
  
  boolean zombieScreamClipOpen = false;
  
  boolean zombieDeathOpen = false;
  
  boolean explosionClipOpen = false;
  
  Clip clip;
  
  Clip zombieScreamClip;
  
  Clip zombieDeathClip;
  
  Clip weaponClip;
  
  Clip minigunClip;
  
  Clip explosionClip;
  
  AudioInputStream zombieScreamAudioInputStream;
  
  AudioInputStream zombieDeathAudioInputStream;
  
  AudioInputStream weaponAudioInputStream;
  
  AudioInputStream minigunAudioInputStream;
  
  AudioInputStream explosionInputStream;
  
  File zombieScreamFile = new File("zombieScream.wav");
  
  File zombieDeathFile = new File("zombieDeath.wav");
  
  File glockFile = new File("glock.wav");
  
  File uziFile = new File("Uzi1.wav");
  
  File thirtyFile = new File("306Shot.wav");
  
  File fiftyCalFile = new File("50CalSniper.wav");
  
  File ar_15File = new File("AR_15.wav");
  
  File M16File = new File("M16.wav");
  
  File PKMFile = new File("PKM.wav");
  
  File fiftyMachineGunFile = new File("50MachineGun.wav");
  
  File mas = new File("M&Sfire.wav");
  
  File minigun = new File("M&Sfire.wav");
  
  File explosionFile = new File("Explosion.wav");
  
  int zombieScream;
  
  int nextScream;
  
  int zombiesDeadUntilDeath = 2;
  
  int deadZombiesDeath = 0;
  
  int endCount = 0;
  
  boolean RPGAlive = false;
  
  boolean stillZombies = false;
  
  String currentItem = "Marley and Harley";
  
  GameContent() {
    setPreferredSize(new Dimension(this.Screen_width, this.Screen_hiegth));
    setBackground(Color.black);
    this.leftPanel.setBackground(Color.red);
    this.leftPanel.setBounds(0, 0, 100, 610);
    this.topWall.setBounds(2, 47, 303, 3);
    this.leftWall.setBounds(2, 47, 3, 603);
    this.bottomWall.setBounds(2, 650, 300, 3);
    this.rightWallTopBottomFloor.setBounds(302, 47, 3, 283);
    this.rightWallBottomBottomFloor.setBounds(302, 370, 3, 283);
    this.rightWall.setBounds(302, 47, 3, 600);
    this.infoMoney.setBounds(10, 3, 60, 20);
    this.infoHealth.setBounds(100, 3, 80, 20);
    this.infoArmor.setBounds(200, 3, 80, 20);
    this.infoCurrentItem.setBounds(10, 30, 200, 20);
    this.infoAmmo.setBounds(220, 30, 80, 20);
    this.infoObtained.setBounds(500, 3, 500, 20);
    this.infoObtained2.setBounds(500, 23, 500, 20);
    this.infoKeys.setBounds(0, 3, 1000, 40);
    this.inElevatorLabel.setBounds(0, 330, 300, 50);
    this.story.setBounds(0, 0, 1010, 700);
    this.topWall.setBackground(new Color(150, 75, 0));
    this.leftWall.setBackground(new Color(150, 75, 0));
    this.bottomWall.setBackground(new Color(150, 75, 0));
    this.rightWallTopBottomFloor.setBackground(new Color(150, 75, 0));
    this.rightWallBottomBottomFloor.setBackground(new Color(150, 75, 0));
    this.rightWall.setBackground(new Color(150, 75, 0));
    this.infoMoney.setBackground(Color.black);
    this.infoHealth.setBackground(Color.black);
    this.infoArmor.setBackground(Color.black);
    this.infoCurrentItem.setBackground(Color.black);
    this.infoAmmo.setBackground(Color.black);
    this.infoObtained.setBackground(new Color(0, 0, 0));
    this.infoObtained2.setBackground(new Color(0, 0, 0));
    this.story.setBackground(Color.black);
    this.inElevatorLabel.setBackground(new Color(0, 0, 0));
    this.story.setFont(new Font("MV Boli", 0, 40));
    this.infoMoney.setForeground(new Color(57, 255, 20));
    this.infoHealth.setForeground(new Color(128, 0, 128));
    this.infoArmor.setForeground(new Color(0, 0, 128));
    this.infoCurrentItem.setForeground(new Color(255, 69, 0));
    this.infoAmmo.setForeground(new Color(128, 0, 0));
    this.infoObtained.setForeground(new Color(255, 173, 0));
    this.infoObtained2.setForeground(new Color(255, 173, 0));
    this.story.setForeground(Color.red);
    this.infoKeys.setForeground(Color.orange);
    this.inElevatorLabel.setForeground(Color.orange);
    add(this.topWall);
    add(this.leftWall);
    add(this.bottomWall);
    add(this.rightWallTopBottomFloor);
    add(this.rightWallBottomBottomFloor);
    add(this.rightWall);
    add(this.infoMoney);
    add(this.infoHealth);
    add(this.infoArmor);
    add(this.infoCurrentItem);
    add(this.infoAmmo);
    add(this.infoObtained);
    add(this.infoObtained2);
    add(this.story);
    add(this.infoKeys);
    add(this.inElevatorLabel);
    setSize(1000, 500);
    add(this.topWall);
    add(this.leftWall);
    add(this.bottomWall);
    setFocusable(true);
    setLayout((LayoutManager)null);
    setVisible(true);
    this.rightWall.setVisible(false);
    this.leftWall.setVisible(false);
    this.topWall.setVisible(false);
    this.bottomWall.setVisible(false);
    this.rightWallTopBottomFloor.setVisible(false);
    this.rightWallBottomBottomFloor.setVisible(false);
    this.infoMoney.setVisible(false);
    this.infoHealth.setVisible(false);
    this.infoArmor.setVisible(false);
    this.infoCurrentItem.setVisible(false);
    this.infoAmmo.setVisible(false);
    this.infoObtained.setVisible(false);
    this.infoObtained2.setVisible(false);
    this.story.setVisible(false);
    this.infoKeys.setVisible(false);
    this.inElevatorLabel.setVisible(false);
    addKeyListener(new MyKeyAdapter());
    this.inElevatorLabel.setText("Type in the floor number and hit g.");
    for (int j = 0; j < 15; j++)
      this.hasBoxKeyNum[j] = false; 
    this.hasKey = true;
    this.message[0] = "";
    int e;
    for (e = 0; e < 17; e++) {
      for (int k = 0; k < 60; k++) {
        for (int m = 0; m < 100; m++)
          this.roomArrangeMentBottomFloor[k][m][e] = " "; 
      } 
    } 
    this.objects[0] = "[";
    this.objects[1] = "]";
    this.objects[2] = "$";
    this.objects[3] = "?";
    this.objects[4] = "z";
    this.objects[5] = "^";
    for (e = 0; e < 17; e++) {
      for (int k = 0; k < 60; k++) {
        for (int m = 0; m < 100; m++)
          this.building[k][m][e] = " "; 
      } 
    } 
    int i;
    for (i = 0; i < 20; i++) {
      for (int k = 0; k < 40; k++) {
        this.board[i][k] = " ";
        this.boardValues[i][k] = 0;
      } 
    } 
    this.building[30][99][1] = "P";
    for (i = 0; i < this.inventory.length; i++)
      this.inventory[i] = " "; 
    this.music[0] = "CODmusic.wav";
    this.music[1] = "QUEENmusic.wav";
    this.board[0][55] = "P";
    this.inventory[0] = "RPG";
    this.inventory[1] = "M16";
    this.inventory[2] = "Marley and Harley";
    this.inventory[3] = "50 Cal Sniper Rifle";
    this.inventory[4] = "50 Cal Machine Gun";
    this.inventory[5] = "Uzi";
    this.inventory[6] = "306 rifle";
    this.inventory[7] = "AR_15";
    bottomFloor();
    allFloors();
    basement();
    searchableItemGenerator();
    gamePlay();
    randomZombie();
    randomDesk();
    randomMoney();
    randomMoneyGenerator();
  }
  
  public void storyLine(Graphics g) {
    this.story.setVisible(true);
    this.story.setText("Welcome to survivor.");
    SpecialFunctions.sleep(3000);
    this.story.setText("Here is how to play.");
    SpecialFunctions.sleep(5000);
    this.story.setText("Arrow keys allow you to move.");
    SpecialFunctions.sleep(5000);
    this.story.setText("Search each floor of the building for supplies.");
    SpecialFunctions.sleep(5000);
    this.story.setText("Main objective is to get to the roof to escape.");
    SpecialFunctions.sleep(5000);
    this.story.setText("Killing zombie will get you points.");
    SpecialFunctions.sleep(5000);
    this.story.setText("When in the zombie mini game mode,");
    SpecialFunctions.sleep(2500);
    this.story.setText("press space to fire your weapon.");
    SpecialFunctions.sleep(4000);
    this.story.setText("Press 'i' for info.");
    SpecialFunctions.sleep(5000);
    this.story.setText("Money($) can be used at");
    SpecialFunctions.sleep(3000);
    this.story.setText("vending machines to purchase supplies.");
    SpecialFunctions.sleep(4000);
    this.story.setText("Welcome survivor...");
    SpecialFunctions.sleep(5000);
    this.story.setText("Congrats on surving this far into the apocolapyse.");
    SpecialFunctions.sleep(5000);
    this.story.setText("Unfortunately your not in the clear yet.");
    SpecialFunctions.sleep(4000);
    this.story.setText("You must make it to the top of the building,");
    SpecialFunctions.sleep(3000);
    this.story.setText("to be comepletely safe.");
    SpecialFunctions.sleep(3000);
    this.story.setText("Good Luck. You'll need it...");
    SpecialFunctions.sleep(6000);
    this.storyWatched = true;
    this.story.setVisible(false);
    this.rightWallTopBottomFloor.setVisible(true);
    this.rightWallBottomBottomFloor.setVisible(true);
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    draw(g);
  }
  
  public void draw(Graphics g) {
    int num1 = 0;
    int num2 = 0;
    if (this.currentFloor != 16);
    if (this.zombieGame) {
      ZombieMiniGameGraphics.layout(g);
      ZombieMiniGameGraphics.drawMan(g, 825, this.miniY * 15 + 150, this.currentItem);
      for (int i = 0; i < 60; i++) {
        for (int j = 0; j < 25; j++) {
          if (this.board[j][i] == "b")
            ZombieMiniGameGraphics.drawBullets(g, i * 15, j * 15, this.currentItem); 
          if (this.board[j][i] == "z")
            ZombieMiniGameGraphics.drawZombies(g, i * 15, j * 15); 
          if (this.board[j][i] == "RPG")
            ZombieMiniGameGraphics.drawRPG(g, i * 15, j * 15); 
        } 
      } 
    } 
    if (!this.zombieGame) {
      if (this.timesMoved > 7)
        this.infoObtained.setVisible(false); 
      if (this.timesMoved < 7)
        switch (this.messageChoice) {
          case 1:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You found $" + this.moneyFound);
            break;
          case 2:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You found " + this.itemName + ". This junk is not worth keeping.");
            break;
          case 3:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You found " + this.itemName + "!!!");
            break;
          case 4:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText(this.message1);
            break;
          case 5:
            this.infoObtained.setVisible(true);
            break;
          case 6:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You can leave when the zombies are dead or when you are.");
            break;
          case 8:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You have found the roof key!");
            break;
          case 9:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You have found the radio use it to call in the chopper!");
            break;
          case 10:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You cannot go to the roof until you have found the radio.");
            break;
          case 11:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You cannot go to the roof until you have found the roof key.");
            break;
          case 12:
            this.infoObtained.setVisible(true);
            this.infoObtained.setText("You cannot go to the basement untill you have found the basement key.");
            break;
        }  
      if (this.infoVisible) {
        this.infoMoney.setText("$" + this.totalMoney);
        this.infoHealth.setText("Health: " + this.health);
        this.infoArmor.setText("Armor: " + this.armor);
        this.infoCurrentItem.setText("Weapon: " + this.currentItem);
        this.infoAmmo.setText("Ammo: " + this.ammo);
      } 
      if (this.infoKeys.isVisible()) {
        int i = 1;
        this.infoKeys.setText("Key 1: " + this.hasBoxKeyNum[0] + " " + "Key 2: " + this.hasBoxKeyNum[1] + " " + "Key 3: " + this.hasBoxKeyNum[2] + " " + "Key 4: " + this.hasBoxKeyNum[3] + " " + "Key 5: " + this.hasBoxKeyNum[4] + " " + "Key 6: " + this.hasBoxKeyNum[5] + " " + "Key 7: " + this.hasBoxKeyNum[6] + " " + "Key 8: " + this.hasBoxKeyNum[7] + " " + "Key 9: " + this.hasBoxKeyNum[8] + " " + "Key 10: " + this.hasBoxKeyNum[9] + " " + "Key 11: " + this.hasBoxKeyNum[10] + " " + "Key 12: " + this.hasBoxKeyNum[11] + " " + "Key 13: " + this.hasBoxKeyNum[12] + " " + "Key 14: " + this.hasBoxKeyNum[13] + " " + "Key 15: " + this.hasBoxKeyNum[14] + " ");
      } 
      if (this.currentFloor != 16) {
        g.setColor(new Color(128, 0, 0));
      } else {
        g.setColor(new Color(132, 133, 124));
      } 
      if (this.currentFloor != 0) {
        g.fillRect(5, 50, 297, 600);
        g.setColor(new Color(192, 192, 192));
        g.fillRect(5, 320, 50, 60);
      } 
      if (this.currentFloor == 16)
        Roof.heliPad(g); 
      if (this.currentFloor > 1 && 
        !this.inElevator)
        this.rightWall.setVisible(true); 
      if (this.currentFloor == 0)
        Basement.basement(g); 
      if (this.currentFloor == 1) {
        g.setColor(new Color(34, 139, 34));
        g.fillRect(305, 50, 705, 600);
      } 
      if (this.currentFloor == 1) {
        Road.road(g);
        Road.yellowLines(g);
        Road.sideWalk(g);
        Road.whiteLine(g);
        WalkWays.drawTopWalkWay(g);
        WalkWays.drawMiddleWalkWay(g);
        WalkWays.drawBottomWalkWay(g);
        Fountain.fountain(g);
        DrawStairs.concrete(g);
        DrawStairs.drawRails(g);
        DrawStairs.drawTop(g);
        DrawStairs.drawTopStairs(g);
        DrawStairs.drawTopUnderside(g);
        DrawStairs.drawMiddle(g);
        DrawStairs.drawMiddleStairs(g);
        DrawStairs.drawBottom(g);
        DrawStairs.drawBottomUnderside(g);
      } 
      if (this.currentFloor != 16 || this.currentFloor != 0)
        DrawElevator.draw(g); 
      if (this.currentFloor == 1) {
        g.setColor(Color.gray);
        g.drawLine(55, 330, 304, 330);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(55, 331, 250, 40);
        g.setColor(Color.gray);
        g.drawLine(55, 370, 304, 370);
      } 
      if (this.currentFloor != 16 || this.currentFloor != 0) {
        int i;
        for (i = 0; i < 10; i++) {
          if (this.currentFloor != 16 || this.currentFloor != 0) {
            this.yOfObject = this.deskYCoordinates[i][this.currentFloor];
            this.xOfObject = this.deskXCoordinates[i][this.currentFloor];
          } 
          if (this.deskDirection[i][this.currentFloor] == 0) {
            Desk.draw1(g, this.xOfObject, this.yOfObject);
          } else if (this.deskDirection[i][this.currentFloor] == 1) {
            Desk.draw2(g, this.xOfObject, this.yOfObject);
          } 
          if (this.deskDirection[i][this.currentFloor] == 2)
            Desk.draw3(g, this.xOfObject, this.yOfObject); 
          if (this.deskDirection[i][this.currentFloor] == 3)
            Desk.draw4(g, this.xOfObject, this.yOfObject); 
        } 
        for (i = 0; i < 60; i++) {
          for (int j = 0; j < 100; j++) {
            if (this.building[i][j][this.currentFloor] == "z")
              Zombie.draw(g, j * 10 + 5, i * 10 + 50); 
          } 
        } 
        this.yOfObject = this.boxY[1][this.currentFloor];
        this.xOfObject = this.boxX[1][this.currentFloor];
        Chest.draw(g, this.xOfObject, this.yOfObject);
        for (i = 0; i < 10; i++) {
          this.yOfObject = this.moneyY[i][this.currentFloor];
          this.xOfObject = this.moneyX[i][this.currentFloor];
          if (this.yOfObject != 0) {
            num1 = (this.yOfObject - 50) / 10;
          } else {
            num1 = this.yOfObject;
          } 
          if (this.xOfObject != 0) {
            num2 = (this.xOfObject - 5) / 10;
          } else {
            num2 = this.xOfObject;
          } 
          if (this.building[num1][num2][this.currentFloor] == "$")
            Money.drawMoney(g, this.xOfObject, this.yOfObject); 
        } 
      } 
      if (this.currentFloor == this.armoryFloor)
        Armory.drawArmory(g, this.armoryOpen); 
      if (this.currentFloor == 16)
        for (int i = 0; i < 12; i++) {
          int zomY = this.zombieYRoof[i];
          int zomX = this.zombieXRoof[i];
          if (this.building[(zomY - 5) / 10][(zomX - 50) / 10][this.currentFloor] == " ")
            Roof.draw(g, zomX, zomY); 
        }  
      Man.drawMan(g, this.direction, this.x, this.y);
      if (this.currentFloor == 16)
        Roof.heliPadNet(g); 
      if (this.inElevator) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 1010, 700);
        Elevator.drawElevator(g);
      } 
    } 
  }
  
  public void allFloors() {
    for (int j = 0; j <= 16; j++) {
      for (int i = 0; i < 4; i++) {
        this.building[27][i][j] = "e";
        this.building[28][i][j] = "e";
        this.building[29][i][j] = "e";
        this.building[30][i][j] = "e";
        this.building[31][i][j] = "e";
        this.building[32][i][j] = "e";
      } 
      this.building[27][4][j] = "e";
      this.building[28][4][j] = "e";
      this.building[29][4][j] = "E";
      this.building[30][4][j] = "E";
      this.building[31][4][j] = "e";
      this.building[32][4][j] = "e";
    } 
  }
  
  public void basement() {
    int i;
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        this.building[0][j + i * 20][0] = "/";
        this.building[1][j + i * 20][0] = "/";
        this.building[2][j + i * 20][0] = "/";
        this.building[3][j + i * 20][0] = "/";
      } 
    } 
    for (i = 0; i < 3; i++) {
      this.building[3][97 + i][0] = "/";
      this.building[0][97 + i][0] = "/";
      this.building[1][97 + i][0] = "/";
      this.building[2][97 + i][0] = "/";
    } 
    int x = 12;
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        this.building[0 + x][j + i * 20][0] = "/";
        this.building[1 + x][j + i * 20][0] = "/";
        this.building[2 + x][j + i * 20][0] = "/";
      } 
    } 
    for (i = 0; i < 3; i++) {
      this.building[0 + x][97 + i][0] = "/";
      this.building[1 + x][97 + i][0] = "/";
      this.building[2 + x][97 + i][0] = "/";
    } 
    x = 23;
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        this.building[0 + x][j + i * 20][0] = "/";
        this.building[1 + x][j + i * 20][0] = "/";
        this.building[2 + x][j + i * 20][0] = "/";
        this.building[3 + x][j + i * 20][0] = "/";
      } 
    } 
    for (i = 0; i < 3; i++) {
      this.building[0 + x][97 + i][0] = "/";
      this.building[1 + x][97 + i][0] = "/";
      this.building[2 + x][97 + i][0] = "/";
      this.building[3 + x][97 + i][0] = "/";
    } 
    x = 33;
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        this.building[0 + x][j + i * 20][0] = "/";
        this.building[1 + x][j + i * 20][0] = "/";
        this.building[2 + x][j + i * 20][0] = "/";
      } 
    } 
    for (i = 0; i < 3; i++) {
      this.building[0 + x][97 + i][0] = "/";
      this.building[1 + x][97 + i][0] = "/";
      this.building[2 + x][97 + i][0] = "/";
    } 
    x = 44;
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        this.building[1 + x][j + i * 20][0] = "/";
        this.building[2 + x][j + i * 20][0] = "/";
        this.building[3 + x][j + i * 20][0] = "/";
      } 
    } 
    for (i = 0; i < 3; i++) {
      this.building[1 + x][97 + i][0] = "/";
      this.building[2 + x][97 + i][0] = "/";
      this.building[3 + x][97 + i][0] = "/";
    } 
    x = 56;
    for (i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        this.building[0 + x][j + i * 20][0] = "/";
        this.building[1 + x][j + i * 20][0] = "/";
        this.building[2 + x][j + i * 20][0] = "/";
      } 
    } 
    for (i = 0; i < 3; i++) {
      this.building[0 + x][97 + i][0] = "/";
      this.building[1 + x][97 + i][0] = "/";
      this.building[2 + x][97 + i][0] = "/";
    } 
  }
  
  public void movement(String input) {
    int i = 0;
    int j = 0;
    String movement = input;
    this.playerPositionY = this.y - 50;
    this.playerPositionX = this.x - 5;
    this.playerPositionX /= 10;
    this.playerPositionY /= 10;
    System.out.println(String.valueOf(this.playerPositionY) + " " + this.playerPositionX);
    if (movement.equals("u")) {
      if (this.playerPositionY - 1 >= 0)
        movement2(1); 
    } else if (movement.equals("d")) {
      if (this.playerPositionY + 1 < 60)
        movement2(2); 
    } else if (movement.equals("r")) {
      if (this.playerPositionX + 1 < 100)
        movement2(3); 
    } else if (movement.equals("l")) {
      if (this.playerPositionX - 1 >= 0)
        movement2(4); 
    } 
  }
  
  public void movement2(int moveType) {
    this.validMove = false;
    switch (moveType) {
      case 1:
        this.whereToY = this.playerPositionY - 1;
        this.whereToX = this.playerPositionX;
        break;
      case 2:
        this.whereToY = this.playerPositionY + 1;
        this.whereToX = this.playerPositionX;
        break;
      case 3:
        this.whereToX = this.playerPositionX + 1;
        this.whereToY = this.playerPositionY;
        break;
      case 4:
        this.whereToX = this.playerPositionX - 1;
        this.whereToY = this.playerPositionY;
        break;
    } 
    this
      
      .timesMoved = this.timesMoved + 1;
    if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] == 9) {
      this.hasRadio = true;
      this.timesMoved = 0;
      this.messageChoice = 8;
    } else if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] == 8) {
      this.hasRoofKey = true;
      this.timesMoved = 0;
      this.messageChoice = 8;
    } else if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] == 6) {
      this.hasArmoryKey = true;
      this.message1 = this.message[2];
    } else if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] == 5) {
      this.running = false;
      this.hasKey = true;
      this.message1 = this.message[1];
      SpecialFunctions.sleep(1000);
      this.running = true;
    } else if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] == 7) {
      this.timesMoved = 0;
      this.message1 = "You found the key to the " + this.keyNumTracker[this.whereToY][this.whereToX][this.currentFloor] + "box";
      this.messageChoice = 4;
      this.hasBoxKeyNum[this.keyNumTracker[this.whereToY][this.whereToX][this.currentFloor] - 1] = true;
      this.itemChart[this.whereToY][this.whereToX][this.currentFloor] = 0;
    } 
    if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals(" ") || this.building[this.whereToY][this.whereToX][this.currentFloor].equals(null)) {
      this.building[this.playerPositionY][this.playerPositionX][this.currentFloor] = " ";
      this.building[this.whereToY][this.whereToX][this.currentFloor] = "P";
      this.x = this.whereToX * 10 + 5;
      this.y = this.whereToY * 10 + 50;
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("f")) {
      this.building[this.playerPositionY][this.playerPositionX][this.currentFloor] = "f";
      this.building[this.whereToY][this.whereToX][this.currentFloor] = "P";
      this.x = this.whereToX * 10 + 5;
      this.y = this.whereToY * 10 + 50;
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("?")) {
      this.building[this.playerPositionY][this.playerPositionX][this.currentFloor] = " ";
      this.building[this.whereToY][this.whereToX][this.currentFloor] = "P";
      this.x = this.whereToX * 10 + 5;
      this.y = this.whereToY * 10 + 50;
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("$")) {
      moneyFound1();
      this.building[this.playerPositionY][this.playerPositionX][this.currentFloor] = " ";
      this.building[this.whereToY][this.whereToX][this.currentFloor] = "P";
      this.x = this.whereToX * 10 + 5;
      this.y = this.whereToY * 10 + 50;
      this.messageChoice = 1;
      this.timesMoved = 0;
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("E")) {
      boolean zombiesOnFloorClear = true;
      if (this.hasKey) {
        this.running = false;
        if (this.floorLocked) {
          for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 100; j++) {
              System.out.println("in for loop checking for zombies");
              if (this.building[i][j][this.currentFloor] == "z") {
                zombiesOnFloorClear = false;
                System.out.println("found zombies");
                break;
              } 
              if (this.building[i][j][this.currentFloor] != "z") {
                zombiesOnFloorClear = true;
                System.out.println("no zombieFound");
              } 
            } 
            if (!zombiesOnFloorClear)
              break; 
          } 
          if (zombiesOnFloorClear) {
            this.floorLocked = false;
            this.zombiesKilledOnFloor /= 2;
            this.clip.stop();
          } else if (!zombiesOnFloorClear) {
            this.floorLocked = true;
            this.timesMoved = 0;
            this.messageChoice = 6;
          } 
        } else if (!this.floorLocked) {
          if (!this.eCutSeenWatched) {
            System.out.println("Congrats on finding the key.");
            SpecialFunctions.sleep(5000);
            System.out.println("Your one step closer to making it out of this thing alive.");
            SpecialFunctions.sleep(6000);
            this.eCutSeenWatched = true;
          } 
          SpecialFunctions.sleep(1000);
          elevator();
          this.running = true;
        } 
      } 
      if (!this.hasKey)
        this.message1 = this.message[0]; 
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("A")) {
      if (this.hasArmoryKey) {
        this.armoryOpen = true;
        this.building[5][4][this.armoryFloor] = " ";
      } 
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("[")) {
      search();
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("O")) {
      boxes();
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("z")) {
      this.running = true;
      this.zombieGame = true;
      if (this.infoHealth.isVisible()) {
        this.healthVisible = true;
      } else if (!this.infoHealth.isVisible()) {
        this.healthVisible = false;
      } 
      this.infoHealth.setVisible(true);
      this.leftWall.setVisible(false);
      this.topWall.setVisible(false);
      this.bottomWall.setVisible(false);
      this.rightWallTopBottomFloor.setVisible(false);
      this.rightWallBottomBottomFloor.setVisible(false);
      this.rightWall.setVisible(false);
      damageCalculator(this.currentItem);
      difficultyCalculator();
      beginTimer();
      beginTimer1();
    } else if (this.building[this.whereToY][this.whereToX][this.currentFloor].equals("U")) {
      boxes();
    } 
    repaint();
  }
  
  public void elevator() {
    this.inElevator = true;
    this.leftWall.setVisible(false);
    this.topWall.setVisible(false);
    this.bottomWall.setVisible(false);
    this.rightWallTopBottomFloor.setVisible(false);
    this.rightWallBottomBottomFloor.setVisible(false);
    this.rightWall.setVisible(false);
    try {
      File sound = new File("elevatorDing.wav");
      AudioInputStream sound_1 = AudioSystem.getAudioInputStream(sound);
      Clip soundPlay = AudioSystem.getClip();
      soundPlay.open(sound_1);
      soundPlay.start();
      SpecialFunctions.sleep(5001);
      soundPlay.stop();
    } catch (Exception exception) {}
    this.inElevatorLabel.setVisible(true);
    repaint();
  }
  
  public void changeFloors() {
    int num1 = 0;
    int num2 = 0;
    int num5 = 0;
    boolean correctFloor = false;
    num1 = this.currentFloor;
    num5 = this.floorWanted;
    Elevator.elevator(num1, num5);
    this.currentFloor = this.floorWanted;
    System.out.println(this.currentFloor);
    this.oneIsPressed = false;
    this.inElevator = false;
    this.inElevatorLabel.setVisible(false);
    this.building[15][5][this.currentFloor] = "P";
    if (this.currentFloor != 0) {
      this.leftWall.setVisible(true);
      this.topWall.setVisible(true);
      this.bottomWall.setVisible(true);
      this.rightWallTopBottomFloor.setVisible(true);
      this.rightWallBottomBottomFloor.setVisible(true);
    } 
    if (this.currentFloor != 1 && this.currentFloor != 0)
      this.rightWall.setVisible(true); 
    repaint();
  }
  
  public void validMove() {}
  
  public void boxes() {
    boolean zombiesOnFloorClear = false;
    if (this.boxNumTracker[this.whereToY][this.whereToX][this.currentFloor] == 1) {
      if (!this.startBoxOpen)
        if (this.hasBoxKeyNum[this.boxNumOn - 1]) {
          this.boxNumTracker[this.whereToY][this.whereToX][this.currentFloor] = 0;
          this.building[this.whereToY][this.whereToX][this.currentFloor] = "U";
          this.startBoxOpen = true;
          boxItems(this.boxNumOn);
          this.boxNumOn = 2;
          this.floorLocked = true;
          zombieMusic(this.music[0]);
        } else {
          hint(0);
        }  
    } else if (this.boxNumTracker[this.whereToY][this.whereToX][this.currentFloor] != 1) {
      if (!this.startBoxOpen) {
        this.message1 = "The first box is not open.";
        this.timesMoved = 0;
        this.messageChoice = 4;
      } else if (this.startBoxOpen) {
        if (this.boxNumOn == this.boxNumTracker[this.whereToY][this.whereToX][this.currentFloor]) {
          if (this.hasBoxKeyNum[this.boxNumOn - 1]) {
            this.building[this.whereToY][this.whereToX][this.currentFloor] = "U";
            boxItems(this.boxNumOn);
            this.boxNumOn++;
            this.boxNumTracker[this.whereToY][this.whereToX][this.currentFloor] = 0;
            System.out.println("found right box");
            this.floorLocked = true;
            zombieMusic(this.music[0]);
          } else {
            hint(0);
            System.out.println("calling hint(0)");
          } 
        } else {
          System.out.println("not right box");
          this.infoObtained.setText("This not the next box. The next box is " + this.boxNumOn + ".");
          this.messageChoice = 4;
          this.timesMoved = 0;
        } 
      } 
    } 
  }
  
  public void hint(int option) {
    int num1 = 0;
    for (int k = 0; k < 16; k++) {
      for (int i = 0; i < 60; i++) {
        for (int j = 0; j < 100; j++) {
          if (this.keyNumTracker[i][j][k] == this.boxNumOn)
            num1 = k; 
        } 
      } 
    } 
    if (option == 2) {
      System.out.println("hint num 2");
      this.message1 = "The next key is on floor " + num1 + ".";
      this.messageChoice = 4;
      this.timesMoved = 0;
    } else if (option == 1) {
      System.out.println("hint num 1");
      this.message1 = "The next key is on floor " + num1 + ".";
      this.messageChoice = 4;
      this.timesMoved = 0;
    } else if (option == 0) {
      System.out.println("hint num 0");
      this.message1 = "The key that you need for this box is on " + num1 + ".";
      this.messageChoice = 4;
      this.timesMoved = 0;
    } 
  }
  
  public void boxItems(int box) {
    this.boxNums = box;
    if (box == 15)
      this.hasBasementKey = true; 
    this.infoObtained.setVisible(true);
    this.message1 = "You found a " + boxItemArray[box] + "! Would you like to add this to your inventory? (press y or n)";
    this.messageChoice = 4;
    this.timesMoved = 0;
    this.keepOrNot = true;
  }
  
  public void armoryItems() {
    int i = 0;
    for (int b = 2; b < 6; i++) {
      this.building[0][b][this.armoryFloor] = "$";
      this.yOfObject = b * 10 + 50;
      this.xOfObject = 5;
      this.moneyX[i][this.armoryFloor] = this.xOfObject;
      this.moneyY[i][this.armoryFloor] = this.yOfObject;
      i++;
    } 
  }
  
  public void moneyFound1() {
    System.out.println("b");
    this.moneyFoundBoolean = false;
    while (!this.moneyFoundBoolean) {
      int num2 = this.rando.nextInt(50);
      if (this.moneyPiles[num2] != 0) {
        this.moneyFound = this.moneyPiles[num2];
        this.totalMoney += this.moneyFound;
        System.out.println(String.valueOf(this.name) + " found " + this.moneyFound + "$ !!!");
        this.moneyPiles[num2] = 0;
        this.moneyFoundBoolean = true;
        continue;
      } 
      this.moneyFoundBoolean = false;
    } 
  }
  
  public void updateCurrentItem() {
    if (!this.infoCurrentItem.isVisible()) {
      this.infoCurrentItem.setText(this.currentItem);
    } else {
      this.infoCurrentItem.setVisible(false);
      this.infoCurrentItem.setText(this.currentItem);
      this.infoCurrentItem.setVisible(true);
    } 
  }
  
  public void randomMoneyGenerator() {
    int randoInt = 0;
    int randoInt2 = 0;
    int moneyPileNum = 0;
    while (this.moneyPiles[49] == 0) {
      randoInt = this.rando.nextInt(10);
      if (randoInt < 7) {
        randoInt2 = this.rando.nextInt(1500);
        this.moneyPiles[moneyPileNum] = randoInt2;
        moneyPileNum++;
        continue;
      } 
      if (randoInt <= 8 && randoInt > 7) {
        randoInt2 = this.rando.nextInt(6500);
        this.moneyPiles[moneyPileNum] = randoInt2;
        moneyPileNum++;
        continue;
      } 
      if (randoInt <= 10 && randoInt > 8) {
        randoInt2 = this.rando.nextInt(10000);
        this.moneyPiles[moneyPileNum] = randoInt2;
        moneyPileNum++;
      } 
    } 
  }
  
  public void searchableItemGenerator() {
    boxItemArray[1] = "1911 custom pistol";
    boxItemArray[2] = "306 rifle";
    boxItemArray[3] = "Uzi";
    boxItemArray[4] = "50 Cal Sniper Rifle";
    boxItemArray[5] = "AR_15";
    boxItemArray[6] = "M16";
    boxItemArray[7] = "PKM";
    boxItemArray[8] = "";
    boxItemArray[9] = "M13";
    boxItemArray[10] = "50 Cal Machine Gun";
    boxItemArray[11] = "RPG";
    boxItemArray[12] = "Mortar Team";
    boxItemArray[13] = "";
    boxItemArray[14] = "";
    boxItemArray[15] = "Marley and Harley";
  }
  
  public void search() {
    if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] <= 2 && this.itemChart[this.whereToY][this.whereToX][this.currentFloor] > 0) {
      SearchableItem item = SearchableItem.randomItem(this.rando);
      System.out.println("You found " + item.displayName() + ". This is junk not worth keeping.");
      this.itemName = item.displayName();
      this.itemChart[this.whereToY][this.whereToX][this.currentFloor] = 0;
      this.messageChoice = 2;
      this.timesMoved = 0;
    } else if (this.itemChart[this.whereToY][this.whereToX][this.currentFloor] <= 4 && this.itemChart[this.whereToY][this.whereToX][this.currentFloor] > 2) {
      SearchableItemRare item = SearchableItemRare.randomItem(this.rando, rareItemsFound);
      if (item != null) {
        rareItemsFound.add(item);
        System.out.println(String.valueOf(this.name) + "found " + item.displayName() + "!!");
        this.itemName = item.displayName();
        this.messageChoice = 3;
        this.timesMoved = 0;
        this.itemChart[this.whereToY][this.whereToX][this.currentFloor] = 0;
        this.playerTotalItems++;
      } 
    } 
  }
  
  public void gamePlay() {
    int itemCount = 0;
    int boxNum = 2;
    int boxNumOrder = 1;
    int randomFloorArmory = 1;
    while (randomFloorArmory == 1) {
      randomFloorArmory = this.rando.nextInt(15);
      randomFloorArmory++;
    } 
    for (int j = 0; j < 5; j++) {
      this.roomArrangeMentBottomFloor[j][6][randomFloorArmory] = "|";
      this.building[j][6][randomFloorArmory] = "a";
    } 
    this.building[4][0][randomFloorArmory] = "a";
    this.building[4][1][randomFloorArmory] = "a";
    this.building[4][2][randomFloorArmory] = "a";
    this.building[4][3][randomFloorArmory] = "a";
    this.building[4][0][randomFloorArmory] = "a";
    this.building[4][1][randomFloorArmory] = "a";
    this.building[4][2][randomFloorArmory] = "a";
    this.building[4][3][randomFloorArmory] = "a";
    this.building[4][5][randomFloorArmory] = "a";
    this.building[5][3][randomFloorArmory] = "a";
    this.building[5][5][randomFloorArmory] = "a";
    this.building[5][4][randomFloorArmory] = "A";
    this.building[1][0][randomFloorArmory] = "C";
    this.building[2][0][randomFloorArmory] = "C";
    this.building[3][0][randomFloorArmory] = "C";
    for (int l = 0; l < 5; l++) {
      for (int k = 0; k < 4; k++)
        this.roomArrangeMentBottomFloor[k][l][this.armoryFloor] = "f"; 
    } 
    this.building[0][2][randomFloorArmory] = "$";
    this.building[0][3][randomFloorArmory] = "$";
    this.building[0][4][randomFloorArmory] = "$";
    this.building[0][5][randomFloorArmory] = "$";
    int i;
    for (i = 1; i < 16; i++) {
      int k = this.rando.nextInt(6);
      int m = this.rando.nextInt(15);
      m++;
      if (boxNumOrder == 1)
        this.boxOneKeyFloor = m; 
      if (!this.floorHasKey[m - 1]) {
        switch (k) {
          case 0:
            if (randomFloorArmory != m) {
              this.keyNumTracker[0][0][m] = boxNumOrder;
              this.itemChart[0][0][m] = 7;
              break;
            } 
            k = 1;
            break;
          case 1:
            this.keyNumTracker[26][0][m] = boxNumOrder;
            this.itemChart[26][0][m] = 7;
            break;
          case 2:
            this.keyNumTracker[33][0][m] = boxNumOrder;
            this.itemChart[33][0][m] = 7;
            break;
          case 3:
            this.keyNumTracker[59][0][m] = boxNumOrder;
            this.itemChart[59][0][m] = 7;
            break;
          case 4:
            this.keyNumTracker[59][28][m] = boxNumOrder;
            this.itemChart[59][28][m] = 7;
            break;
          case 5:
            this.keyNumTracker[0][28][m] = boxNumOrder;
            this.itemChart[0][28][m] = 7;
            break;
        } 
        boxNumOrder++;
        this.floorHasKey[m - 1] = true;
      } else if (this.floorHasKey[m - 1]) {
        i--;
      } 
    } 
    this.building[0][1][1] = "O";
    this.boxNumTracker[0][1][1] = 1;
    this.boxX[1][1] = 15;
    this.boxY[1][1] = 50;
    int num1 = 0;
    int num2 = 0;
    this.armoryFloor = randomFloorArmory;
    System.out.println(randomFloorArmory);
    for (i = 2; i < 16; i++) {
      itemCount = 0;
      while (itemCount != 1) {
        num1 = this.rando.nextInt(30);
        num2 = this.rando.nextInt(28);
        if (this.building[num1][num2][i].contains(" ") && this.roomArrangeMentBottomFloor[num1][num2][i].equals(" ") && this.itemChart[num1][num2][i] != 5) {
          this.building[num1][num2][i] = "O";
          this.boxNumTracker[num1][num2][i] = boxNum;
          this.itemChart[num1][num2][i] = 4;
          this.yOfObject = num1 * 10 + 50;
          this.xOfObject = num2 * 10 + 5;
          this.boxX[1][i] = this.xOfObject;
          this.boxY[1][i] = this.yOfObject;
        } 
        System.out.println(String.valueOf(boxNum) + " " + i);
        itemCount++;
        boxNum++;
      } 
    } 
  }
  
  public void randomDesk() {
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int deskNum = 0;
    int deskFloor = 1;
    boolean farEnoughApart = false;
    boolean breakLoop = false;
    for (deskFloor = 1; deskFloor < 16; deskFloor++) {
      for (int i = 0; i < 7; i++) {
        int itemCount = 0;
        num1 = this.rando.nextInt(56);
        num2 = this.rando.nextInt(26);
        if (this.building[num1][num2][deskFloor].contains(" ") && this.building[num1 + 1][num2][deskFloor] == " " && this.roomArrangeMentBottomFloor[num1][num2][deskFloor].equals(" ")) {
          for (int j = 0; j < 5; j++) {
            if (!this.building[num1 + j][num2][i].contains(" "))
              break; 
            if (!this.building[num1][num2 + j][i].contains(" "))
              break; 
            if (breakLoop) {
              breakLoop = false;
              break;
            } 
            for (int z = 0; z < 5; z++) {
              if (!this.building[num1 + j][num2 + z][i].contains(" ")) {
                breakLoop = true;
                break;
              } 
              if (!this.building[num1 + z][num2 + j][i].contains(" ")) {
                breakLoop = true;
                break;
              } 
              farEnoughApart = true;
            } 
          } 
          if (farEnoughApart) {
            this.deskDirection[i][deskFloor] = this.rando.nextInt(4);
            if (this.deskDirection[i][deskFloor] == 0 || this.deskDirection[i][deskFloor] == 1) {
              this.building[num1][num2][deskFloor] = "[";
              this.building[num1 + 1][num2][deskFloor] = "[";
              this.yOfObject = num1 * 10 + 50;
              this.xOfObject = num2 * 10 + 5;
              this.deskXCoordinates[i][deskFloor] = this.xOfObject;
              this.deskYCoordinates[i][deskFloor] = this.yOfObject;
              this.deskDirection[i][deskFloor] = this.rando.nextInt(3);
              this.itemChart[num1][num2][deskFloor] = this.rando.nextInt(5);
            } else if (this.deskDirection[i][deskFloor] == 2 || this.deskDirection[i][deskFloor] == 3) {
              this.building[num1][num2][deskFloor] = "[";
              this.building[num1][num2 + 1][deskFloor] = "[";
              this.yOfObject = num1 * 10 + 50;
              this.xOfObject = num2 * 10 + 5;
              this.deskXCoordinates[i][deskFloor] = this.xOfObject;
              this.deskYCoordinates[i][deskFloor] = this.yOfObject;
              this.itemChart[num1][num2][deskFloor] = this.rando.nextInt(5);
            } 
          } else {
            i--;
          } 
          farEnoughApart = false;
        } 
      } 
    } 
  }
  
  public void randomZombie() {
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int zombieNum = 0;
    int zombieFloor = 1;
    boolean farEnoughApart = false;
    boolean breakLoop = false;
    for (zombieFloor = 1; zombieFloor < 16; zombieFloor++) {
      zombieNum = 0;
      for (int i = 0; i < 7; i++) {
        num1 = this.rando.nextInt(56);
        num2 = this.rando.nextInt(26);
        if (this.building[num1][num2][zombieFloor].contains(" ") && this.building[num1 + 1][num2][zombieFloor] == " " && this.roomArrangeMentBottomFloor[num1][num2][zombieFloor].equals(" ")) {
          for (int j = 0; j < 5; j++) {
            if (!this.building[num1 + j][num2][i].contains(" "))
              break; 
            if (!this.building[num1][num2 + j][i].contains(" "))
              break; 
            if (breakLoop) {
              breakLoop = false;
              break;
            } 
            for (int z = 0; z < 5; z++) {
              if (!this.building[num1 + j][num2 + z][i].contains(" ")) {
                breakLoop = true;
                break;
              } 
              if (!this.building[num1 + z][num2 + j][i].contains(" ")) {
                breakLoop = true;
                break;
              } 
              farEnoughApart = true;
            } 
          } 
          if (farEnoughApart) {
            this.building[num1][num2][zombieFloor] = "z";
            this.yOfObject = num1 * 10 + 50;
            this.xOfObject = num2 * 10 + 5;
            this.zombieX[zombieNum][zombieFloor] = this.xOfObject;
            this.zombieY[zombieNum][zombieFloor] = this.yOfObject;
            zombieNum++;
          } else {
            i--;
          } 
          farEnoughApart = false;
        } 
      } 
    } 
  }
  
  public void randomMoney() {
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int moneyNum = 0;
    int moneyFloor = 1;
    boolean farEnoughApart = false;
    boolean breakLoop = false;
    for (moneyFloor = 1; moneyFloor < 16; moneyFloor++) {
      moneyNum = 0;
      for (int i = 0; i < 7; i++) {
        num1 = rando.nextInt(56);
        num2 = rando.nextInt(26);
        if (building[num1][num2][moneyFloor].contains(" ") && building[num1 + 1][num2][moneyFloor] == " " && roomArrangeMentBottomFloor[num1][num2][moneyFloor].equals(" ")) {
          for (int j = 0; j < 5; j++) {
            if (building[num1 + j][num2][i].contains(" ")) {
              break; 
            }
            if (!building[num1][num2 + j][i].contains(" ")) {
            	  break; 
            }
            
            if (breakLoop) {
              breakLoop = false;
              break;
            } 
            for (int z = 0; z < 5; z++) {
            	
              if (!building[num1 + j][num2 + z][i].contains(" ")) {
                breakLoop = true;
                break;
              } 
              if (!building[num1 + z][num2 + j][i].contains(" ")) {
                breakLoop = true;
                break;
              } 
              farEnoughApart = true;
            } 
          } 
          if (farEnoughApart) {
            building[num1][num2][moneyFloor] = "$";
            yOfObject = num1 * 10 + 50;
            xOfObject = num2 * 10 + 5;
            moneyX[moneyNum][moneyFloor] = xOfObject;
            moneyY[moneyNum][moneyFloor] = yOfObject;
            moneyNum++;
          } else {
            i--;
          } 
          farEnoughApart = false;
        } 
      } 
    } 
  }
  
  public void bottomFloor() {
    for (int j = 2; j < 16; j++) {
    	
      for (int n = 0; n < 60; n++) {
    	  
        building[n][29][j] = "|"; 
        
      }
      
    } 
    
    int i;
    for (i = 32; i < 60; i++) {
      building[i][29][1] = "|"; 
    }
    
    for (i = 29; i < 40; i++) {
      building[2][i][1] = " ";
    }
    
    for (i = 29; i < 40; i++) {
      building[57][i][1] = "_"; 
    }
    
    for (i = 0; i < 28; i++) {
      building[i][29][1] = "|"; 
  	}
  
    for (i = 2; i < 6; i++) {
      building[i][39][1] = "|"; 
    }
    building[5][40][1] = "|";
    building[5][41][1] = "|";
    building[11][40][1] = "|";
    building[11][41][1] = "|";
    building[26][40][1] = "|";
    building[26][41][1] = "|";
    building[33][40][1] = "|";
    building[33][41][1] = "|";
    building[48][40][1] = "|";
    building[48][41][1] = "|";
    building[54][40][1] = "|";
    building[54][41][1] = "|";
    building[27][64][1] = "/";
    building[27][65][1] = "/";
    building[27][66][1] = "/";
    building[28][67][1] = "/";
    building[28][62][1] = "/";
    building[29][67][1] = "/";
    building[27][63][1] = "/";
    building[31][67][1] = "/";
    building[28][63][1] = "/";
    building[29][62][1] = "/";
    building[29][63][1] = "/";
    building[31][62][1] = "/";
    building[32][63][1] = "/";
    building[32][64][1] = "/";
    building[32][65][1] = "/";
    building[32][66][1] = "/";
    building[30][62][1] = "/";
    building[30][67][1] = "/";
    
    for (i = 0; i < 20; i++) {
    	
      building[3][5 + i][16] = "/";
      building[3 + i][5][16] = "/";
      building[3 + i][24][16] = "/";
      
    } 
    
    for (i = 0; i < 7; i++) {
      building[22][5 + i][16] = "/";
      building[22][18 + i][16] = "/";
    } 
    
    int zombieNum = 0;
    
    for (int m = 0; m < 2; m++) {
    	
      for (int n = 0; n < 6; n++) {
    	  
        int num1 = 22 + m;
        int num2 = 12 + n;
        building[num1][num2][16] = "Z";
        num2 = 12 + n;
        yOfObject = num1 * 10 + 50;
        xOfObject = num2 * 10 + 5;
        zombieXRoof[zombieNum] = this.xOfObject;
        zombieYRoof[zombieNum] = this.yOfObject;
        zombieNum++;
      } 
    } 
    building[23][11][16] = "/";
    building[23][18][16] = "/";
    building[24][11][16] = "/";
    building[24][18][16] = "/";
    int k;
    
    for (k = 11; k < 28; k++) {
    	building[k][39][1] = "|"; 
    }
    	
    for (k = 32; k < 49; k++) {
    	building[k][39][1] = "|"; 
    }
    
    for (k = 54; k < 58; k++) {
    	building[k][39][1] = "|"; 
    }
  }
  
  public void newProjectile() {
    if (!this.currentItem.equals("RPG")) {
      if (this.board[this.miniY][54] == "z")
        this.deadZombies++; 
      this.board[this.miniY][54] = "b";
      this.reloaded = false;
    } else if (this.currentItem.equals("RPG") && 
      this.RPGreload) {
      if (this.board[this.miniY][54] == "z")
        this.deadZombies++; 
      this.board[this.miniY][54] = "RPG";
      this.RPGOut = true;
      this.RPGreload = false;
    } 
  }
  
  public void bulletsMove() {
    for (int i = 0; i < 60; i++) {
      for (int j = 0; j < 25; j++) {
        if (this.board[j][i] == "b")
          if (this.board[j][i - 1] != "z") {
            if (i - 1 > 0 && !this.board[j][i].equals("z")) {
              this.board[j][i - 1] = "b";
              this.board[j][i] = " ";
            } else if (this.board[j][i - 1] == "RPG") {
              this.board[j][i] = " ";
              this.board[j][i - 1] = " ";
              this.RPGOut = false;
              this.RPGreload = true;
            } else {
              this.board[j][i] = " ";
            } 
          } else if (this.board[j][i - 1] == "z") {
            if (this.boardValues[j][i - 1] - this.damage > 0) {
              this.board[j][i] = " ";
              this.boardValues[j][i - 1] = this.boardValues[j][i - 1] - this.damage;
              if (this.currentItem == "Marley and Harley")
                explosion(); 
              System.out.println(this.boardValues[j][i - 1]);
              System.out.println(this.board[j][i - 1]);
              System.out.println("hit");
            } 
            if (this.boardValues[j][i - 1] - this.damage <= 0) {
              this.board[j][i - 1] = " ";
              this.boardValues[j][i - 1] = 0;
              System.out.println("killed");
              if (this.deadZombiesDeath >= this.zombiesDeadUntilDeath) {
                zombieDeath();
                this.deadZombiesDeath = 0;
                this.zombiesDeadUntilDeath = this.rando.nextInt(8);
              } 
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
          }  
      } 
    } 
  }
  
  public void rpgMove() {
    for (int i = 0; i < 60; i++) {
      for (int j = 0; j < 25; j++) {
        if (this.board[j][i] == "RPG")
          if (this.board[j][i - 1] != "z") {
            if (i - 1 > 0 && !this.board[j][i].equals("z")) {
              this.board[j][i - 1] = "RPG";
              this.board[j][i] = " ";
            } else {
              this.board[j][i] = " ";
              this.RPGOut = false;
              this.RPGreload = true;
            } 
          } else if (this.board[j][i - 1] == "z") {
            System.out.println("hit");
            this.board[j][i] = " ";
            this.boardValues[j][i] = 0;
            explosion();
            if (i - 1 >= 0 && 
              this.board[j][i - 1] == "z") {
              this.board[j][i - 1] = " ";
              this.boardValues[j][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 1 >= 0 && 
              this.board[j - 1][i] == "z") {
              this.board[j - 1][i] = " ";
              this.boardValues[j - 1][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 1 >= 0 && 
              this.board[j - 1][i] == "z") {
              this.board[j - 1][i] = " ";
              this.boardValues[j - 1][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 1 >= 0 && i - 1 > 0 && 
              this.board[j - 1][i - 1] == "z") {
              this.board[j - 1][i - 1] = " ";
              this.boardValues[j - 1][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 1 >= 0 && i - 2 >= 0 && 
              this.board[j - 1][i - 2] == "z") {
              this.board[j - 1][i - 2] = " ";
              this.boardValues[j - 1][i - 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 1 <= 24 && 
              this.board[j + 1][i] == "z") {
              this.board[j + 1][i] = " ";
              this.boardValues[j + 1][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 1 <= 24 && i - 1 >= 0 && 
              this.board[j + 1][i - 1] == "z") {
              this.board[j + 1][i - 1] = " ";
              this.boardValues[j + 1][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 2 >= 0 && 
              this.board[j][i - 2] == "z") {
              this.board[j][i - 2] = " ";
              this.boardValues[j][i - 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 2 >= 0 && i - 1 >= 0 && 
              this.board[j - 2][i - 1] == "z") {
              this.board[j - 2][i - 1] = " ";
              this.boardValues[j - 2][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 2 <= 24 && i - 1 >= 0 && 
              this.board[j + 2][i - 1] == "z") {
              this.board[j + 2][i - 1] = " ";
              this.boardValues[j + 2][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 3 >= 0 && 
              this.board[j][i - 3] == "z") {
              this.board[j][i - 3] = " ";
              this.boardValues[j][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 3 >= 0 && 
              this.board[j - 3][i] == "z") {
              this.board[j - 3][i] = " ";
              this.boardValues[j - 3][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 3 <= 24 && 
              this.board[j + 3][i] == "z") {
              this.board[j + 3][i] = " ";
              this.boardValues[j + 3][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 2 >= 0 && i - 2 >= 0 && 
              this.board[j - 2][i - 2] == "z") {
              this.board[j - 2][i - 2] = " ";
              this.boardValues[j - 2][i - 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 2 <= 24 && i - 2 >= 0 && 
              this.board[j + 2][i - 2] == "z") {
              this.board[j + 2][i - 2] = " ";
              this.boardValues[j + 2][i - 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 2 >= 0 && i + 2 <= 54 && 
              this.board[j - 2][i + 2] == "z") {
              this.board[j - 2][i + 2] = " ";
              this.boardValues[j - 2][i + 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 2 <= 24 && i + 2 <= 54 && 
              this.board[j + 2][i + 2] == "z") {
              this.board[j + 2][i + 2] = " ";
              this.boardValues[j + 2][i + 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 3 <= 24 && i + 2 <= 54 && 
              this.board[j + 3][i + 2] == "z") {
              this.board[j + 3][i + 2] = " ";
              this.boardValues[j + 3][i + 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 3 <= 24 && i - 2 >= 0 && 
              this.board[j + 3][i - 2] == "z") {
              this.board[j + 3][i - 2] = " ";
              this.boardValues[j + 3][i - 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 3 <= 24 && i - 1 >= 0 && 
              this.board[j + 3][i - 1] == "z") {
              this.board[j + 3][i - 1] = " ";
              this.boardValues[j + 3][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 3 <= 24 && i + 1 <= 54 && 
              this.board[j + 3][i + 1] == "z") {
              this.board[j + 3][i + 1] = " ";
              this.boardValues[j + 3][i + 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 3 >= 0 && i + 2 <= 54 && 
              this.board[j - 3][i + 2] == "z") {
              this.board[j - 3][i + 2] = " ";
              this.boardValues[j - 3][i + 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 3 >= 0 && i + 1 <= 54 && 
              this.board[j - 3][i + 1] == "z") {
              this.board[j - 3][i + 1] = " ";
              this.boardValues[j - 3][i + 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 3 >= 0 && i - 1 >= 0 && 
              this.board[j - 3][i - 1] == "z") {
              this.board[j - 3][i - 1] = " ";
              this.boardValues[j - 3][i - 1] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j - 3 >= 0 && i - 2 >= 0 && 
              this.board[j - 3][i - 2] == "z") {
              this.board[j - 3][i - 2] = " ";
              this.boardValues[j - 3][i - 2] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 3 >= 0 && j - 2 >= 0 && 
              this.board[j - 2][i - 3] == "z") {
              this.board[j - 2][i - 3] = " ";
              this.boardValues[j - 2][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 3 >= 0 && j - 2 >= 0 && 
              this.board[j - 1][i - 3] == "z") {
              this.board[j - 1][i - 3] = " ";
              this.boardValues[j - 1][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 3 >= 0 && j + 2 <= 24 && 
              this.board[j + 2][i - 3] == "z") {
              this.board[j + 2][i - 3] = " ";
              this.boardValues[j + 2][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 3 >= 0 && j + 1 <= 24 && 
              this.board[j + 1][i - 3] == "z") {
              this.board[j + 1][i - 3] = " ";
              this.boardValues[j + 1][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i + 3 <= 54 && j + 1 <= 24 && 
              this.board[j + 1][i - 3] == "z") {
              this.board[j + 1][i - 3] = " ";
              this.boardValues[j + 1][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i + 3 <= 54 && j + 2 <= 24 && 
              this.board[j + 1][i - 3] == "z") {
              this.board[j + 1][i - 3] = " ";
              this.boardValues[j + 1][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i + 3 <= 54 && j - 2 >= 0 && 
              this.board[j - 2][i - 3] == "z") {
              this.board[j - 2][i - 3] = " ";
              this.boardValues[j - 2][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i + 3 <= 54 && j - 1 >= 0 && 
              this.board[j - 1][i - 3] == "z") {
              this.board[j - 1][i - 3] = " ";
              this.boardValues[j - 1][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (i - 3 >= 0 && 
              this.board[j][i - 3] == "z") {
              this.board[j][i - 3] = " ";
              this.boardValues[j][i - 3] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (j + 3 <= 24 && 
              this.board[j + 3][i] == "z") {
              this.board[j + 3][i] = " ";
              this.boardValues[j + 3][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            if (this.board[j][i] == "z") {
              this.board[j][i] = " ";
              this.boardValues[j][i] = 0;
              this.deadZombiesDeath++;
              this.deadZombies++;
            } 
            this.RPGreload = true;
            this.RPGOut = false;
          } else {
            this.RPGOut = false;
            this.RPGreload = true;
          }  
      } 
    } 
  }
  
  public void randomZombieMiniGame() {
    if (this.totalZombies < this.zombiesAllowedPerLevel) {
      int lane = this.rando.nextInt(25);
      this.board[lane][0] = "z";
      this.boardValues[lane][0] = this.zombHealth;
      if (this.zombieScream >= this.nextScream) {
        zombieScream();
        this.zombieScream = 0;
        this.nextScream = this.rando.nextInt(11);
      } 
      this.zombieScream++;
      this.totalZombies++;
    } 
  }
  
  public void zombiesMove(int lane) {
    for (int i = 59; i >= 0; i--) {
      if (this.board[lane][i] == "z")
        if (i + 1 < 60) {
          this.board[lane][i + 1] = "z";
          this.boardValues[lane][i + 1] = this.boardValues[lane][i];
          this.board[lane][i] = " ";
          this.boardValues[lane][i] = 0;
        } else if (i + 1 >= 60) {
          this.board[lane][i] = " ";
          this.boardValues[lane][i] = 0;
          if (this.armor > 0)
            this.armor -= 5; 
          if (this.armor <= 0)
            this.health -= 5; 
          this.infoHealth.setText(String.valueOf(this.health) + " ");
          this.deadZombies++;
        }  
    } 
  }
  
  public void damageCalculator(String weapon) {
    this.timeDelay = WeaponAndDifficulty.damageCalculator(this.currentItem, 0);
    this.damage = WeaponAndDifficulty.damageCalculator(this.currentItem, 1);
    this.reloadTimeNeeded = WeaponAndDifficulty.damageCalculator(this.currentItem, 3);
    if (WeaponAndDifficulty.damageCalculator(this.currentItem, 2) == 0) {
      this.semiAuto = false;
    } else if (WeaponAndDifficulty.damageCalculator(this.currentItem, 2) == 1) {
      this.semiAuto = true;
    } 
  }
  
  public void difficultyCalculator() {
    this.difficulty = this.boxNumOn;
    this.zombiesAllowedPerLevel = WeaponAndDifficulty.difficultyCalculator(this.difficulty, this.zombiesKilledOnFloor, 0);
    this.timeBeforeNextWave = WeaponAndDifficulty.difficultyCalculator(this.difficulty, this.zombiesKilledOnFloor, 1);
    this.timeBeforeNextMove = WeaponAndDifficulty.difficultyCalculator(this.difficulty, this.zombiesKilledOnFloor, 2);
    this.zombHealth = WeaponAndDifficulty.difficultyCalculator(this.difficulty, this.zombiesKilledOnFloor, 3);
    laneCalculator();
  }
  
  public void laneCalculator() {
    this.lane0 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane1 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane2 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane3 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane4 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane5 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane6 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane7 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane8 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane9 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane10 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane11 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane12 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane13 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane14 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane15 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane16 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane17 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane18 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane19 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane20 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane21 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane22 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane23 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
    this.lane24 = (this.rando.nextInt(5) + 1) * 1000 + this.timeBeforeNextMove - 4000;
  }
  
  public void resetToGame() {
    this.running = false;
    this.zombieGame = false;
    this.deadZombies = 0;
    this.totalZombies = 0;
    this.endCount = 0;
    this.zombiesKilledOnFloor++;
    this.leftWall.setVisible(true);
    this.topWall.setVisible(true);
    this.bottomWall.setVisible(true);
    this.rightWallTopBottomFloor.setVisible(true);
    this.rightWallBottomBottomFloor.setVisible(true);
    if (this.healthVisible = true) {
      this.infoHealth.setVisible(true);
    } else if (this.healthVisible = false) {
      this.infoHealth.setVisible(false);
    } 
    this.building[this.whereToY][this.whereToX][this.currentFloor] = " ";
    for (int i = 0; i < 60; i++) {
      for (int j = 0; j < 25; j++) {
        if (this.board[j][i] != "P") {
          this.board[j][i] = " ";
          this.boardValues[j][i] = 0;
        } 
      } 
    } 
    this.lane0Move = 0;
    this.lane1Move = 0;
    this.lane2Move = 0;
    this.lane3Move = 0;
    this.lane4Move = 0;
    this.lane5Move = 0;
    this.lane6Move = 0;
    this.lane7Move = 0;
    this.lane8Move = 0;
    this.lane9Move = 0;
    this.lane10Move = 0;
    this.lane11Move = 0;
    this.lane12Move = 0;
    this.lane13Move = 0;
    this.lane14Move = 0;
    this.lane15Move = 0;
    this.lane16Move = 0;
    this.lane17Move = 0;
    this.lane18Move = 0;
    this.lane19Move = 0;
    this.lane20Move = 0;
    this.lane21Move = 0;
    this.lane22Move = 0;
    this.lane23Move = 0;
    this.lane24Move = 0;
  }
  
  public void updateGame() {
    int i;
    for (i = 0; i < 60; i++) {
      for (int j = 0; j < 25; j++) {
        if (this.board[j][i] == "RPG")
          this.RPGAlive = true; 
      } 
    } 
    if (!this.RPGAlive) {
      this.RPGOut = false;
      this.RPGreload = true;
    } 
    this.RPGAlive = false;
    for (i = 0; i < 60; i++) {
      for (int j = 0; j < 25; j++) {
        if (this.board[j][i] == "z") {
          this.stillZombies = true;
          this.endCount = 0;
        } 
      } 
    } 
    if (!this.stillZombies)
      this.endCount++; 
    this.stillZombies = false;
    if (this.endCount >= 15)
      this.deadZombies = this.zombiesAllowedPerLevel; 
  }
  
  public void beginTimer() {
    if (!this.running1) {
      this.timerExist = true;
      this.timer = new Timer();
      this.task = new TimerTask() {
          public void run() {
            if (GameContent.this.time3 > GameContent.this.timeDelay) {
              GameContent.this.actionPerformed();
              GameContent.this.time3 = 0;
            } 
            if (GameContent.this.time2 > GameContent.this.timeBeforeNextWave) {
              GameContent.this.randomZombieMiniGame();
              GameContent.this.time2 = 0;
            } 
            if (GameContent.this.reloadTime >= GameContent.this.reloadTimeNeeded) {
              GameContent.this.reloaded = true;
              GameContent.this.reloadTime = 0;
            } 
            if (GameContent.this.RPGOut && 
              GameContent.this.timeBeforeRpgMove >= 500) {
              GameContent.this.rpgMove();
              GameContent.this.timeBeforeRpgMove = 0;
            } 
            if (GameContent.this.time4 >= 3000)
              GameContent.this.updateGame(); 
            GameContent.this.time4 += 10;
            GameContent.this.timeBeforeRpgMove += 50;
            GameContent.this.reloadTime += 50;
            GameContent.this.time += 50;
            GameContent.this.time2 += 50;
            GameContent.this.time3 += 10;
            GameContent.this.repaint();
            if (GameContent.this.deadZombies >= GameContent.this.zombiesAllowedPerLevel) {
              GameContent.this.resetToGame();
              GameContent.this.timer.cancel();
            } 
          }
        };
      this.timer.scheduleAtFixedRate(this.task, 10L, 10L);
    } 
  }
  
  public void beginTimer1() {
    if (!this.running2) {
      this.timerExist2 = true;
      this.timer2 = new Timer();
      this.task2 = new TimerTask() {
          public void run() {
            if (GameContent.this.lane0Move >= GameContent.this.lane0) {
              GameContent.this.zombiesMove(0);
              GameContent.this.lane0Move = 0;
            } 
            if (GameContent.this.lane1Move >= GameContent.this.lane1) {
              GameContent.this.zombiesMove(1);
              GameContent.this.lane1Move = 0;
            } 
            if (GameContent.this.lane2Move >= GameContent.this.lane2) {
              GameContent.this.zombiesMove(2);
              GameContent.this.lane2Move = 0;
            } 
            if (GameContent.this.lane3Move >= GameContent.this.lane3) {
              GameContent.this.zombiesMove(3);
              GameContent.this.lane3Move = 0;
            } 
            if (GameContent.this.lane4Move >= GameContent.this.lane4) {
              GameContent.this.zombiesMove(4);
              GameContent.this.lane4Move = 0;
            } 
            if (GameContent.this.lane5Move >= GameContent.this.lane5) {
              GameContent.this.zombiesMove(5);
              GameContent.this.lane5Move = 0;
            } 
            if (GameContent.this.lane6Move >= GameContent.this.lane6) {
              GameContent.this.zombiesMove(6);
              GameContent.this.lane6Move = 0;
            } 
            if (GameContent.this.lane7Move >= GameContent.this.lane7) {
              GameContent.this.zombiesMove(7);
              GameContent.this.lane7Move = 0;
            } 
            if (GameContent.this.lane8Move >= GameContent.this.lane8) {
              GameContent.this.zombiesMove(8);
              GameContent.this.lane8Move = 0;
            } 
            if (GameContent.this.lane9Move >= GameContent.this.lane9) {
              GameContent.this.zombiesMove(9);
              GameContent.this.lane9Move = 0;
            } 
            if (GameContent.this.lane10Move >= GameContent.this.lane10) {
              GameContent.this.zombiesMove(10);
              GameContent.this.lane10Move = 0;
            } 
            if (GameContent.this.lane11Move >= GameContent.this.lane11) {
              GameContent.this.zombiesMove(11);
              GameContent.this.lane11Move = 0;
            } 
            if (GameContent.this.lane12Move >= GameContent.this.lane12) {
              GameContent.this.zombiesMove(12);
              GameContent.this.lane12Move = 0;
            } 
            if (GameContent.this.lane13Move >= GameContent.this.lane13) {
              GameContent.this.zombiesMove(13);
              GameContent.this.lane13Move = 0;
            } 
            if (GameContent.this.lane14Move >= GameContent.this.lane14) {
              GameContent.this.zombiesMove(14);
              GameContent.this.lane14Move = 0;
            } 
            if (GameContent.this.lane15Move >= GameContent.this.lane15) {
              GameContent.this.zombiesMove(15);
              GameContent.this.lane15Move = 0;
            } 
            if (GameContent.this.lane16Move >= GameContent.this.lane16) {
              GameContent.this.zombiesMove(16);
              GameContent.this.lane16Move = 0;
            } 
            if (GameContent.this.lane17Move >= GameContent.this.lane17) {
              GameContent.this.zombiesMove(17);
              GameContent.this.lane17Move = 0;
            } 
            if (GameContent.this.lane18Move >= GameContent.this.lane18) {
              GameContent.this.zombiesMove(18);
              GameContent.this.lane18Move = 0;
            } 
            if (GameContent.this.lane19Move >= GameContent.this.lane19) {
              GameContent.this.zombiesMove(19);
              GameContent.this.lane19Move = 0;
            } 
            if (GameContent.this.lane20Move >= GameContent.this.lane20) {
              GameContent.this.zombiesMove(20);
              GameContent.this.lane20Move = 0;
            } 
            if (GameContent.this.lane21Move >= GameContent.this.lane21) {
              GameContent.this.zombiesMove(21);
              GameContent.this.lane21Move = 0;
            } 
            if (GameContent.this.lane22Move >= GameContent.this.lane22) {
              GameContent.this.zombiesMove(22);
              GameContent.this.lane22Move = 0;
            } 
            if (GameContent.this.lane23Move >= GameContent.this.lane23) {
              GameContent.this.zombiesMove(23);
              GameContent.this.lane23Move = 0;
            } 
            if (GameContent.this.lane24Move >= GameContent.this.lane24) {
              GameContent.this.zombiesMove(24);
              GameContent.this.lane24Move = 0;
            } 
            GameContent.this.lane0Move += 50;
            GameContent.this.lane1Move += 50;
            GameContent.this.lane2Move += 50;
            GameContent.this.lane3Move += 50;
            GameContent.this.lane4Move += 50;
            GameContent.this.lane5Move += 50;
            GameContent.this.lane6Move += 50;
            GameContent.this.lane7Move += 50;
            GameContent.this.lane8Move += 50;
            GameContent.this.lane9Move += 50;
            GameContent.this.lane10Move += 50;
            GameContent.this.lane11Move += 50;
            GameContent.this.lane12Move += 50;
            GameContent.this.lane13Move += 50;
            GameContent.this.lane14Move += 50;
            GameContent.this.lane15Move += 50;
            GameContent.this.lane16Move += 50;
            GameContent.this.lane17Move += 50;
            GameContent.this.lane18Move += 50;
            GameContent.this.lane19Move += 50;
            GameContent.this.lane20Move += 50;
            GameContent.this.lane21Move += 50;
            GameContent.this.lane22Move += 50;
            GameContent.this.lane23Move += 50;
            GameContent.this.lane24Move += 50;
            GameContent.this.repaint();
            if (GameContent.this.deadZombies >= GameContent.this.zombiesAllowedPerLevel) {
              GameContent.this.resetToGame();
              GameContent.this.timer2.cancel();
            } 
          }
        };
      this.timer.scheduleAtFixedRate(this.task2, 10L, 10L);
    } 
  }
  
  public void actionPerformed() {
    if (this.running)
      bulletsMove(); 
  }
  
  public void zombieMusic(String music) {
    try {
      File sound = new File(music);
      AudioInputStream sound_1 = AudioSystem.getAudioInputStream(sound);
      this.clip = AudioSystem.getClip();
      this.clip.open(sound_1);
      this.clip.start();
    } catch (Exception exception) {}
  }
  
  public void zombieScream() {
    try {
      if (!this.zombieScreamClipOpen) {
        this.zombieScreamAudioInputStream = AudioSystem.getAudioInputStream(this.zombieScreamFile);
        this.zombieScreamClip = AudioSystem.getClip();
        this.zombieScreamClip.open(this.zombieScreamAudioInputStream);
        this.zombieScreamClip.start();
      } else {
        this.zombieScreamClip.setMicrosecondPosition(0L);
      } 
    } catch (Exception exception) {}
  }
  
  public void zombieDeath() {
    try {
      if (!this.zombieDeathOpen) {
        this.zombieDeathAudioInputStream = AudioSystem.getAudioInputStream(this.zombieDeathFile);
        this.zombieDeathClip = AudioSystem.getClip();
        this.zombieDeathClip.open(this.zombieDeathAudioInputStream);
        this.zombieDeathClip.start();
      } else {
        this.zombieDeathClip.setMicrosecondPosition(0L);
      } 
    } catch (Exception exception) {}
  }
  
  public void explosion() {
    try {
      this.explosionInputStream = AudioSystem.getAudioInputStream(this.explosionFile);
      Clip explosionClip = AudioSystem.getClip();
      explosionClip.open(this.explosionInputStream);
      explosionClip.start();
    } catch (Exception exception) {}
  }
  
  public void weaponSoundChooser(String weapon) {
    if (weapon.equals("glock"))
      weaponSound(this.glockFile); 
    if (weapon.equals("1911 custom pistol")) {
      weaponSound(this.glockFile);
    } else if (weapon.equals("Uzi")) {
      weaponSound(this.uziFile);
    } else if (weapon.equals("306 rifle")) {
      weaponSound(this.thirtyFile);
    } else if (weapon.equals("50 Cal Sniper Rifle")) {
      weaponSound(this.fiftyCalFile);
    } else if (weapon.equals("AR_15")) {
      weaponSound(this.ar_15File);
    } else if (weapon.equals("M16")) {
      weaponSound(this.M16File);
    } else if (weapon.equals("PKM")) {
      weaponSound(this.PKMFile);
    } else if (weapon.equals("50 Cal Machine Gun")) {
      weaponSound(this.fiftyMachineGunFile);
    } else if (weapon.equals("Marley and Harley")) {
      weaponSound(this.mas);
    } 
  }
  
  public void weaponSound(File file) {
    try {
      this.weaponAudioInputStream = AudioSystem.getAudioInputStream(file);
      this.weaponClip = AudioSystem.getClip();
      this.weaponClip.open(this.weaponAudioInputStream);
      this.weaponClip.start();
    } catch (Exception exception) {}
  }
  
  public class MyKeyAdapter extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
      switch (e.getKeyCode()) {
        case 37:
          if (!GameContent.this.inElevator && 
            !GameContent.this.zombieGame) {
            if (GameContent.this.boxJustOpened)
              GameContent.this.hint(1); 
            GameContent.this.boxJustOpened = false;
            GameContent.this.direction = "l";
            GameContent.this.movement(GameContent.this.direction);
          } 
          break;
        case 39:
          if (!GameContent.this.inElevator && 
            !GameContent.this.zombieGame) {
            if (GameContent.this.boxJustOpened)
              GameContent.this.hint(1); 
            GameContent.this.boxJustOpened = false;
            GameContent.this.direction = "r";
            GameContent.this.movement(GameContent.this.direction);
          } 
          break;
        case 38:
          if (!GameContent.this.inElevator) {
            if (!GameContent.this.zombieGame) {
              if (GameContent.this.boxJustOpened)
                GameContent.this.hint(1); 
              GameContent.this.boxJustOpened = false;
              GameContent.this.direction = "u";
              GameContent.this.movement(GameContent.this.direction);
              break;
            } 
            if (GameContent.this.miniY > 0)
              GameContent.this.miniY--; 
            GameContent.this.repaint();
          } 
          break;
        case 40:
          if (!GameContent.this.inElevator) {
            if (!GameContent.this.zombieGame) {
              if (GameContent.this.boxJustOpened)
                GameContent.this.hint(1); 
              GameContent.this.boxJustOpened = false;
              GameContent.this.direction = "d";
              GameContent.this.movement(GameContent.this.direction);
              break;
            } 
            if (GameContent.this.miniY < 25)
              GameContent.this.miniY++; 
            GameContent.this.repaint();
          } 
          break;
        case 32:
          if (GameContent.this.reloaded) {
            if (GameContent.this.currentItem != "RPG") {
              if (GameContent.this.semiAuto) {
                if (GameContent.this.zombieGame && 
                  GameContent.this.shotsFired == 0) {
                  GameContent.this.newProjectile();
                  GameContent.this.weaponSoundChooser(GameContent.this.currentItem);
                  GameContent.this.shotsFired++;
                } 
                break;
              } 
              if (GameContent.this.zombieGame) {
                GameContent.this.newProjectile();
                GameContent.this.weaponSoundChooser(GameContent.this.currentItem);
                GameContent.this.shotsFired++;
              } 
              break;
            } 
            if (!GameContent.this.RPGOut) {
              System.out.println("b");
              GameContent.this.newProjectile();
            } 
          } 
          break;
        case 73:
          if (!GameContent.this.infoVisible) {
            GameContent.this.infoMoney.setVisible(true);
            GameContent.this.infoHealth.setVisible(true);
            GameContent.this.infoArmor.setVisible(true);
            GameContent.this.infoCurrentItem.setVisible(true);
            GameContent.this.infoAmmo.setVisible(true);
            GameContent.this.infoVisible = true;
          } else if (GameContent.this.infoVisible) {
            GameContent.this.infoMoney.setVisible(false);
            GameContent.this.infoHealth.setVisible(false);
            GameContent.this.infoArmor.setVisible(false);
            GameContent.this.infoCurrentItem.setVisible(false);
            GameContent.this.infoAmmo.setVisible(false);
            GameContent.this.infoVisible = false;
          } 
          GameContent.this.repaint();
          break;
        case 75:
          if (!GameContent.this.infoKeys.isVisible()) {
            GameContent.this.infoKeys.setVisible(true);
          } else if (GameContent.this.infoKeys.isVisible()) {
            GameContent.this.infoKeys.setVisible(false);
          } 
          GameContent.this.repaint();
          break;
        case 71:
          if (GameContent.this.inElevator)
            GameContent.this.changeFloors(); 
          break;
        case 76:
          if (GameContent.this.inElevator && 
            !GameContent.this.oneIsPressed) {
            GameContent.this.floorWanted = 1;
            System.out.println(GameContent.this.floorWanted);
          } 
        case 89:
          if (GameContent.this.keepOrNot) {
            for (int i = 0; i < GameContent.this.inventory.length; i++) {
              if (GameContent.this.inventory[i].equals(" ")) {
                GameContent.this.inventory[i] = GameContent.boxItemArray[GameContent.this.boxNumOn - 1];
                break;
              } 
            } 
            GameContent.this.keepOrNot = false;
          } 
          GameContent.this.boxJustOpened = true;
          break;
        case 78:
          if (GameContent.this.keepOrNot)
            GameContent.this.keepOrNot = false; 
          GameContent.this.boxJustOpened = true;
          break;
        case 90:
          if (!GameContent.this.inElevator) {
            if (GameContent.this.currentItemInt != 11)
              GameContent.this.currentItemInt++; 
            GameContent.this.currentItem = GameContent.this.inventory[GameContent.this.currentItemInt];
            GameContent.this.updateCurrentItem();
            if (GameContent.this.zombieGame)
              GameContent.this.damageCalculator(GameContent.this.currentItem); 
          } 
          break;
        case 88:
          if (!GameContent.this.inElevator) {
            if (GameContent.this.currentItemInt != 0)
              GameContent.this.currentItemInt--; 
            GameContent.this.currentItem = GameContent.this.inventory[GameContent.this.currentItemInt];
            GameContent.this.updateCurrentItem();
            if (GameContent.this.zombieGame)
              GameContent.this.damageCalculator(GameContent.this.currentItem); 
          } 
          break;
        case 49:
          if (GameContent.this.inElevator) {
            if (!GameContent.this.oneIsPressed) {
              GameContent.this.floorWanted = 1;
              GameContent.this.oneIsPressed = true;
              break;
            } 
            if (GameContent.this.oneIsPressed)
              GameContent.this.floorWanted = 11; 
          } 
          break;
        case 50:
          if (GameContent.this.inElevator) {
            GameContent.this.floorWanted = 2;
            if (GameContent.this.oneIsPressed)
              GameContent.this.floorWanted = 12; 
          } 
          break;
        case 51:
          if (GameContent.this.inElevator) {
            GameContent.this.floorWanted = 3;
            if (GameContent.this.oneIsPressed)
              GameContent.this.floorWanted = 13; 
          } 
          break;
        case 52:
          if (GameContent.this.inElevator) {
            GameContent.this.floorWanted = 4;
            if (GameContent.this.oneIsPressed)
              GameContent.this.floorWanted = 14; 
          } 
          break;
        case 53:
          if (GameContent.this.inElevator) {
            GameContent.this.floorWanted = 5;
            if (GameContent.this.oneIsPressed)
              GameContent.this.floorWanted = 15; 
          } 
          break;
        case 54:
          if (GameContent.this.inElevator) {
            if (!GameContent.this.oneIsPressed) {
              GameContent.this.floorWanted = 6;
              break;
            } 
            if (GameContent.this.oneIsPressed) {
              if (GameContent.this.hasRoofKey) {
                if (GameContent.this.hasRadio = true) {
                  GameContent.this.floorWanted = 16;
                  break;
                } 
                GameContent.this.timesMoved = 0;
                GameContent.this.messageChoice = 10;
                GameContent.this.floorWanted = GameContent.this.currentFloor;
                break;
              } 
              GameContent.this.timesMoved = 0;
              GameContent.this.messageChoice = 11;
              GameContent.this.floorWanted = GameContent.this.currentFloor;
            } 
          } 
          break;
        case 55:
          if (GameContent.this.inElevator && 
            !GameContent.this.oneIsPressed)
            GameContent.this.floorWanted = 7; 
          break;
        case 56:
          if (GameContent.this.inElevator && 
            !GameContent.this.oneIsPressed)
            GameContent.this.floorWanted = 8; 
          break;
        case 57:
          if (GameContent.this.inElevator && 
            !GameContent.this.oneIsPressed)
            GameContent.this.floorWanted = 9; 
          break;
        case 48:
          if (GameContent.this.inElevator) {
            if (GameContent.this.oneIsPressed) {
              GameContent.this.floorWanted = 10;
              break;
            } 
            if (!GameContent.this.oneIsPressed) {
              if (GameContent.this.hasBasementKey) {
                GameContent.this.floorWanted = 0;
                break;
              } 
              GameContent.this.floorWanted = GameContent.this.currentFloor;
              GameContent.this.timesMoved = 0;
              GameContent.this.messageChoice = 12;
            } 
          } 
          break;
      } 
    }
    
    public void keyReleased(KeyEvent e) {
      if (GameContent.this.semiAuto)
        switch (e.getKeyCode()) {
          case 32:
            GameContent.this.shotsFired = 0;
            break;
        }  
    }
  }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                