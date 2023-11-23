package examen2;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		boolean condicion = false;
		while (condicion == false) {
			System.out.println("Introduzca un numero entero de 4 cifras");
			int numeroPedido = sc.nextInt(), unidad, decena, centena, millar, operacionUD, operacionCM,
					numeroRepetir = 0;
			unidad = numeroPedido % 10;
			numeroPedido = numeroPedido / 10;
			System.out.println(unidad);
			decena = numeroPedido % 10;
			numeroPedido = numeroPedido / 10;
			System.out.println(decena);
			centena = numeroPedido % 10;
			numeroPedido = numeroPedido / 10;
			System.out.println(centena);
			millar = numeroPedido % 10;
			numeroPedido = numeroPedido / 10;
			System.out.println(millar);

			operacionUD = unidad * decena;
			operacionCM = centena * millar;
			System.out.println("El producto de unidades y decenas es :" + operacionUD);
			System.out.println("El producto de centenas y millares es : " + operacionCM);

			if (operacionUD > operacionCM) {
				System.out.println("El producto de unidades y decenas es mayor que el de centenas y millares");
			} else if (operacionUD < operacionCM) {
				System.out.println("El producto de centenas y millares es mayor que el de unidades y decenas");
			} else {
				System.out.println("Los productos son iguales");
			}
			System.out.println("Introduzca 1 si quiere introducir otro numero, si no pulsa otro numero");
			numeroRepetir = sc.nextInt();
			if (numeroRepetir == 1) {
				condicion = false;
			} else {
				condicion = true;
				System.out.println("Ha ingresado un numero distinto de uno el programa se cerrara, gracias.");
			}

		}
		sc.close();
	}

}