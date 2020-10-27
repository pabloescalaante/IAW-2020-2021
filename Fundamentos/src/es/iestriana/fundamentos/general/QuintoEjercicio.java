package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class QuintoEjercicio {

	/*
	 * 7.Write a program that calculates how much your bank will give you after making a fixed-term tax.  
	 * For this, the program must ask for the amount you want to invest in the bank, the annual interest 
	 * rate that the bank pays you for the money and the term that the investment is maintained.  
	 * The program must calculate the money that is obtained after this period.  Remember that 
	 * when you pay the interest the bank will retain 18% for finance.
	 */
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduze la cantidad a invetir:");
		double cantidad = sc.nextDouble();
		
		System.out.println("Introduzca el interes anual del banco:");
		double interes = sc.nextDouble();
		
		System.out.println("Introduzca el tiempo a ser invertido");
		int plazo = sc.hashCode();
		
		double total = cantidad
						+((((cantidad * interes) / 100)
						-(((cantidad * interes) / 100) * 1.8))
						* plazo);
		
		System.out.println("Total:" + total);
		
		

	}

}
