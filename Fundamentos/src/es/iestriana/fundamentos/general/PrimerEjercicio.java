package es.iestriana.fundamentos.general;

import java.util.Scanner; //la importamos de la biblioteca de Java para usarla debajo con teclado ctrl+shift+o

public class PrimerEjercicio {

	/*
	 * Vamos a hacer un ejercicio que haga la convercion de grados celsius a Fahrenheit. 
	 * Los grados Celsius los introduce el usuario
	 */
	
	//con esto importamos la clase scaner para introducir por teclado se pone aqui para que este para todas las clases
	private static Scanner sc = new Scanner(System.in); // de new para delante lo que hacemos es darle valor en el caso del new es para los objetos
	
	public static void main(String[] args) {
		System.out.println("Introduzca los grados Celsius: ");
		double gradosCelsius = sc.nextDouble(); //aqui declaramos la variable y la inicializamos
		double gradosFarhrenheit = (gradosCelsius * 1.8) + 32; //aqui obviamente hacemos el calculo
		System.out.println(gradosCelsius+
							" "+
							"grados Celsuis son"+
							" "+
							gradosFarhrenheit+
							" "+
							"grados Farhrenheti");
		
	}

}
