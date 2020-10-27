package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class CuertoEjercicio {
	
	//Ejercicio para calcular la longitud y el area de una circurferencia, pidiendo el radio
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca el radio:");
		double radio = sc.nextDouble();
		
		System.out.println("Su area es: " + Math.PI * Math.pow(radio, 2)); //el Math.pow es para exponente 
		System.out.println("La longitud es:" + 2 * Math.PI * radio);
		sc.close();


	}

}
