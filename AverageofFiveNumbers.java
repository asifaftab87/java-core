package hellworld;

import java.util.Scanner;

public class AverageofFiveNumbers
{

	public static void main(String[] args) 
	{ 
		int num1,num2,num3,num4,num5;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First Input Number");
		num1 =scan.nextInt(); 
		System.out.println("Second Input Number");
		num2 =scan.nextInt(); 
		System.out.println("Third Input Number");
		num3 =scan.nextInt(); 
		System.out.println("Fourth Input Number");
		num4 =scan.nextInt(); 
		System.out.println("Fifth Input Number");
		num5 =scan.nextInt(); 
		System.out.println("Average of Five numbers is :" + (num1 + num2+ num3 + num4 + num5)/5);

	}

}
