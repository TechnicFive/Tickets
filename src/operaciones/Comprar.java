package operaciones;

import java.util.Scanner;

public class Comprar {

	
	Scanner sc = new Scanner(System.in);
	
	
	// Comprar billete con asiento asignado por defecto
	public void comprarAleatorio(char[][] vagon) {


		OpBasicas obj = new OpBasicas();

		int fila = 0;
		int columna = 0; 

		for (int i = 0; i < vagon.length; i++) {
			for (int j = 0; j < vagon[i].length; j++) {
				if (vagon[i][j] == 'L') {
					fila = i;
					columna = j;						
				}
			}
		}

		// Comprobar si el vagon esta lleno, por que para vagon[0][0] el codigo no funcionaria
		if (fila == 0 && columna == 0 && vagon[0][0] == 'C') {
			System.out.println("El vagon esta lleno");
		} else {vagon[fila][columna] = 'C';}

		System.out.println("El vagon:");
		
		obj.pintar(vagon);

	}


	// Comprar billete con asiento especifico
	public void comprarNominal (char[][] vagon) {

		OpBasicas obj = new OpBasicas();
		
		int fila; 
		int columna;


		System.out.println("El vagon: ");
		System.out.println();
		
		obj.pintar(vagon);

		do { // Do-while para volver a introducir nº de asiento en caso de estar reservado

			System.out.println("Que fila desea?");
			fila = sc.nextInt();


			System.out.println("Que columna desea?");
			columna = sc.nextInt(); 


			if (vagon[fila][columna] == 'C') { // comprobar asiento esta libre
				System.out.println("El asiento esta ocupado! Elige otro");
			}

			System.out.println();
			
		} while (vagon[fila][columna] == 'C');

		vagon[fila][columna] = 'C'; // Cambiar asiento de 'L' Libre a 'C' Comprado

		obj.pintar(vagon);

	}
}
