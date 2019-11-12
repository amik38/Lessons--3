package ua.lgs.lviv;

public class Rectangle {  

	  private int a, b;    

	  public Rectangle(int x) { b=x; } 

      public void setA(int x) { a=x; } 
      
	  public int getA() { return a; } 

	  public int getB() { return b; } 

	  public int getSquare() { return a*b; } 

	  public int getPerimeter() { return (a+b)*2; } 

	 

	}