package model;

public class Jockey {
	
	String name;
	private int id;
	private String skill;
	
	public Jockey(String name, int id, String skill)
	{
		this.name = name;
		this.id = id;
		this.skill = skill;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getSkill()
	{
		return this.skill;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void setId(int newId)
	{
		this.id = newId;
	}
	
	public void setSkill(String newSkill)
	{
		this.skill = newSkill;
	}
	
	@Override
	public String toString() 
	{
		return "Jockey [name=" + name + ", id=" + id + ", skill=" + skill + "]";
	}
	
}
