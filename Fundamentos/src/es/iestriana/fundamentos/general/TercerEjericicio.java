package es.iestriana.fundamentos.general; 

import java.util.Scanner;

public class TercerEjericicio {
	
	/*
	 * Pedir un numero de segundos y que devulva el numero de horas,  minutos y segundos que lo forman
	 */

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca segundos:");
		int segundosintroducidos = sc.nextInt();
		
		int horas = segundosintroducidos / 3600; // 1 hora = 3600 segundos
		int minutos = (segundosintroducidos - horas*3600) / 60;
		int segundos = segundosintroducidos - (horas*3600) - (minutos*60);
		System.out.println("Horas:"+
							horas+
							" "+
							"Minutos:"+
							minutos+
							" "+
							"Segundos:"+
							segundos);
		sc.close(); //esto lo ponemos para cerrar la comunicacion con el scaner

	}

}
