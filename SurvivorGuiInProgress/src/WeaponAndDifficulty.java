
public class WeaponAndDifficulty {
	
	public static int damageCalculator(String weapon, int option) { //calculates the damage the current item will do
		int timeDelay = 0;
		int damage = 0;
		int semiAuto = 0;
		int reloadTimeNeeded = 0;
		
		
		System.out.println("switched");
		if(weapon.equals("glock")) {
			timeDelay = 20;
			damage = 5;
			semiAuto = 1;
			reloadTimeNeeded = 1000;
		}
		
		else if(weapon.equals("1911 custom pistol")) {
			timeDelay = 20;
			damage = 15;
			semiAuto = 1;
			reloadTimeNeeded = 1000;
		}
		
		else if(weapon.equals("Uzi")) {
			timeDelay = 20;
			damage = 7;
			semiAuto = 0;
			reloadTimeNeeded  = 300;
		}
		
		else if(weapon.equals("306 rifle")) {
			timeDelay = 5;
			damage = 50;
			semiAuto = 1;
			reloadTimeNeeded = 7000;
		}
		
		else if(weapon.equals("50 Cal Sniper Rifle")) {
			timeDelay = 5; 
			damage = 50;
			semiAuto = 1;
			reloadTimeNeeded = 3000;
		}
		
		else if(weapon.equals("AR_15")) {
			timeDelay = 13;
			damage = 10;
			semiAuto = 1;
			reloadTimeNeeded = 1000;
		}
		
		else if(weapon.equals("M16")) {
			timeDelay = 10;
			damage = 20;
			semiAuto = 0;
			reloadTimeNeeded = 700;
		}
		
		else if(weapon.equals("PKM")) {
			timeDelay = 10;
			damage = 20;
			semiAuto = 0;
			reloadTimeNeeded = 400;
		}
		
		else if(weapon.equals("50 Cal Machine Gun")) {
			timeDelay = 10;
			damage = 40;
			semiAuto = 0;
			reloadTimeNeeded = 500;
		}
		
		else if(weapon.equals("Marley and Harley")) {
			timeDelay = 50;
			damage = 40;
			semiAuto = 1;
			reloadTimeNeeded = 1500;
		}
		
		
		switch(option) {
			case 0:
				return timeDelay;
			case 1:
				return damage;
			case 2:
				return semiAuto;
			case 3:
				return reloadTimeNeeded;
			
			default:
				return 0;
		}
		
	
	}
	
//	//more construction for each level
	public static int difficultyCalculator(int difficulty,int zombiesKilledOnFloor, int option) { //calculates the difficulty level of each game
		int zombiesAllowedPerLevel = 0;
		int timeBeforeNextWave = 0;
		int timeBeforeNextMove = 0;
		int zombHealth = 0;
		
		if(difficulty == 1) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 5; // take half the zombie waves survived so far and multiply by 5 to get the amount of zombies
			timeBeforeNextWave = 10000;
			timeBeforeNextMove = 10000;
			zombHealth = 100;
		}
		
		else if(difficulty == 2) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 20;
			timeBeforeNextWave = 8000;
			timeBeforeNextMove = 9000;
			zombHealth = 105;
		}
	
		else if(difficulty == 3) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 25;
			timeBeforeNextWave = 9000;
			timeBeforeNextMove = 8000;
			zombHealth = 100;
		}
		
		else if(difficulty == 4) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 30;
			timeBeforeNextWave = 9000;
			timeBeforeNextMove = 8000;
			zombHealth = 100;
		}
		
		else if(difficulty == 5) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 35;
			timeBeforeNextWave = 9000;
			timeBeforeNextMove = 8000;
			zombHealth = 150;
		}
		
		else if(difficulty == 6) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 40;
			timeBeforeNextWave = 7500;
			timeBeforeNextMove = 8000;
			zombHealth = 150;
		}
		
		else if(difficulty == 7) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 45;
			timeBeforeNextWave = 6000;
			timeBeforeNextMove = 7500;
			zombHealth = 150;
		}
		
		else if(difficulty == 8) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 60;
			timeBeforeNextWave = 5500;
			timeBeforeNextMove = 7500;
			zombHealth = 150;
		}
		
		else if(difficulty == 9) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 80;
			timeBeforeNextWave = 5000;
			timeBeforeNextMove = 7500;
			zombHealth = 150;
		}
		//not done
		else if(difficulty == 10) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 90;
			timeBeforeNextWave = 4800;
			timeBeforeNextMove = 7250;
			zombHealth = 150;
		}
		
		else if(difficulty == 11) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 100;
			timeBeforeNextWave = 4700;
			timeBeforeNextMove = 7250;
			zombHealth = 150;
		}
		
		else if(difficulty == 12) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 125;
			timeBeforeNextWave = 4650;
			timeBeforeNextMove = 7000;
			zombHealth = 175;
		}
		
		else if(difficulty == 13) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 1;
			timeBeforeNextWave = 4600;
			timeBeforeNextMove = 7000;
			zombHealth = 150;
		}
		
		else if(difficulty == 14) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 160;
			timeBeforeNextWave = 4500;
			timeBeforeNextMove = 7000;
			zombHealth = 150;
		}
		
		else if(difficulty == 15) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 175;
			timeBeforeNextWave = 4200;
			timeBeforeNextMove = 7000;
			zombHealth = 150;
		}
		
		else if(difficulty == 16) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 185;
			timeBeforeNextWave = 4100;
			timeBeforeNextMove = 7000;
			zombHealth = 150;
		}
		
		else if(difficulty == 17) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 195;
			timeBeforeNextWave = 4100;
			timeBeforeNextMove = 7000;
			zombHealth = 150;
		}
		
		else if(difficulty == 18) {
			zombiesAllowedPerLevel = zombiesKilledOnFloor * 2 + 100050;
			timeBeforeNextWave = 000;
			timeBeforeNextMove = 1000;
			zombHealth = 150;
		}
		
		
		switch(option) {
			case 0: 
				return zombiesAllowedPerLevel;
			case 1: 
				return timeBeforeNextWave;
			case 2: 
				return timeBeforeNextMove;
			case 3: 
				return zombHealth;
				
			default:
				return 0;
		}
	
	}
}
