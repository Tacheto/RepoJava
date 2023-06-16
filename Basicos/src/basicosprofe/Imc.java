package basicosprofe;

import java.util.Scanner;

public class Imc {
	/**
	 * 
	 * /** TODO HACED UNA APLICACIÓN QUE PERMITA INTRODUCIR AL USUARIO SU ESTATURA
	 * EN METROS Y SU PESO EN KG Y LE INFORME SU INFORME DE SU ÍNDICE DE MASA
	 * CORPORAL (IMC) SEGÚN LA SIGUIENTE FÓRMULA
	 * 
	 * LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS * SI IMC < 16 ->>
	 * su imc es DESNUTRIDO SI IMC >= 16 Y < 18 ->> su imc es DELGADO SI IMC >= 18 Y
	 * < 25 ->> su imc es IDEAL SI IMC >= 25 Y < 31 ->> su imc es SOBREPESO SI IMC
	 * >= 31 ->> su imc es OBESO ADEMÁS, DE DECIRLE SU IMC NUMÉRICO Y NOMINAL,
	 * pista: PARA LEER DE TECLADO USAD LA CLASE SCANNER
	 */

	/**
	 * 
	 * @return el peso introducido por el usuario
	 */
	public static float pedirPesoyAltura() {
		float pesousuario = 0;
		float alturausuario = 0;
		float resultadoimc = 0;

		Scanner scanner = new Scanner(System.in);// leer teclado
		// 2. PEDIR DATOS
		System.out.println("Dime tu Peso");
		pesousuario = scanner.nextFloat();
		System.out.println("Dime tu Altura");
		alturausuario = scanner.nextFloat();
		// 3. CALCULAR IMC
		resultadoimc = (float) (pesousuario / Math.pow(alturausuario, 2));

		return resultadoimc;

	}

	public static void main(String[] args) {
		//
		float imc = pedirPesoyAltura();
		System.out.println("Muestro Indice de Masa Corporal = " + imc);

		// 4. MOSTRAR
		if (imc < 16) {
			System.out.println("Desnutrido");

		} else if (imc >= 18 && imc < 25) {
			System.out.println("Delgado");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Delgado");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Delgado");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Delgado");

	}

}
