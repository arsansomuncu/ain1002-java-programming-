package week04;

import java.util.Random;
import java.util.Scanner;

public class temp5 
{
	public static void main(String[] args) 
	{
		int[] my_numbers = {1,2, 3, 4, 5};//TakeNumbersFromUser(5);
		Print(my_numbers);
		int[] lottery_numbers = GenerateRandomNumbers(5);
		Print(lottery_numbers);
		
		int matches = PlayLottery(my_numbers, lottery_numbers);
		
		System.out.println("You have "+matches+" matche(s)");
	}
	
	public static int PlayLottery(int[] my, int[] loto)
	{
		int counter = 0;
		for (int i = 0; i < loto.length; i++) {
			for (int j = 0; j < loto.length; j++) {
				if(my[i] == loto[j])
					counter++;
			}
		}
		
		return counter;
	}
	
	public static void Print(int[] a)
	{
		//print the numbers in the array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	public static int[] TakeNumbersFromUser(int n)
	{
		int[] a = new int[n];
		//fill this with user numbers:
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter the next number between [0, 50]:");
			int number = sc.nextInt(); //i=0 -> 50, i=1 -> 50, i=2
			
			if(Exists(number, a))
			{
				System.out.println("The number already exists. Enter a new number. ");
				i--;
				continue;
			}
			if(number < 0 || number > 50)
			{
				System.out.println("Outside bounds. Try again");
				i--;
				continue;
			}
			
			a[i] = number; 
		}
		
		return a;
	}	
	
	public static boolean Exists(int number, int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			if(a[i] == number)
				return true;
		}
		return false;
	}
	public static int[] GenerateRandomNumbers(int n)
	{
		int[] a = new int[n];
		//fill this with random numbers
		
		Random r = new Random();
		
		for (int i = 0; i < n; i++)
		{
			int number = r.nextInt(51);
			if(Exists(number, a))
			{
				i--;
				continue;
			}
			a[i] = number;
		}
		return a;
	}
}
