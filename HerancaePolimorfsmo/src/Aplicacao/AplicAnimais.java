package Aplicacao;


import Class.Cachorro;
import Class.Gato;
import Class.Papagaio;

public class AplicAnimais {

	public static void main(String[] args) {
		
		Papagaio papagaio = new Papagaio("Jose", "fala", "sim");
		Cachorro cachorro = new Cachorro("Pipoca", "Late", "Sim", "Mediano", "Vira-lata");
		Gato gato = new Gato("Marie", "Mia", "Sim", "Persa");
		
		System.out.println("Qual som esta ave emite? " + papagaio.getEmiteSom());
		papagaio.setEmiteSom("conversa");
		System.out.println("Qual som esta ave emite? " + papagaio.getEmiteSom());
		
		System.out.println("O nome do meu cahorro é " + cachorro.getNome() + " e sua raça é " + cachorro.getRaca());
		
		System.out.println("Minha gata se chama " + gato.getNome() + " e é da raça " + gato.getRaca());
	}

}
