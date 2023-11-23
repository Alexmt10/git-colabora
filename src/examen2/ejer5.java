package examen2;

import java.util.Scanner;

public class ejer5 {
	
public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		int contnotas = 0;
		int nota = 0;
		int mayornota = 0;
		int notavalidamasbaja = 0;
		int media = 0;
		boolean acierto = true;
		
		System.out.println("Introduce una nota");
		nota = sc.nextInt();
		
		
		while( acierto == true) {
			
		if ( (nota<0)||(nota>10)){
				
		System.out.println("Terminar");
		
		acierto = false;
		}
		
		else {
			
			if (nota>5) {
				nota=notavalidamasbaja;
			}
			
			else {
				
				nota=mayornota;
				
				contnotas++;

				media=nota/contnotas;	
			}
				
			
			
			if (media<5) {
				
				System.out.println("Suspenso");
			}
			
			
			
			
		}
			
			
		
		
		sc.close();
		}
}
}



