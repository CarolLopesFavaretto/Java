package Class;

public class Gato extends Mamiferos{
	
	private String raca;
	
	public Gato(String nome, String emitirSom, String amamenta, String raca) {
		super(nome, emitirSom, amamenta);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
