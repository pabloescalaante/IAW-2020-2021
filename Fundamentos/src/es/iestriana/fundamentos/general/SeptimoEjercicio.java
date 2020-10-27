package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class SeptimoEjercicio {

	/*Provide the average price of a product, calculated 
	 * from the price of the same in three different establishments. 
	 * The prices for the calculation are entered by the user
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca precio para la tienda 1:");
		double precio1 = sc.nextDouble();
		

		System.out.println("Introduzca precio para la tienda 2:");
		double precio2 = sc.nextDouble();
		

		System.out.println("Introduzca precio para la tienda 3:");
		double precio3 = sc.nextDouble();
		
		double mediaPrecios = (precio1 + precio2 + precio3) / 3;
		
		System.out.println("La media de los precios es:" + mediaPrecios);
		
		
		
		

	}

}
