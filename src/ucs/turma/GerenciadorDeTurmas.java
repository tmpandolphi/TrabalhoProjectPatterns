package ucs.turma;
import java.util.ArrayList;
import java.util.LinkedList;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;
import ucs.turma.builder.GeradorDeTurmas;
import ucs.turma.builder.TurmaBuilder;
import ucs.turma.builder.TurmaTI;

public class GerenciadorDeTurmas {
	LinkedList<Turma> turmas = new LinkedList<Turma>();
	
	//insere nova turmas
	public void insereTurma(Professor professor, int codigo, int curso, ArrayList<Aluno> alunos, String disciplina){
		TurmaBuilder novaTurma = new TurmaTI();
		GeradorDeTurmas gerador = new GeradorDeTurmas(novaTurma);
		
		gerador.geraTurma(professor, codigo, curso, alunos, disciplina);
		
		turmas.add(gerador.getTurma());
	}
	
	//consulta os dados de uma turma
	public void getTodasTurmasResumido() {
		for(int i = 0 ; i < turmas.size() ; i++) {
			turmas.get(i).escreveDadosResumido();
		 }
	}
	
	public void getTodasTurmasCompleto() {
		int totalAlunos = 0;
		int totalAprovados = 0;
		for(int i = 0 ; i < turmas.size() ; i++) {
			totalAprovados += turmas.get(i).escreveDadosTodasTurmas();
			totalAlunos += turmas.get(i).alunos.size();
		 }
		
		float percentual = totalAprovados * 100;
		percentual /= totalAlunos;
		
		System.out.println("O total de alunos da instituição é " + totalAlunos + ".\n");
		System.out.println("O percentual de alunos aprovados é " + percentual + ".\n");
	}
	
	//informa os dados de uma turma
	public void getDadosTurma(int id) {
		for(int i = 0 ; i < turmas.size() ; i++) {
			if(turmas.get(i).getCodigo() == id) {
				turmas.get(i).escreveDadosCompleto();
			}
		 }
	}
}
