package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class NovenoEjercicio {

	/*
	 * Declare two numeric variables (with the value you want), 
	 * display by console the addition, subtraction, 
	 * multiplication, division and modulus (remainder of division).
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = 10;
		int b =2;
		
		int suma = a + b;
		int resta = a - b;
		int multiplicacion = a * b;
		int division = a / b;
		int resto = a % b; //esto es para sacar el resto (solo vale para enteros)
		
		System.out.println("la suma es:"+
							suma +
							" "+
							"La resta es:"+
							resta+
							" "+
							"La multiplacion es:"+
							multiplicacion+
							" "+
							"La division es:"+
							division+
							" "+
							"El resto es:"+
							resto);


	}

}
