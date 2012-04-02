package com.palakpakin;

public class Contamination {
	
	public Lake lake;
	public float damage;
	
	public Contamination(Lake la){
		lake = la;
	}
	
	public void action(){
		lake.contaminateDamage(damage);
	}

}
