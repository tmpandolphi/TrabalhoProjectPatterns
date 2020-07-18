package ucs.turma;
import java.util.ArrayList;

import ucs.pessoas.Aluno;
import ucs.pessoas.Professor;

public interface ModeloTurma {
		public void setProfessor(Professor professor);
		
		public void setCurso(int curso);
		
		public void setCodigo(int codigo);
		
		public void setDisciplina(String disciplina);
		
		public void setAlunos(ArrayList<Aluno> alunos);
		
		public int getCodigo(); 
		
		public void escreveDadosCompleto();
		
		public void escreveDadosResumido();
		
}
