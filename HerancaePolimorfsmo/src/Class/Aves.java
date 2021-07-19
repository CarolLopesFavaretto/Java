package Class;

public class Aves extends Animal{
	
	private String voar ;
	
	

	public Aves(String nome, String emitirSom, String voar) {
		super(nome, emitirSom);
		this.voar = voar;
		
	}

	@Override
	public String emitirSom() {
		return null;
	}
	
	

}
