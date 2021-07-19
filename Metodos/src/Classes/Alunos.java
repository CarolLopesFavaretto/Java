package Classes;

public class Alunos {
	
	public String nome;
	public int idade;
	public String matricula; 
	public String curso;
	public String[] disciplina;
	public double [][] notas;
	
	
	public void mostrarInfo() {
		System.out.println("Nome " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Matricula " + matricula);
		System.out.println("Curso " + curso);
		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Notas da disciplina: " + disciplina[i]);
			for (int j=0; j<notas[i].length; j++) {
				System.out.println(notas[i][j] + " " );	
			}
		}
		System.out.println();
	}
		
		
		public boolean alunoAprovado (int indice){
			
			double soma=0;
			
			for(int i=0; i < notas [indice].length; i++) {
				soma=+ notas[indice][i];
				
			}
			double media = soma/4;
			
			if(media>= 7) {
				return true;
			}
			return false;
		}
		
		
			
		
	}

