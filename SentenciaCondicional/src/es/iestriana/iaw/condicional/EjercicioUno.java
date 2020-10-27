package es.iestriana.iaw.condicional;

import java.util.Scanner;

	/*
	 * Enter a grade from 0 to 10 and display it in the form: insufficient, sufficient, good ..
	 */

public class EjercicioUno { // ctrl + shif +  f organiza el codigo

	private static Scanner sc = new Scanner(System.in); // para mas rapido scan + ctlr + space luego ctl + shift + o
														// mete el import

	public static void main(String[] args) {

		System.out.println("Introduzca una calificacion (1 al 10):");
		double nota = sc.nextDouble();

		if (nota >= 0 && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 8) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Nota incorrecta");
		}

		// vamos a hacerlo con switch (sw + ctlr+space)

		switch ((int) nota) { // tengo que hacer un casting pq no se pude tipo double y trunca los decimales
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break; // si sale sirve para salir y que no compruebe mas
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota incorrecta");
			break;
		}
		sc.close();
	}

}
