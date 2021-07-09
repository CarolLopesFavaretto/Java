package Programas;

import Objeto.Lampada;

public class progrlampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		//testando os atributos definidos;
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.potencia = 7;
		lampada.garantiaMeses = 36;
		lampada.cor = "Branca";
		lampada.tipoLuz = "Branca";
		lampada.tipoAbajur = true;
		
		//testando atributos com vetores;
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampe�o";
		lampada.tipos[2] = "Led";
		lampada.tipos[3] = "Smart";
		
		System.out.println("Preciso comprar uma lampada com modelo "+ lampada.modelo + " que seja " + lampada.tensao);
	}

}
