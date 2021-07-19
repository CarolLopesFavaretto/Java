package Aplicacao;

import Class.Aluno;
import Class.Pessoa;
import Class.Professor;

public class AplicCadastro {

	public static void main(String[] args) {
		
		
		Pessoa aluno1 = new Aluno ();
		Pessoa prof = new Professor();
		
		
		aluno1.setNome("Carol");
		prof.setNome("Luiz");
		aluno1.setEndereco("Rua 1, num 1");
		
		System.out.println(aluno1.obterEtiquetaEndereco());
		aluno1.imprimirEtiquetaEndereco();

	}

}
