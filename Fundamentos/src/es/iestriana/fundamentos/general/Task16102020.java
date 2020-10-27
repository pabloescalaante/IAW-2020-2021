package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class Task16102020 {

	/*
	 * The user must enter the price of a product (it can be with decimals). 
	 * The price of the product must be shown applying a previously stored VAT with a value of 21%, 18% and 9%.
	 */
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca el precio del producto:");
		double precio = sc.nextDouble();
		
		double precioFinal1 = precio + ((precio * 21) / 100) ;
		double precioFianl2 = precio + ((precio * 18) / 100);
		double precioFinal3 = precio + ((precio * 9) / 100);
		
		System.out.println("El precio total (aplicando el 21%) es:" + 
							precioFinal1 + 
							" " +
							"El precio total (aplicando el 18%) es:"+
							precioFianl2 +
							" " +
							"El precio total (aplicando el 9%) es:" + 
							precioFinal3);
		sc.close();

	}

}
