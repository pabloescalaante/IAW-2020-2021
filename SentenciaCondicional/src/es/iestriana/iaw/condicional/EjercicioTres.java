package es.iestriana.iaw.condicional;

import java.util.Scanner;

/*
 * Build a program that calculates the body mass index of a person (IMC = weight [kg] / height2 [m]) and indicates 
 * the state in which that person is based on the value of IMC: 
 * MC value Diagnosis <16 Hospital admission criteria 
 * from 16 to 17 underweight 
 * 17 to 18 underweight 
 * 18 to 25 normal weight (healthy) 
 * 25 to 30 overweight (grade I obesity) 
 * 30 to 35 chronically overweight (obesity grade II) 
 * 35 to 40 premorbid obesity (grade III obesity)
 * > 40 morbid obesity (grade IV obesity) 
 * Note 1: The use of nested if – else statements is recommended. 
 * Note 2: The operands (weight and height) must be entered by keyboard by the user. 
 */

public class EjercicioTres {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce tu peso (kg):");
		double peso = sc.nextDouble();
		
		System.out.println("Introduce tu altura (m):");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		if (imc < 16 ) {
			System.out.println("Ir al hospital");
		}else if (imc >= 16 && imc < 18) {
			System.out.println("under weight");
		}else if ( imc >= 18 && imc < 25 ) {
			System.out.println("normal weight");
		}else if (imc >= 25 && imc <30) {
			System.out.println("grade I obesity");
		}else if (imc >=30 && imc <35) {
			System.out.println("obesity grade II");
		}else if (imc >= 35 && imc <40) {
			System.out.println("grade obesity III");
		}else{
			System.out.println("grade IV obesity");
		}
		sc.close();
	}

}
