package main;

import operaciones.OpBasicas;
import operaciones.Comprar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		OpBasicas inicio = new OpBasicas();

		inicio.inicio();

		Comprar comprar = new Comprar();

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		inicio.limpiar();

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarNominal(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);
		
	}

}
