package es.iestriana.iaw.condicional;

import java.util.Scanner;

/*
 * A worker needs to calculate his weekly salary based on the hours he works (requested data)
 * which is obtained in the following way: 
 * If you work 40 hours or less you are paid € 16 per hourIf 
 * you work more than 40 hours, you are paid € 16 for each of
 *  the first 40 hours and € 20 for each overtime.
 * 
 */

public class EjercicioFinde2 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca numero de horas trabajadas:");
		double numeroHoras = sc.nextDouble();

		if (numeroHoras <= 40) {
			System.out.println("Salario semanal sera:" + (numeroHoras * 16) * 7);
		} else {
			System.out.println("El salario semanal sera:" + ((40 * 16) + ((numeroHoras - 40) * 20)) * 7);

			// aclaracion el 40 representa las primeras 40 horas
		}

	}

}
