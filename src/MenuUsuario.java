
import java.util.ArrayList;
import java.util.Scanner;

import ucs.pessoas.Aluno;
import ucs.pessoas.EmissorDePessoas;
import ucs.pessoas.Professor;
import ucs.turma.GerenciadorDeTurmas;

public class MenuUsuario {
	
	GerenciadorDeTurmas gerenciadorT = new GerenciadorDeTurmas();
	EmissorDePessoas emissor = new EmissorDePessoas();
	
	public void menuPrincipal()
	{
		Scanner entrada = new Scanner(System.in);
		this.escreveMenu();
		int opcao = entrada.nextInt();
		while(opcao!=5)
		{
			switch(opcao)
			{
			case 1:
				gerenciadorT.getTodasTurmasResumido();
				break;
			case 2:

				System.out.println("Digite o código da disciplina:");
				int codigo = entrada.nextInt();
				System.out.println("Digite a disciplina da turma:");
				String disciplina = entrada.next();
				
				System.out.println("Digite o código do curso da turma: \n"
						+ "1: Ciência da Computação; \n  "
						+ "2: Sistemas de Informação; \n "
						+ "3: Engenharia de Computação;\n "
						+ "4: Análise e Desenvolvimento de Sistemas. \n");
				int cursoTurma = entrada.nextInt();
				
				Professor professor = emissor.emitirProfessor();
				
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				alunos = emissor.emitirAlunos();
					
				gerenciadorT.insereTurma(professor, codigo, cursoTurma, alunos, disciplina);
				
				break;
			case 3:
				
				System.out.println("Digite o código da turma que deseja consultar:");
				int codigoTurma = entrada.nextInt();
				gerenciadorT.getDadosTurma(codigoTurma);
				
				break;
			case 4:

				gerenciadorT.getTodasTurmasCompleto();
				
				break;
			}
			this.escreveMenu();
			opcao = entrada.nextInt();
			
			if(opcao == 5) {
				System.out.println("Deseja realmente sair do programa? S/N");
				String escolha = entrada.next().toUpperCase();
				if(escolha.equals("N")) {
					opcao = 0;
				}
			}
		}
		
		entrada.close();
	}
	
	public void escreveMenu() {
		System.out.println("1) Listar todas as turmas");
		System.out.println("2) Informar dados de uma turma");
		System.out.println("3) Consultar os dados de uma turma");
		System.out.println("4) Consultar estatísticas gerais");
		System.out.println("5) Sair do sistema");
	}
}
