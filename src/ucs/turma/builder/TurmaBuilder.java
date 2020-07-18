package ucs.turma.builder;
import java.util.ArrayList;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;
import ucs.turma.Turma;

public interface TurmaBuilder {
	public void buildCodigo(int codigo);
	
	public void buildDisciplina(String disciplina);
	
	public void buildAlunos(ArrayList<Aluno> alunos);

	public void buildProfessor(Professor professor);
	
	public Turma getTurma();
}
