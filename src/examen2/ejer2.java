package examen2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		double resultado = 0;
		double aumento = 0;
		int sueldo = 0;
		int antiguedad = 0;
		
		
		
	
			
			System.out.print("Introduce tu sueldo:");
			sueldo = sc.nextInt();
			
			System.out.print("Introduce tu antiguedad:");
			antiguedad =sc.nextInt();
			
			
			//Cogemos el sueldo y la antiguedad y decimos el aumento
			if( (sueldo<1000) && (antiguedad>=10)) {
				
			
				
				aumento = 1.2;
				resultado = sueldo*aumento;
				System.out.println("Su sueldo a aumentado un 20%, con el aumento es de: ");
				System.out.println(resultado+ "$");
			}
				
		
				
			else if( (sueldo<1000) && (antiguedad<10)) {
				aumento = 1.05;
				resultado = sueldo*aumento;
				System.out.println("Su sueldo a aumentado un 5%, con el aumento es de: ");
				System.out.println(resultado+ "$");
				
				
			}
			else {
				
				System.out.println("Su sueldo sigue siendo el mismo:"+ sueldo + "$");
				
				
			}
			
			
			
			
			sc.close();
		}


	}

