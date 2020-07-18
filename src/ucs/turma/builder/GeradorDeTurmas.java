package ucs.turma.builder;
import java.util.ArrayList;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;
import ucs.turma.Turma;

public class GeradorDeTurmas {
	
	TurmaBuilder construtor;
	
	public GeradorDeTurmas(TurmaBuilder construtor) {
		this.construtor = construtor;
	}
	
	public void geraTurma(Professor professor, int codigo, int curso, ArrayList<Aluno> alunos, String disciplina) {
		construtor.buildAlunos(alunos);
		construtor.buildCodigo(codigo);
		construtor.buildDisciplina(disciplina);
		construtor.buildProfessor(professor);
	}
	
	public Turma getTurma() {
		return this.construtor.getTurma();
		
	}
}
