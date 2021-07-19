package Programas;

import Objeto.Carro;

public class progcarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println("A autonomia do carro é: " +van.obterAutonomia() + "Km"); // metodo com return;
		van.exibirAutonomia(); // metodo sem return
		
		System.out.println("A autonomia do carro é: " +van.calcularCombustivel(15) + "Km"); 
		// metodo com return e declaração de parametro;
		
	}

}
