package JavaBasics;

import java.util.Scanner;

public class Agecheck {
	public static void check(int age) {
		if(age<=0)
		{
			throw new ArithmeticException("Age is zero or negative");
		}
		else
		{
			System.out.println("You have right  age");
		}
	}
	public static void main(String[] args) {
		Agecheck obj=new Agecheck();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		obj.check(age);
	
		
	}

}