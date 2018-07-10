package gmaething;

import java.util.Random;

     public class Util {
	 static Random rnd = new Random();
	 static  int rnnnd;
		
	public static void spacesLarge()
	{
		for (int x = 0; x < 50; ++x) System.out.println("\n");
	}
	public static void spacessmall()
	{
		for (int x = 0; x < 2; x++) System.out.println("\n");
	}
	public static int attackDmg(int num1, int num2)
	{
		 int rnnd = num1 + rnd.nextInt(num2);
		 int rnnnd = rnnd;
		return rnnnd;
	}
}
