package model;

import java.util.Random;

public class Horse {
	String name;
	private int id;
	private int legSize;
	private int bodySize;
	private int stamina;
	private int strength;
	private int acceleration;
	private int confidence;
	private int luck;
	public int points = 0;
	
	public Horse( int id,String name, int legSize, int bodySize, int stamina, int strength, int acceleration,
			int confidence, int luck) {
		super();
		this.name = name;
		this.id = id;
		this.legSize = legSize;
		this.bodySize = bodySize;
		this.stamina = stamina;
		this.strength = strength;
		this.acceleration = acceleration;
		this.confidence = confidence;
		this.luck = luck;

	}
	//Random horse create
	public Horse() {
		Random rand = new Random();
		this.name = "CPU";
		this.id = -1;
		this.legSize = rand.nextInt(7);
		this.bodySize = rand.nextInt(7);
		this.stamina = rand.nextInt(7);
		this.strength = rand.nextInt(7);
		this.acceleration = rand.nextInt(7);
		this.confidence = rand.nextInt(7);
		this.luck = rand.nextInt(7);
	}
	public Horse(int x) {
		if(x == 1) {
			this.name = "CPU1";
			this.id = -1;
			this.legSize = 4;
			this.bodySize = 2;
			this.stamina = 5;
			this.strength = 3;
			this.acceleration = 8;
			this.confidence = 9;
			this.luck = 5;
			this.points = 0;
		}
		else if(x == 2) {
			this.name = "CPU2";
			this.id = -1;
			this.legSize = 4;
			this.bodySize = 6;
			this.stamina = 5;
			this.strength = 8;
			this.acceleration = 1;
			this.confidence = 3;
			this.luck = 5;
			this.points = 0;
		}
		else if(x == 3) {
			this.name = "CPU3";
			this.id = -1;
			this.legSize = 6;
			this.bodySize = 5;
			this.stamina = 4;
			this.strength = 3;
			this.acceleration = 2;
			this.confidence = 3;
			this.luck = 6;
			this.points = 0;
		}
		else if(x == 4) {
			this.name = "CPU4";
			this.id = -1;
			this.legSize = 7;
			this.bodySize = 4;
			this.stamina = 8;
			this.strength = 3;
			this.acceleration = 5;
			this.confidence = 3;
			this.luck = 8;
			this.points = 0;
		}
		else if(x == 5) {
			this.name = "CPU5";
			this.id = -1;
			this.legSize = 6;
			this.bodySize = 3;
			this.stamina = 9;
			this.strength = 3;
			this.acceleration = 2;
			this.confidence = 7;
			this.luck = 5;
			this.points = 0;
			
		}
		else if(x == 6) {
			this.name = "CPU6";
			this.id = -1;
			this.legSize = 3;
			this.bodySize = 8;
			this.stamina = 9;
			this.strength = 2;
			this.acceleration = 3;
			this.confidence = 4;
			this.luck = 5;
			this.points = 0;
		}
		else if(x == 7) {
			this.name = "CPU7";
			this.id = -1;
			this.legSize = 4;
			this.bodySize = 2;
			this.stamina = 5;
			this.strength = 3;
			this.acceleration = 1;
			this.confidence = 3;
			this.luck = 5;
			this.points = 0;
		}
		else if(x == 8) {
			this.name = "CPU8";
			this.id = -1;
			this.legSize = 4;
			this.bodySize = 6;
			this.stamina = 9;
			this.strength = 1;
			this.acceleration = 1;
			this.confidence = 3;
			this.luck = 5;
			this.points = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLegSize() {
		return legSize;
	}
	public void setLegSize(int legSize) {
		this.legSize = legSize;
	}
	public int getBodySize() {
		return bodySize;
	}
	public void setBodySize(int bodySize) {
		this.bodySize = bodySize;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	public int getConfidence() {
		return confidence;
	}
	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	public int getPoints() {
		return this.points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void addPoints(int p) {
		this.points += p;
	}
	@Override
	public String toString() {
		return "Horse [name=" + name + ", id=" + id + ", legSize=" + legSize + ", bodySize=" + bodySize + ", stamina="
				+ stamina + ", strength=" + strength + ", acceleration=" + acceleration + ", confidence=" + confidence
				+ ", luck=" + luck + "]";
	}
}
