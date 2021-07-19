package Class;

public abstract class Animal {
	
	private String nome;
	private String emiteSom;
	
	
	public Animal(String nome, String emitirSom) {
		super();
		this.nome = nome;
		this.emiteSom = emitirSom;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmiteSom() {
		return emiteSom;
	}


	public void setEmiteSom(String emitirSom) {
		this.emiteSom = emitirSom;
	}
	
	public abstract String emitirSom();
	
	
	
	
	
}
