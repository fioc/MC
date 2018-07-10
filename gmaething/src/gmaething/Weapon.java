package gmaething;


public class Weapon {
	static  String WName;
	 static int WDamage;
		
	public String ReturnWName()
	{
		return WName;
	}
	
	public int WDamage()
	{
		return WDamage;
	}
		
	public static int Knife()
	{
		WDamage = Util.attackDmg(3, 4);
		return WDamage;
	}
	
}
