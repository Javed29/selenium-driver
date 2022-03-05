package com.company;


class Employee{
	int id;
   int salary;
	String name;
	public void printDetails() {
		System .out.println ("my it is"+ id);
		System .out.println ("and my name is"+name);
}
	 int getsalary() {
    return salary;
	}

}
public class oops_contant {
   public static void main (String[]args) {
	System.out.println("this is a castumar class");
	Employee rahul= new Employee();
	Employee javed = new Employee ();
	//setting Attributes
	
	//setting Attributes for javed
	javed.id =12;
	javed .name = "javedBeg";
	javed.salary =342;
	System.out.println(javed. id);
	System.out.println(javed.name);
	//setting Attributes for rahul
	rahul.id = 24 ;
	rahul.name = "rahulraj";
	rahul.salary = 366;
	javed.printDetails();
	rahul. printDetails();
	int salary =javed.getsalary();
	System.out.println(salary);
}
   
}