package gmaething;
import java.util.Scanner;
public class MainClass {
	
	public static void main (String[] args)
	{
		player Player = new player();
		 System.out.println(Weapon.Knife());
		@SuppressWarnings ("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("whats your name?");
		String playername = scan.nextLine();
		Player.Name(playername);
		Util.spacesLarge();
		player.Status();
		
		System.out.println("oh my oh my a monster! what ever will you do?\n1. Fight \n2. Run");
		int Decision = scan.nextInt();
		
		if (Decision == 1)
		{
			FirstFight.Fight();
		}
		else
		{
			System.out.println("wimp");
		}
		
		System.out.println("fights over");
		
	
	}
	

}
