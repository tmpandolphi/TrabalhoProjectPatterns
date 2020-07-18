package ucs.pessoas.factories;
import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;

public interface PessoasFactory {
	
	public Aluno criaAluno(int idAluno, String nomeAluno, String emailAluno, int curso, float[] notas);
	
	public Professor criaProfessor(int id, String nome, String email, String formacao);
}
