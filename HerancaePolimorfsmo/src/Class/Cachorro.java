package Class;

public class Cachorro extends Mamiferos{

	private String tamanho;
	private String raca;
	
	public Cachorro(String nome, String emitirSom, String amamenta, String tamanho, String raca) {
		super(nome, emitirSom, amamenta);
		this.tamanho = tamanho;
		this.raca = raca;
		
		
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
