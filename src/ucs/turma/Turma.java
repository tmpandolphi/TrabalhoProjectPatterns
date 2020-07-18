package ucs.turma;
import java.util.ArrayList;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;

public class Turma implements ModeloTurma{
	
	int codigo;
	int curso;
	Professor professor = null;
	String disciplina;
	ArrayList<Aluno> alunos = null;
	
	@Override
	public void setProfessor(Professor professor) {
		this.professor = professor;
		
	}

	@Override
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	@Override
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
		
	}

	@Override
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public void escreveDadosCompleto() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("Professor: " + this.professor.getNome());
		for(int i = 0 ; i < alunos.size() ; i++) {
			System.out.println("Aluno " + alunos.get(i).getNome());
			alunos.get(i).getNotas();
			System.out.println("Media " + alunos.get(i).getMedia());
			System.out.println("Situação " + alunos.get(i).getConceito() + ".\n");
		}
	}
	
	public void escreveDadosResumido() {
			System.out.println("Código: " + this.codigo);
			System.out.println("Disciplina: " + this.disciplina);
			System.out.println("Professor: " + this.professor.getNome());
			System.out.println("Numero de alunos na turma: " + this.alunos.size());
	}

	public int escreveDadosTodasTurmas() {
		int aprovados = 0;
		System.out.println("Código: " + this.codigo);
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("Professor: " + this.professor.getNome());
		System.out.println("Numero de alunos na turma: " + this.alunos.size());
		for(int i = 0 ; i < alunos.size() ; i++) {
			aprovados += alunos.get(i).getConceitoInt();
		}
		
		float percentual = aprovados * 100;
		percentual /= alunos.size();
		
		System.out.println("Percentual de aprovação na turma " + percentual + ".\n");
		
		return aprovados;
	}
}
