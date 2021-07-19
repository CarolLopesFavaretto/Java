package Aplicacao;

import java.util.Scanner;

import Classes.Alunos;

public class AplicAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Alunos aluno = new Alunos();
		aluno.disciplina = new String[3];
		aluno.notas = new double [3][4];
		
		System.out.println("Nome do aluno: ");
		aluno.nome = leia.next();
		System.out.println("Idade do aluno: ");
		aluno.idade = leia.nextInt();
		System.out.println("Matricula :");
		aluno.matricula = leia.next();
		System.out.println("Nome do curso :");
		aluno.curso = leia.next();
		
		
		for (int i=0; i<aluno.disciplina.length; i++) {
			System.out.println("Nome da Disciplina: "+i);
			aluno.disciplina[i] = leia.next();
		}
		
		for(int i=0; i<aluno.notas.length; i++) {
			System.out.println("Obtendo nota da disciplina "+ aluno.disciplina[i]);
			for(int j=0; j<aluno.notas[i].length; j++) {
				System.out.println("Nota "+ (j+1));	
				aluno.notas[i][j] = leia.nextDouble();
			}
		}
		aluno.mostrarInfo();
		
		for(int i=0; i< aluno.disciplina.length; i++) {
			if(aluno.alunoAprovado(i)) {
				System.out.println("Disciplina " +aluno.disciplina[i] + " Foi aprovado");
			}
			else {
				System.out.println("Disciplina " +aluno.disciplina[i] + " Reprovado");
			}
		}
		
	}

}
