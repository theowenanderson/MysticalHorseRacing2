package model;


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
	public Horse() {
		
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
	@Override
	public String toString() {
		return "Horse [name=" + name + ", id=" + id + ", legSize=" + legSize + ", bodySize=" + bodySize + ", stamina="
				+ stamina + ", strength=" + strength + ", acceleration=" + acceleration + ", confidence=" + confidence
				+ ", luck=" + luck + "]";
	}
}
