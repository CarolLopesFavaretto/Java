package Programas;

import Objeto.Livros;

public class progrlivros {

	public static void main(String[] args) {
		Livros livros = new Livros();
		
		livros.nome = "O poder do h�bito";
		livros.autor = "Charles Duhigg";
		livros.anoLancamento = 2012;
		livros.qtdPaginas = 562;
		livros.codigo= 5622012;
		livros.capaDura = false;
		livros.digital = true;
		
		
		System.out.println("Estou pesquisando para comprar o livro " + livros.nome + " do autor " + livros.autor +" lan�ado em " + livros.anoLancamento);
		

	}

}
