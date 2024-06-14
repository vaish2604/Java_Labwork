package Sorting;

import java.util.Scanner;

public class Descendingsort {
	int a[]=new int[5];// Array to hold 5 integers
	int i,j,temp;
	Scanner sc=new Scanner(System.in);
	
	// Method to accept 5 numbers from the user
	public void accept()
	{
		System.out.println("Enter five numbers:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	// Method to sort the array in descending order
	public void sort()
	{
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]<a[j]) // Change the comparison for descending order
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public void display() // Method to display the sorted array
	{
		System.out.println("The sorted elements are:");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	// Main method to execute the program

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Descendingsort obj=new Descendingsort();
		obj.accept(); // Accept input from the user
		obj.sort(); // Sort the array in descending order
		obj.display(); // Display the sorted array

	}

}

	