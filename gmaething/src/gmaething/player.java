package gmaething;

public class player {
	private static int maxhealth = 10;
	private static int currenthealth = maxhealth;
	private static String playername;
	

	public void Name(String playername)
	{
		this.playername = playername;
	}
	public static int returnHealth()
	{
		return currenthealth;
	}
	public static int returnMaxHealth()
	{
		return maxhealth;
	}
	public static String returnPlayername()
	{
		
		return playername;
	}
	public static void Damage(int damage)
	{
	    
		currenthealth = currenthealth - damage;
	}
	public static void Status()
	{
		System.out.printf("Name: %s\nmaxhealth: %s\nCurrentHealth: %s\n", returnPlayername(), returnMaxHealth() ,returnHealth());
	}
	


}
