package ucs.turma.builder;
import java.util.ArrayList;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;
import ucs.turma.Turma;

public class TurmaTI implements TurmaBuilder{
	
	private Turma turma;
	
	public TurmaTI() {
		this.turma = new Turma();
	}
	
	@Override
	public void buildCodigo(int codigo) {
		turma.setCodigo(codigo);	
	}

	@Override
	public void buildDisciplina(String disciplina) {
		turma.setDisciplina(disciplina);
	}

	@Override
	public void buildAlunos(ArrayList<Aluno> alunos) {
		turma.setAlunos(alunos);		
	}

	@Override
	public void buildProfessor(Professor professor) {
		turma.setProfessor(professor);
	}

	@Override
	public Turma getTurma() {
		return this.turma;
	}

}
