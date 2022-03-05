package com.company;

class Base1 {
	Base1(){ 
		System.out.println("hay i am a constructer");
	}
	public int x ;
	


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}	

}
class Derived1 extends Base1 {
	Derived1(){
	System.out.println("hay i am a derived class  constructer");
	System.out.println(" hi");
}

public int y;



public int getY() {
	return y;
}



public void setY(int y) {
	this.y = y;
}

}

public class constructors_in_inheritance {
	public static void main(String[]args) {
	Base1 b = new Base1	();
	Derived1  d =new Derived1 ();
	
	
	
	
	}
	}


