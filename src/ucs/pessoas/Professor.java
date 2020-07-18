package ucs.pessoas;

public class Professor extends Pessoa{
	
	private String formacao;
	
	public Professor(int id, String nome, String email, String formacao) {
		super(id, nome, email);
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

}
