package gmaething;

public class Monster {
	private static int maxhealth = 10;
	static int currenthealth = maxhealth;
	private static String monstername = "bob";
	

	
	public static int returnHealth()
	{
		return currenthealth;
	}
	public static int returnMaxHealth()
	{
		return maxhealth;
	}
	public static String returnMonstername()
	{
		
		return monstername;
	}
	public static void Damage(int damage)
	{
	    
		currenthealth = currenthealth - damage;
	}
	public static void Status()
	{
		System.out.printf("Monster type: %s\nmaxhealth: %s\nCurrentHealth: %s\n", returnMonstername(), returnMaxHealth() ,returnHealth());
	}
	


}
