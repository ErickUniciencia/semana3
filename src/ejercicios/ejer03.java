package ejercicios;


public class ejer03 {
	public void numerotexto(int x) {
		
		switch (x) {
		case 1: {		
			System.out.println( "Uno" );
			break;
		}
		case 2: {		
			System.out.println( "Dos" );
			break;
		}
		case 3: {		
			System.out.println( "Tres" );
			break;
		}
		case 4: {		
			System.out.println( "Cuatro" );
			break;
		}
		case 5: {		
			System.out.println( "Cinco" );
			break;
		}
		default:
			System.out.println( "Numero incorrecto" );
			break;			
		}
		System.exit(0);
		
	}
}
