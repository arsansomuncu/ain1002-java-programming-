package week05;

import java.util.ArrayList;
import java.util.Random;

public class Temp3 
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
//		a[0] = 45678;
		a.add(234567);
		//C++
		a.add("Python");
		a.add(true);
		a.add(4.5);
		a.add(4.5f);
		a.add('F');
		a.add("Java");
		a.add(new Random());
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(0)); //a[0]
		a.add(1, "C++");
		System.out.println(a);
		a.set(1, "Matlab");
		System.out.println(a);
		
	}
}



package week05;

import java.util.ArrayList;
import java.util.Random;

public class Temp4 
{
	public static void main(String[] args)
	{
		ArrayList<Random> a = new ArrayList();
//		a[0] = 45678;
		a.add(234567);
		//C++
		a.add("Python");
		a.add(true);
		a.add(4.5);
		a.add(4.5f);
		a.add('F');
		a.add("Java");
		a.add(new Random());
	}
}
