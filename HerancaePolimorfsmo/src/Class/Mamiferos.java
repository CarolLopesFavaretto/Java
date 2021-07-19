package Class;

public class Mamiferos extends Animal {
	
	private String amamenta;

	
	public Mamiferos(String nome, String emitirSom, String amamenta) {
		super(nome, emitirSom);
		this.amamenta = amamenta;
	}

	@Override
	public String emitirSom() {
		return null;
		
	}
}
