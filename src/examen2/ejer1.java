package examen2;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		char seguir = 's';
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int produc1 = 0;
		int produc2 = 0;
		
		
		while (seguir == 's') {
		
		System.out.println("Introduce un número de 4 cifras");
		 num1 = sc.nextInt();
		
		System.out.println("Introduce el primer dígito");
		 num2 = sc.nextInt();
		
		System.out.println("Introduce el segundo dígito");
		 num3 = sc.nextInt();
				
		System.out.println("Introduce el tercer dígito");
		 num4 = sc.nextInt();
		
		System.out.println("Introduce el cuarto dígito");
		 num5 = sc.nextInt();
		 
		 produc1 = num2*num3;
		 produc2 = num4*num5;
		 
		 
		 //Agrupamos los dos primeros digitos y los dos ultimos y decimos cual producto es mayor
		 if (produc1 > produc2) {
			 
			 System.out.println("El producto de las 2 primeras cifras "+ produc1 + " es mayor que el de la 2 ultimas "+ produc2);
			 
		 }
		 
		 else {
				
				 System.out.println("El producto de las 2 ultimas cifras "+produc2+ " es mayor que el de las 2 primeras "+ produc1);	 
		 
		 }
		
		 System.out.println("Deseas seguir 's' si 'n' no");
		 seguir = sc.next().charAt(0);
		}
		
		
		sc.close();
	}
}
