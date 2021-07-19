package Objeto;

public class Carro {

	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;
	
	public void exibirAutonomia() { // exemplo de metodo simples sem return;
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	
	public double obterAutonomia() { //exemplo de metodo simples com return;
		
		return capCombustivel *consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) { // exemplo de metodo simples com return e declarando parametro;
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
}
