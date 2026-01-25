package week03;

public class Temp01 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i > 100)
		{
			System.out.println("i=" + i);
			i++;  // i = i + 1  i += 1
		}
		
		System.out.println("the last value of i after the while loop: " + i);
		System.out.println("-------");
		i = 0;
		do
		{
			System.out.println("i=" + i);
			i++;  // i = i + 1  i += 1
		}
		while(i > 100);
		System.out.println("the last value of i after the do-while loop: " + i);
	}
}

/*
 * LOOPS: 
 * 
 * 1. while
 * 2. do-while
 * 3. for
 * 
 * loop variable:
 * 1. initialize the loop var (i = 0)
 * 2. control the loop var (i < 5)
 * 3. update the loop var (i++) 
 */



package week03;

public class Temp02 
{
	public static void main(String[] args) 
	{
		/*
		 * 1. init
		 * 2. control
		 * 3. update
		 * 
		 * for(init; control; update)
		 */
		
		int i = 0;
		
		for( ; i < 3; i++)
		{
			System.out.println("i=" + i);
		}
		
		System.out.println("the last value of i after the for loop: " + i);
		
		for (i = 0; i < -5; i++) {
			System.out.println("i=" + i);
		}
		
		System.out.println("the last value of i after the for loop: " + i);
		
	}
	
	
}




package week03;

import java.util.Scanner;

public class Temp03
{
	public static void main(String[] args)
	{
		// type nickname = initialize
		// type nickname = new type();
		// Person p1 = new Person("Duygu", "Cakir");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) 
		{
			System.out.println("hi!");
		}
		
	}
}




package week03;

import java.util.Random;
import java.util.Scanner;

public class Temp04 
{
	public static void main(String[] args)
	{
		// Person p1 = new Person("Duygu", "Cakir");
		//Scanner sc = new Scanner(System.in);

		//Random -> java util
		Random r = new Random();
		int n = r.nextInt(10);  // [0, 10)
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("hi");
		}
	}
}



package week03;

public class Temp05 
{
	public static void main(String[] args)
	{
		/*
		for (int i = 0; i < 5; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		*/
		
		for (int j = 0; j < 3; j++)
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




package week03;

public class Temp06
{
	public static void method1()
	{
		for (int j = 0; j < 3; j++)
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	
	public static void method2()
	{
		for (int j = 0; j < 2; j++)
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	
	public static void MethodGeneral(int rows, int cols)
	{
		for (int j = 0; j < rows; j++)
		{
			for (int i = 0; i < cols; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	
	public static void m1()
	{
		System.out.println("just hi");
	}

	public static void m1(int a)
	{
		System.out.println("hi " + a);
	}
	
	public static void m1(int a, double d)
	{
		System.out.println("hi" + a * d);
	}
	
	public static void main(String[] args)
	{	
		//method1();
		
		//method2();
		MethodGeneral(3, 5);
		MethodGeneral(2, 10);
		
		m1();
		m1(10);
		m1(5, 5);
		
		boolean hand1 = alp("eraser");
		System.out.println(hand1);
		
		//boolean hand2 = polat("marker");
		polat("marker", "eraser");
	}
	
	public static boolean alp(String s)
	{
		System.out.println("i caught the " + s);
		return false;
		
	}

	public static void polat(String s1, String s2)
	{
		System.out.println("i caught the " + s1);
	}

	
}
