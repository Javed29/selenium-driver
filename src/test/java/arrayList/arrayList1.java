package arrayList;

import java.util.ArrayList;

public class arrayList1 {

public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(); // raw type arraylist, here any type of data can be stored
		
		System.out.println("---------------------------");
		System.out.println("Empty Arraylist Size is -> ");
		System.out.println(ar.size()); // will print size of ArrayList which is 0
		System.out.println("---------------------------");
		
		System.out.println("Adding values 3 values in the empty arraylist");
		ar.add(100); // 0th index
		ar.add(200); // 1st index
		ar.add("test"); // 2nd index
		System.out.println("After adding 3 values checking the size of arraylist -> ");
		System.out.println(ar.size()); // will print size of ArrayList which is 3
		System.out.println("---------------------------");
		
		System.out.println("Adding 2 more values in arraylist");
		ar.add(500); // 3rd index
		ar.add(800); // 4th index
		System.out.println("After adding 2 more values checking the size of arraylist -> ");
		System.out.println(ar.size()); // will print size of ArrayList which is 5
		System.out.println("---------------------------");
		
		System.out.println("Printing all values from the arraylist");
		// To print all values of the ArrayList
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i)); // this will print all the values currently an ArrayList is holding
		}
		System.out.println("---------------------------");
		
		System.out.println("Accessing value form arraylist with specific index");
		System.out.println(ar.get(2)); // will print the value of 2nd index value which is test
		System.out.println("---------------------------");
		
		System.out.println("Trying to access a value form arraylist more than its decleared size");
		// System.out.println(ar.get(6)); // will throw exception  java.lang.IndexOutOfBoundException as there is no value at  6th index
		System.out.println("---------------------------");
		
		System.out.println("Removing value form arraylist at a specific index and re-printing the values");
		ar.remove(3); // this will remove the value from 3rd index
		System.out.println("After removing the value from 3rd index the size of arraylist is -> " + ar.size());
		for(int j=0; j<ar.size(); j++)
		{
			System.out.println(ar.get(j)); // this will print all the values currently an ArrayList is holding
		}
		System.out.println("---------------------------");
		
		System.out.println("Checking a value is available in the arraylist");
		// To check some values is present in ArrayList
		for(int k=0; k<ar.size(); k++)
		{
			if (ar.get(k).equals("test")) 
			{
				System.out.println("At index value " + k + " \"" + ar.get(k) + "\" is present");
			}
			System.out.println("---------------------------");
			
			
		//ArrayList-GenricType
		// ArrayList of String Type
			ArrayList<String> userNames = new ArrayList<String>();
			userNames.add("Tom");
			userNames.add("Peter");
			userNames.add("Mark");
			// userNames.add(45); // this line will throw an error at compile time
			
			System.out.println("Printing the all values form arraylist");
			for (int i = 0; i < userNames.size(); i++) {
				System.out.println(userNames.get(i));
			}
			
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			numberList.add(10);
			numberList.add(20);
			numberList.add(30);
			numberList.add(40);
			// numberList.add("Fifty"); // this line will throw an error at compile time
			
			System.out.println("Printing the all values form arraylist");
			for (int i = 0; i < numberList.size(); i++) {
				System.out.println(numberList.get(i));
		}
	}

}
} 