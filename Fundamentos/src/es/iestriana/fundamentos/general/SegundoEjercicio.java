package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class SegundoEjercicio {
	
	/*
	 * Ejercicio que defina 2 variables enteras 
	 * con la base y altura de un rectangulo
	 * Calcula su perimetro y area
	 */
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca la base:");
		int base = sc.nextInt();
		System.out.println("Introduzca la alura:");
		int altura = sc.nextInt();
		int area = (base + altura);
		int perimetro = (2 * (base + altura));
		System.out.println("El area es:"+ area+" "+"y"+" "+ "el perimetro es:"+perimetro);

	}

}
