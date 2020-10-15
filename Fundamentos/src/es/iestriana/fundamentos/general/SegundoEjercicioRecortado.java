package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class SegundoEjercicioRecortado {
	
	/*
	 * Ejercicio que defina 2 variables enteras 
	 * con la base y altura de un rectangulo
	 * Calcula su perimetro y area
	 */
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int base, altura;
		System.out.println("Introduzca la base:");
		base = sc.nextInt();
		System.out.println("Introduzca la alura:");
		altura = sc.nextInt();
		System.out.println("El area es:"+ (base + altura));
		System.out.println("El perimetro es:" + 2 * (base + altura));

	}

}
