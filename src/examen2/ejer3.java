package examen2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		int marca = 0;
		int modelo = 0;
		

		System.out.println("Introduce su marca (1) si es renault, (2) si es ford, (3) otra marca");
		 marca = sc.nextInt();
		 
		 System.out.println("Introduce su modelo (1) fiesta, (2) focus, (0) otra");
		 modelo = sc.nextInt();
		 
		 
		 //Cogemos el modelo y la marca y averiguamos el descuento
		 if((marca==1)) {
			 	 
		 System.out.println("Tiene un descuento 15%");
		 }
	
		 else if((marca == 2)&&(modelo ==1)){
		
		 System.out.println("Tienes un descuento del 7%");	 
		 		 
		 }
		 
		 else if((marca == 2)&&(modelo ==2)){
		 
		 System.out.println("Tienes un descuento del 10%");	 
		 
		 }
		 else
		
		 System.out.println("Tienes un descuento del 5%");
	
	sc.close();
	}
	

}
