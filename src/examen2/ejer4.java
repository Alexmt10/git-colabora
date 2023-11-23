package examen2;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		
		
		
		System.out.println("Ingresa un número");
		num1 = sc.nextInt();
		
		System.out.println("Ingresa otro número");
		num2 = sc.nextInt();
		
		
		System.out.println("Los números divisbles del 1 al "+num1+" entre "+num2+" son:"); 
		
		
		//Calculamos los números del 1 al numero1 que son divisibles entre el numero 2
		for(int i = 1 ; i <= num1 ; i++) {
			
			if (i%num2==0) {
				
			System.out.println(i);
			
			}
			
		}

      sc.close();
	}

}
