package composite;

public class Estagiario {
	
	private String nome;
	private int idade;
	private String nomeCurso;
	private int codCadastro;
	
	public Estagiario(String nome, String nomeCurso, int idade, int codCadastro) {
		
		this.nome = nome;
		this.idade = idade;
		this.nomeCurso = nomeCurso;
		this.codCadastro = codCadastro;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public int getCodCadastro() {
		return codCadastro;
	}

	public void setCodCadastro(int codCadastro) {
		this.codCadastro = codCadastro;
	}

	
	
	
	
	
	
	

}
