package Sorting;

import java.util.Scanner;

public class SecondSmallestSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
	    
	    // Input size of array
	    System.out.println("Enter the number of elements");
	    int n = sc.nextInt();
	    
	    // Input array elements
	    int[] arr = new int[n];
	    System.out.println("Enter "+ n +" elements:");
	    for (int i=0; i<n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    // Initialize variables for second smallest and second largest
	    int smallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;
	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    
	    for (int num : arr) {
	    	// Finding second smallest element
	    	if(num < smallest) {
	    		secondSmallest = smallest;
	    		smallest = num;
	    	} 
	    	else if (num < secondSmallest && num !=smallest) 
	    	{
	    		secondSmallest = num;
	    	}
	    	
	    	// Finding second largest element
	    	if (num > largest) {
	    		secondLargest = largest;
	    		largest = num;
	    	}
	    	else if(num > secondLargest && num != largest) {
	    		secondLargest = num;
	    	}
	    }
	    // Output the results
	    System.out.println("Second smallest element: " + secondSmallest);
	    System.out.println("Second largest element:" + secondLargest);
	    
	    sc.close();
	    
	}

	}


