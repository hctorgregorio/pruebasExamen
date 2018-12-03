package examen;

import java.util.Random;

import modelo.Libro;

public class Metodos {

	// ejercicio 1
	// public char metodo1 (int numero)

	// ejercicio 2
	// public char metodo2 (int numero)

	// ejercicio 3
	// public char metodo3 (int numero)

	public char metodo1(int numero) {
		char[] letrasValidas = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		Integer num = new Integer(numero);
		if (num.toString().length() != 8)
			return '1';
		int resto = numero % 23;
		return letrasValidas[resto];
	}

	public Libro[] metodo2(String[] libros) {
		Libro[] resultado = new Libro[libros.length];
		for (int i = 0; i < resultado.length; i++) {
			try {
				String[] libroCadena = libros[i].split("#");
				Libro libro = new Libro();
				libro.setId(Integer.parseInt(libroCadena[0]));
				libro.setNombre(libroCadena[1]);
				libro.setPrecio(Float.parseFloat(libroCadena[2]));
				resultado[i]=libro;
			} catch (NumberFormatException e) {
				
			}
		}

		return resultado;

	}
	public int[][] metodo3(int jugadores, int partidas){
		int[][] resultado = new int[jugadores][partidas];
		Random rnd = new Random();
		// la matriz hay que crearla poniendo los valores por columnas
		for (int j = 0; j < partidas; j++) {
			for (int i = 0; i < resultado.length; i++) {
				resultado[i][j]=1 + rnd.nextInt(6);
			}
		}
		
		
		return resultado;
		
	}
}
