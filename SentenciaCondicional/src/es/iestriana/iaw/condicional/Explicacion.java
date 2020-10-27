package es.iestriana.iaw.condicional;

import java.util.Scanner;

public class Explicacion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Nº 1:");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2:");
		int num2 = sc.nextInt();
		
		if (num1 == num2) { //== esto significa igual !=no igual  !cosa espara negar
			System.out.println(num1+ " " + "es igual" + " " + num2);
		}else {
			System.out.println(num1 + " " + "no es igual" + " " + num2);
		}
		
		//aqui con variables booleanas
		boolean condicion = num1 == num2;
		System.out.println(condicion);
		
		if (condicion) { 
			System.out.println(num1 + " es igual " + num2);
		}else {
			System.out.println(num1 + " no es igual " + num2);
		}
		
		//metemos mas si dentro del if 
		if (num1 > 0) {
			System.out.println(num1 + " " +" es positivo");
		}else if (num1 < 0 ) {
			System.out.println(num1 + " es negativo");
		}else {
			System.out.println(num1 + " es cero");
		}
		
		//if (num1 & num2 == 0) % para jugar con el resto de la division
			
		//comparacion de 3 numeros (no hay numeros iguales)
		System.out.println("Nº 3:");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) { // && = y || = o uno o otro
			if (num2 > num3) {
				System.out.println(num1 + ", " + num2 + ", " + num3);
			}else {
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		}else if (num2 > num1 && num2 > num3) {
			if (num1 > num3 ) {
				System.out.println(num2 + ", " + num1 + ", " + num3);
			}else {
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}	
		}else {
			if (num1 > num2) {
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}else {
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}
		}
		
		
		sc.close();
	}

}
