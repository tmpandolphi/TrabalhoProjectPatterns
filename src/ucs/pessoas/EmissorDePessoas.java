package ucs.pessoas;

import java.util.ArrayList;
import java.util.Scanner;

import ucs.pessoas.factories.FabricaDePessoas;
import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;

public class EmissorDePessoas {

	FabricaDePessoas pessoas = new FabricaDePessoas();
	Scanner entrada = new Scanner(System.in);
	
	public ArrayList<Aluno> emitirAlunos() {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			
		System.out.println("");
		String escolha = "S";
		while(escolha.equals("S")) {
			switch(escolha){
			case "S":
				int idAluno = alunos.size();
				System.out.println("Digite o nome do aluno:");
				String nomeAluno = entrada.next();
				System.out.println("Digite o email do aluno:");
				String emailAluno = entrada.next();
				System.out.println("Digite o código do curso do aluno:\n"
						+ "1: Ciência da Computação; \n 2: "
						+ "Sistemas de Informação; \n "
						+ "3: Engenharia de Computação;\n "
						+ "4: Análise e Desenvolvimento de Sistemas. \n");
				int curso = entrada.nextInt();
				float[] notas = {0, 0, 0};
				System.out.println("Digite os notas do aluno separado por enter:");
				notas[0] = entrada.nextFloat();
				notas[1] = entrada.nextFloat();
				notas[2] = entrada.nextFloat();
				alunos.add(pessoas.criaAluno(idAluno, nomeAluno, emailAluno, curso, notas));
			}
			System.out.println("Deseja entrar um novo aluno? S/N");
			escolha = entrada.next().toUpperCase();
			if(escolha.equals("S")) {
				if(alunos.size()==30) {
					System.out.println("Turma cheia, não é possível inserir mais alunos.\n");
					escolha = "N";
				}
			}
		}
		return alunos;
	}
	
	public Professor emitirProfessor() {
		System.out.println("Digite o código do professor:");
		int id = entrada.nextInt();
		System.out.println("Digite o nome do professor:");
		String nome = entrada.next();
		System.out.println("Digite o email do professor:");
		String email = entrada.next();
		System.out.println("Digite a formação do professor:");
		String formacao = entrada.next();
				
		return pessoas.criaProfessor(id, nome, email, formacao);
	}
	
}
