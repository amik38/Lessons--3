package ua.lgs.lviv;

public class Kolo {
	
	  private double r, d;    

	  public Kolo (double x) { r=x; } 

    public void setR(double x) { d=2*r; } 
    
	  public double getR() { return r; } 

	  public double getD() { return d; } 

	  public double getSquare() { return (Math.PI* r*r); } 

	  

	public double getPerimeter() { return (r*2*Math.PI); } 


}
