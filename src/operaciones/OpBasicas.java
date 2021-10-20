package operaciones;

import java.util.Scanner;

public class OpBasicas {

	// Puedo crear mas vagones para el tren
	public static char[][] vagon; 

	Scanner sc = new Scanner(System.in);

	int fila;
	int column;

	// Tipo de vagon: columnas x filas
	public char[][] tamanoVagon() {

		System.out.println("¿Cuantas filas?");
		fila = sc.nextInt();

		System.out.println("¿Cuantos asientos habra en cada fila?");
		column = sc.nextInt();

		vagon = new char [fila][column];

		return vagon;
	}

	// Mostrar el vagon 
	public void pintar (char[][] vagon) {

		for (int i = 0; i < vagon.length; i++) {
			for (int j = 0; j < vagon[i].length; j++) {
				System.out.print(vagon [i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("----------");
	}

	// Iniciar el vagon para las reservas, incluyendo el tamaño y la muestra por pantalla
	public void inicio() {

		tamanoVagon();

		for (int i = 0; i < vagon.length; i++) {
			for (int j = 0; j < vagon[i].length; j++) {
				vagon[i][j] = 'L';
			}
		}	
		pintar(vagon);

		System.out.println();
	}
	
	// Una vez el viaje concluya podemos utilizar limpiar() para reutilizar la variable estatica vagon
	public void limpiar() {
		
		for (int i = 0; i < vagon.length; i++) {
			for (int j = 0; j < vagon[i].length; j++) {
				vagon[i][j] = 'L';
			}
		}	

		pintar(vagon);

		System.out.println();
	}

	

}
