package es.iestriana.iaw.condicional;

import java.util.Scanner;

/*
 * 1. You are asked to read a positive whole number and determine if it is a 1,2,3 or 4-digit number.
 */

public class EjercicioFinde1 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un numero positivo:");
		int numeroIntroducido = sc.nextInt();

		if (numeroIntroducido >= 0 && numeroIntroducido < 10) {
			System.out.println("Tiene un digito");
		} else if (numeroIntroducido >= 10 && numeroIntroducido < 100) {
			System.out.println("Tiene dos digitos");
		} else if (numeroIntroducido >= 100 && numeroIntroducido < 1000) {
			System.out.println("Tiene 3 digitos");
		} else if (numeroIntroducido >= 100 && numeroIntroducido < 10000) {
			System.out.println("El numero tiene 4 digitos");
		} else {
			System.out.println("No podemos contar sus digitos");
		}

		sc.close();

	}

}
