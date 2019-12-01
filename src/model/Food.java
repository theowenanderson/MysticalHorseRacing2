package model;

public class Food {
	
	String name;
	private int id;
	private String stat;
	private int modifier;
	
	public Food(String name, int id, String stat, int modifier)
	{
		this.name = name;
		this.id = id;
		this.stat = stat;
		this.modifier = modifier;
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
		return this.stat;
	}
	
	public int getModifier()
	{
		return this.modifier;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void setId(int newId)
	{
		this.id = newId;
	}
	
	public void setSkill(String newStat)
	{
		this.stat = newStat;
	}
	
	public void setModifier(int newModifier)
	{
		this.modifier = newModifier;
	}
	
	@Override
	public String toString() 
	{
		return "Food [name=" + name + ", id=" + id + ", stat=" + stat + ", modifier=" + modifier + "]";
	}
	
	
}
