package com.palakpakin;

public class Lake {
	
	public int progress;
	public float health;
	public float morale;
	public String gameStatus = "I";
	public boolean gameEnd = false;
	
	public Lake(int pro, float hp, float mo){
		progress = pro;
		health = hp;
		morale = mo;
	}
	
	public void update(){
		if (health <= 0 || morale <= 0){
			gameEnd = true;
		}
		checkGameStatus();
	}
	
	public void contaminateDamage(float cons){
		if (health >= cons){
			health -= cons;
		}
		else{
			health = -1;
		}
		
		if (health <= 0){
			gameEnd = true;
		}
	}
	
	public String checkGameStatus(){
		if (gameEnd){
			if (progress >= 100){
				gameStatus = "W";
			}
			else{
				gameStatus = "L";
			}
		}
		return gameStatus;
	}
}
