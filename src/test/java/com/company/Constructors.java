package com.company;
class  cylinder {


private int radius;
private int height;


public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}



}

public class Constructors {
  public static void main (String[]args) {
	cylinder mycylinder =new cylinder();
	mycylinder.setHeight(24);
	System.out.println (mycylinder.getHeight());
	
	mycylinder.setRadius(9);  
	System.out.println (mycylinder.getRadius());
}
}