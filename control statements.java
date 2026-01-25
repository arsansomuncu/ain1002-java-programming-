package control_statements;

public class Temp03
{
	public static void main(String[] args) 
	{
		int grade = 80;
		
		//if grade > 90:
		/*if(grade > 90)
		{
		System.out.println("wow");
		System.out.println("you got A! ");
		}*/
		
		if(grade > 90)
		{
			System.out.println("wow");
			System.out.println("you got A! ");
		}
		else if(grade > 80)
			System.out.println("you got B");
		else if(grade > 70)
			System.out.println("you got C");
		else if(grade > 60)
			System.out.println("you got D");
		else 
			System.out.println("you failed");
		
	}
}
