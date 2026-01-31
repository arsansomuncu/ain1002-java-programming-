package week04;

public class temp1 
{
	public static void main(String[] args) 
	{
		m1();
		System.out.println();
		m2(5);
		System.out.println();
		m2(4, 1);
		System.out.println();
		int r = m3();
		System.out.println(r);
		double r2 = m4(3, 4.5);
		System.out.println(r2);
		String s1 = m4(m3(), "hi");
		System.out.println(s1);
		String s2 = m5(m3(), "hi");
		System.out.println(s2);
	}
	
	public static String m5(int a, String s1)
	{
		String s = "";
		int i = 0; 
		
		while(i < a)
		{
			s += s1;
			i++;
		}
		
		return s;
	}
	
	public static String m4(int a, String s1)
	{
		// return 4 hi's
//		return a * "hi";
		String s = "";
		
		for (int i = 0; i <	a; i++)
		{
			s += s1;
		}
		
		return s;
	}
	
	public static double m4(double a, double b)
	{
		return a * b;
	}
	
	public static int m3()
	{
		return 4;
	}
	
	public static void m2(double a, int b)
	{
		System.out.println(a * b);
	}
	
	public static void m2(int a)
	{
		for (int i = 0; i < a; i++) {
			System.out.println("hi from m2");
		}
	}
	
	public static void m1()
	{	
		System.out.println("hi from m1!");
	}
}



package week04;

public class temp2 
{
	public static void main(String[] args) 
	{
		int[] a = {3, 4, 9, 10, -34};
		int[] b = new int[5];
		
		System.out.println(a[0]);
//		System.out.println(a[2:5:2]);
		System.out.println(a[4]);
		if(a.length > 0)
			System.out.println(a[a.length - 1]);
		
		m1(b);
		a = m2(a, b);
		
		b[0] = -100;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int[] m2(int[] a, int[] b)
	{
		int[] s = {0, 1, 2};
		return s;
	}
	public static void m1(int[] a)
	{
		
	}
	
}
/*
 * 1. every type can have an array
 * 2. when an array is created, that array becomes a new type: int[]
 * 3. int[][][][][].... 
 */

/*
 * Arrays: 
 * 
 * 1. static / not dynamic
 * 2. have a certain type
 * 3. have a pre-defined size
 */
