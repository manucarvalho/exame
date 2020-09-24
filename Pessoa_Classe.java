package exame;

public class Pessoa_Classe {

	private int idPessoa;
	private String nome;
	private String diabetes;
	
	public Pessoa_Classe() {
		
	}
	
	public Pessoa_Classe(int idPessoa, String nome) {
		this.idPessoa = idPessoa;
		this.nome = nome;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(Exame1_Classe exame) {
		this.diabetes = exame.obterDiagnostico();
	}
	
	public String toString() {
		return "id da pessoa: " 
				+ idPessoa
				+ ", nome: "
				+ nome
				+ ", diabetes: "
				+ diabetes;
	}
	
	
		
}
