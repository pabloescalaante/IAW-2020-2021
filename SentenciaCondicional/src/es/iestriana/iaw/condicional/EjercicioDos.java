package es.iestriana.iaw.condicional;

import java.util.Scanner;

/*
 * Ask the user for the day, month and year and check that the date is correct
 */

public class EjercicioDos {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca dia:");
		int dia = sc.nextInt();

		System.out.println("Intruduzca mes:");
		int mes = sc.nextInt();

		System.out.println("Introduzca anyo:");
		int anyo = sc.nextInt();

		boolean fechaCorrecta = false; //la inicializamos en falsa pq queremos nosotros

		// dentro del if ya vere si es correcta en el caso que no solo tengo que mostrar la variable anterior (ahorras casos)

		if (anyo >= 0) { // comprobamos que el año no sea negativo (queremos jugar con el cero)
			boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 != 0 ) || (anyo % 400 == 0)); //condiciones para saber si es bisiesto (tenemos dos)
			
			if (mes >=1 && mes <=12) { //comprobamos si el mes es correcto
				switch (mes) {
				case 2: //el primero es el de febrero con los casos de bisiesto y no bisiesto
					if (dia <=1 && dia <=29 && esBisiesto) {
						fechaCorrecta = true;
					}else if (dia <= 1 && dia <=28 && !esBisiesto) {
						fechaCorrecta =  true;
					}
					break;
				case 1: //aqui meses con 31 dias
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <=31) {
						fechaCorrecta = true;
					}
					break;
				default: //aqui meto los meses de 30 dias ya que al quedar solo esos los puedo meter por defecto
					if (dia >=1 && dia <=30) {
						fechaCorrecta = true;
					}
					break;
				}
			}
		}

		// aqui saco en pantalla si la fecha es correcta o no en caso de incorrecta no  entra en el if
		if (fechaCorrecta) {
			System.out.println("Fecha correcta:" + dia + "/" + mes + "/" + anyo);
		} else {
			System.out.println("Fecha Incorrecta:" + dia + "/" + mes + "/" + anyo);
		}
		sc.close();

	}

}
