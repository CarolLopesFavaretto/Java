package Aplicacao;

import Classes.Contato;
import Classes.Endereco;
import Classes.Telefone;

public class AplicContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		Endereco end = new Endereco ();
		Telefone tel = new Telefone ();
		Telefone tel2 = new Telefone ();
		Telefone [] telefones = new Telefone [2];
		
		contato.setNome("Carol");
		
		tel.setTipo("Celular");
		tel.setDdd("11");
		tel.setNumero("999999999");
		
		tel2.setTipo("Casa");
		tel2.setDdd("11");
		tel2.setNumero("787878787");
		
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones);
		
		end.setNomeRua("Rua Dr Antonio Flavio Franca");
		end.setNumero("6");
		end.setCidade("Osasco");
		end.setEstado("São Paulo");
		end.setCep("06150010");
		
		contato.setEndereco(end);
		
		System.out.println(contato.getNome());
		
		// conceito de relacionamento tem-varios telefones
		if(contato != null && contato.getTelefones() != null) {
			for( Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + "-"+ t.getNumero());
			}
			
		}
		// conceito de relacionamento tem-um endereço
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		
	}

}
