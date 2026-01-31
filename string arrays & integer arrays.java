package week05;

import java.util.Random;
import java.util.Scanner;

public class Temp1 
{
	public static void main(String[] args)
	{
		String[] a = new String[5];
		String[] b = {"ahmed", "mehmet", "buse", "zulal"};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	/*
	 * 1. any type can have an array
	 * 2. any array, when created, becomes a new data type -> int[]
	 * 3. int[][][]
	 */
}



package week05;

public class Temp2 
{
	public static void main(String[] args)
	{
		int[] lab1 = {20, 50, 60, 90, 100};
		int[] lab2 = {25, 55, 80, 75, 95};
		int[] midterm = {80, 45, 80, 80, 90};
		int[] final_exam = {10, 60, 65, 80, 95};
		
		
		int[][] ain1002 = {lab1, lab2, midterm, final_exam};
		System.out.println(ain1002[2][1]);
		
		int total = ain1002[0][0] + ain1002[1][0] + ain1002[2][0] + ain1002[3][0];
		System.out.println(total / 4.0);
		
		double avg = CalculateAvg(ain1002, 0);
		System.out.println("2nd student's avg is: " + avg);
		
		String[][] names = {{"ali", "veli"},  // java students
							{"buse", "ayse", "zulal"},  // python students 
							{"ege", "malek", "rabia", "melih"}, // data science students
							{} // thesis students
							}; 
		System.out.println(names.length);  // 4
		System.out.println(names[0].length);  // 2
		System.out.println(names[1].length);  // 3
		
		String[][][][] names2 = new String[4][][][];
	}
	
	public static double CalculateAvg(int[][] grades, int stu)
	{
		double total = 0;
		
		for (int i = 0; i < grades.length; i++) {
			total += grades[i][stu];
		}
		
		
		return total / grades.length;
	}
}
