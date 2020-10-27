package es.iestriana.fundamentos.general;

import java.util.Scanner;

public class SextoEjercicio {

	//Write a program that prompts the user for the size of the side of an equilateral triangle and calculates its perimeter and area.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca cuanto vale el lado de un triangulo equilatero:");
		double ladoTriangulo = sc.nextDouble();
		double perimetro = ladoTriangulo * 3;
		double area = (ladoTriangulo * ladoTriangulo) / 2;
		System.out.println("El perimetro del triangulo sera:" + perimetro);
		System.out.println("El area del triangulo es:" + area);
		sc.close();
		
	}

}
