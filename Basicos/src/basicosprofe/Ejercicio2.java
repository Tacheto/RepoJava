package basicosprofe;

public class Ejercicio2 {
/* 2) HACER UN MÉTODO QUE RECIBA UNA
* CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA*/
	public static void main (String [] args) {
	
		public static int contarCaracteresEnCadena (String cadena, char letra) {
			
			int numeroveces = 0;
			int longitud = cadena.length();
			for (int i=0; i<longitud;i++) {
				
				if (cadena.charAt(i) == letra) {
					numeroveces = numeroveces + 1;
					
				}
			
			return numeroveces;

		}
			
	}
	 
	
		
		

}
	
	