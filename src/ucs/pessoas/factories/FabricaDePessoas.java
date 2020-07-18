package ucs.pessoas.factories;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;

public class FabricaDePessoas implements PessoasFactory{
	
	public Aluno criaAluno(int idAluno, String nomeAluno, String emailAluno, int curso, float[] notas) {
		Aluno aluno = new Aluno(curso, emailAluno, emailAluno, curso, notas);
		return aluno;
	}
	
	public Professor criaProfessor(int id, String nome, String email, String formacao) {
		Professor professor = new Professor(id, nome, email, formacao);
		return professor;
	}
	
}
