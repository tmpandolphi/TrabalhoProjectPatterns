package ucs.pessoas;

public class Aluno extends Pessoa{


	private int curso;
	private float[] notas;
		
	public Aluno(int id, String nome, String email, int curso, float[] notas) {
		super(id, nome, email);
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.setCurso(curso);
		this.notas = notas;
	}
	
	public void getNotas() {
		System.out.println("N1: "+ notas[0]+ " N2: " + notas[1] + " N3: " + notas[2]);
	}
	
	public void setNotas(float[] notas) {
		this.notas = notas;
	}

	public float getMedia() {
		return (notas[0]+notas[1]+notas[2])/3;
	}

	public String getConceito() {
		if(getMedia()>=6) {
			return "Aprovado";
		} else {
				return "Reprovado";
			}
	}
	
	public int getConceitoInt() {
		if(getMedia()>=6) {
			return 1;
		} else {
				return 0;
			}
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

}
