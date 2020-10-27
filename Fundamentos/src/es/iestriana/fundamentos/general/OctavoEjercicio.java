package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class OctavoEjercicio {
	
	/*
	 * Create a program that asks the user for the radius of a 
	 * sphere and displays the volume of the sphere on the screen.  
	 * If you don't know the calculation formula, 
	 * find information about it on the internet.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Intruduzca el radio de la esfera:");
		double radio = sc.nextDouble();
		
		double volumen =(4 * Math.PI * Math.pow(radio, 3) / 3);
		System.out.println("El volumen de la esfera es:" + volumen);
		
		sc.close();
		

	}

}
