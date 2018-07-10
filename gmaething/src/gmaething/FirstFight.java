package gmaething;
import java.util.Scanner;
public class FirstFight {
	
	public static void Fight()
	{
		@SuppressWarnings ("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("You see the monster up close.\n");
		Monster.Status();
		Util.spacessmall();
		
		while (Monster.currenthealth > 0)
		{
			System.out.println("Your Move!\n 1.Slash");
			int Action = scan.nextInt();
			switch (Action)
			{
				case 1:
					Util.spacessmall();
				    System.out.println("\nYou Slash!\n");
					Monster.Damage(Weapon.Knife());
					System.out.printf("\n You did %s damage!\nMonsters Health: %s\n\n", Weapon.Knife(), Monster.returnHealth());
			break;
			
			default: 
				Fight();
				break;
			
			}
			
			
		}
		
		
	}
 
}
