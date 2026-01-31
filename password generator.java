package week06;

import java.util.Random;

public class Student 
{
	public String name;
	public int id;
	private String password;
	
	public Student(String name, int id)
	{
		this.password = GeneratePassword();
		this.name = name;
		this.id = id;
	}
	
	public Student()
	{
		
	}

	public String toString() 
	{
		return name + ", id=" + id;
	}

	public void setPassword(String p)
	{
		this.password = p;
	}
	
	public String GeneratePassword()
	{
		Random r = new Random();
		
		String pass = "";
		//letters, numbers, symbols
		
		for (int i = 0; i < 8; i++) 
		{
			pass += (char)(r.nextInt(91-33) + 33);
		}
		
		return pass;
	}
}
