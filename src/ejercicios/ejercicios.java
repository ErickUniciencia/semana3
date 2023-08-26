package ejercicios;

import java.util.Scanner;

public class ejercicios {
	private static Scanner s;

	public static void main(String[] args) {
		int ejer;
		int x = 0;	
		int y = 0;			
		
		s = new Scanner( System.in );
		System.out.println( "ejercicios propuestos: \n 1. ejercicio 1 \n 2. ejercicio 2 \n 3. ejercicio 3" );
		System.out.println( "Ingrese el numero del ejercicio que desea realizar: " );
		ejer = s.nextInt();
		
		if (ejer != 3) {
			System.out.println( "Ingrese el primer numero: " );
			x = s.nextInt();
			
			System.out.println( "Ingrese el segundo numero: " );
			y = s.nextInt();
		}else {
			System.out.println( "Ingrese un numero: " );
			x = s.nextInt();
		}
		
		switch (ejer) {
		case 1: {			
			
			ejer01 ejer01 = new ejer01();
			ejer01.comparar(x, y);

		}
		case 2: {				
					
			ejer02 ejer02 = new ejer02();
			ejer02.negativos(x, y);
		
		}
		case 3: {			
			
			ejer03 ejer03 = new ejer03();
			ejer03.numerotexto(x);
		
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ejer);
		}
		
	}
}
