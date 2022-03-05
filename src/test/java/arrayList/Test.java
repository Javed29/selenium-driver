 package arrayList;

public class Test 
{	

	public static void main(String[] args) 
	{
   // Example array
	 int i = 10;
	 i = 20;
	 int j = 30;
 
   System.out.println("value of i is " + i);
   System.out.println(i);
 
   System.out.println("---------------------------- ");
	


  //Example - 2

 double k1[]= new double[5];
 
 k1[0] = 12.33;
 k1[1] = 45.56; 
 //k1[2] = 45.56;
  k1[3] = 50; // can be stored as double can store in // 50.00
  k1[4] = 99.78;
  System.out.println(k1[0]);
  System.out.println("---------------------------- ");
  //Example -3
  Object emp[] = new Object[5];
  emp[0] = "Tom"; // name 
  emp[1] = 25; //age 
  emp[2] = 699 ; // salary in dollars 
  emp[3] = true; // resident of india 
  emp[4] = 'm'; //gender
  for (int a=0; a<emp.length; a++)
	  
	  System.out.println(emp[a]);
  System.out.println("---------------------------- ");
  
  
	
  
  }
  }
 
  
  
