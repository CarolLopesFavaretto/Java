package Classes;

public class Lampada {

	public String modelo;
	public String tensao;
	public int potencia;
	public String cor;
	public String tipoLuz;
	public int garantiaMeses;
	public boolean tipoAbajur;
	public String tipos[];
	public boolean ligada;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void mostrarEstado() {
		if (ligada) {
			System.out.println(" A lampada esta ligada");

		} else {
			System.out.println(" A lampada esta desligada");
		}
	}

	public void mudarEstado() {
		if (ligada) {
			desligar();

		} else {
			ligar();
		}
	}
}
