package ua.lgs.lviv;

public class SPkola {
	 public static void main(String [ ] args) {      

		  Kolo z=new Kolo(5);    

		  z.setR(2); 

		  System.out.println("Радіус кола="+z.getR()+"  Діаметр кола="+z.getD()); 

		  System.out.println("Площа кола ="+z.getSquare()); 

		  System.out.println("Периметр кола ="+z.getPerimeter()); 


		  } 

		

}
