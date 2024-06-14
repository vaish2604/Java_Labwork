package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Create a HashMap to store employee IDs (Integer) and employee names (String)
		Map<Integer,String> emp=new HashMap<Integer,String>();
		
		// Add some employee ID and name pairs to the HashMap
		emp.put(100,"Omkar");
		emp.put(101, "Aarav");
		emp.put(102, "Gaytari");
		emp.put(103, "Seema");
		emp.put(104, "Savitri");
		
		// Display the contents of the HashMap
		System.out.println("Employee Details");
		for(Integer empid:emp.keySet()) // Iterate over all keys (employee IDs)
		{
			System.out.println("Employee ID:"+empid+",Employee Name:"+emp.get(empid));// Print key-value pairs
		}
	

	}

}
