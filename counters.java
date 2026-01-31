package week04;

public class temp3 
{
	static int counter = 0;
	int unstatic_counter = 0;
	public static void main(String[] args) 
	{
		int duygu = murat(5);
		murat(5);
		arsan();
		int a = arsan();
	}
	public static void arsan()
	{
		System.out.println("aslkdjaksjdlkasdklam");
	}
	
	public static int murat(int hand1)
	{
		System.out.println("kjashdkjas");
		return 50;
	}
}



package week04;

import java.util.Random;
import java.util.Scanner;

public class temp4 
{
	public static void main(String[] args) 
	{
		temp3.arsan();
		temp1.m2(4, 5);
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Scanner.nextInt();
		Random r = new Random();
		a = r.nextInt(500);
		Random.nextDouble();
		
		double d = Math.pow(2, 5);*/
		System.out.println(Math.pow(2, 5));
		
		/*m1();
		temp4.m1();
		temp4 t = new temp4();
		t.m1();*/
		System.out.println(temp3.counter);
		temp3.counter++; //duygu
		temp3.counter++; // murat
		temp3.counter++; // arsan
		System.out.println("visitors in total:" + temp3.counter);
		temp3 duygu = new temp3();
		duygu.unstatic_counter++;
		
		temp3 arsan = new temp3();
		arsan.unstatic_counter++;
		int a = 5;
		
		System.out.println(a); // 5
		a++; //6
		++a; // 7
		System.out.println(a); // 7
		System.out.println(a++); // see 7, but it is 8
		System.out.println(a); // 8
		System.out.println(++a); // see 9, it is actually 9
		System.out.println(a); // 9
		int b = a++; // b=9, a = 10
		System.out.println("a:" + a + " b:" + b);
		b = ++a;  // a:11, b: 11
	}
	
	public void m1()
	{
		
	}
}

