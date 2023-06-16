package basicosprofe;

public class Ejercicio1 {

	public static void main (String[] args) {
	        String cadena = "Hola, Mundo!";
	        char caracter = 'j';
	        
	        if (perteneceACadena(cadena, caracter)) {
	            System.out.println("El carácter '" + caracter + "' pertenece a la cadena.");
	        } else {
	            System.out.println("El carácter '" + caracter + "' no pertenece a la cadena.");
	        }
	        
	}


	public static boolean perteneceACadena(String cadena, char caracter) {
		// Recorrer la cadena carácter por carácter
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				// El carácter pertenece a la cadena
				return true;
			}
		}

		// El carácter no pertenece a la cadena
		return false;

	}
}
