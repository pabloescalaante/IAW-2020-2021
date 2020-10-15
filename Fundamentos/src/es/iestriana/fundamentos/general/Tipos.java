package es.iestriana.fundamentos.general;

public class Tipos {
	
	public static void main(String[] args) {
		
		System.out.println("hola mundo"); //si pones syso mas ctrl+space te sale solo 
		
		//Comentario de una linea
		
		/*
		 * Comentario de varias lineas (solo con darle intro se completa)
		 */
		
		//Tipos de variables
		//Entero (valor por defecto es 0)
		byte b; //8 bits
		short s; //16 bits
		int i; //32 bits
		long l; //64 bits
		
		char ch; //es el caracter (aunque tambien podemos poner su representacion en ascii y funciona)
			//ejemplo
				char c = 111; // tambien se puede hacer en lineas separadas como c = 111;
				System.out.println(c);
				//ahora hacemos un casting y sabremos que codigo ascii es el caracter
				char a = 'o';
				System.out.println((int)a);
		
		//Reales, decimales (valor por defecto 0.0)
		float f; //32 bits
		double d; //64 bits
			//ejemplo
				f = 3.1416F; // la F al final hay que ponerla ya que por defecto se trata como un double a cualquier decimal
				d = 3.1416; //como vemos aqui lo coge perfectamente 
				System.out.println(Math.PI); //el numero pi se encuentra en la libreria Math junto a otras cosa
		
		//Logicos
		boolean bol = true; //por defecto es false
		
		//Cadenas
		String cad = "cadenas";
		String cad2 = "segunda cadena";
		System.out.println(cad + " " + cad2); //con los + concatenamos lo que queramos
		
		//Complejos (con esto podemos hacer operaciones ya que los otros solo almacenan)
		Integer ii; //si pongo el nombre de la variable y luego un punto salen las operaciones
		Byte by;
		Short ss;
		Long ll;
		Boolean bb;
		Character cc;
			//ejemplo voy a sacar la primera palabra de cad2
				System.out.println(cad2.substring(0, 7)); //los numeros son las posiciones
		
		
	}

}
