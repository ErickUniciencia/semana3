package ejercicios;


public class ejer02 {
		
	public void negativos(int x, int y) {
		if (x < 0 && y < 0) {
			System.out.println( "Los dos son negativos." );
		}
		
		if (x > 0 && y < 0) {
			System.out.println( "a es positivo, b es negativo." );
		}
		
		if (x < 0 && y > 0) {
			System.out.println( "a es negativo, b es positivo." );
		}
		
		if (x > 0 && y > 0) {
			System.out.println( "Los dos son positivos." );
		}
		
		System.exit(0);
	}
}
