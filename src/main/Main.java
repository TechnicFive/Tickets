package main;

import operaciones.OpBasicas;

import java.net.URL;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import operaciones.Comprar;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("log4j.properties");
		System.out.println(url);
    	PropertyConfigurator.configure(url);
		logger.info("Ha iniciado el programa");
		
		OpBasicas inicio = new OpBasicas();

		inicio.inicio();
		
		Comprar comprar = new Comprar();
		

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);
		
		logger.info("Se ha hecho la primera compra aleatoria de billetes");
		
		

		inicio.limpiar();

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);
		
		
		logger.error("Recuerde que los numeros de columana empiezan a contar en 0 hasta " +inicio.getFila());
		logger.error("Recuerde que los numeros de columana empiezan a contar en 0 hasta " +inicio.getColumn());
		comprar.comprarNominal(OpBasicas.vagon);
		
		

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);
		
		logger.info("Se han hecho todas las compras");
		
	}
	private static Logger logger = LogManager.getLogger(Main.class);

}

