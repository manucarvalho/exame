package exame;

public class Exame1_Classe {
	
	static private int identificador;

	private int idExame;
	private String tipoExame;
	private int nivelGlicose;
	private int idPessoa;
	
	public Exame1_Classe() {
		
	}
	
	public Exame1_Classe(String tipoExame, int nivelGlicose, Pessoa_Classe pessoa) {
		super();
		this.idExame = Identificador();
		this.tipoExame = tipoExame;
		this.nivelGlicose = nivelGlicose;
		this.idPessoa = pessoa.getIdPessoa();
	}	
	
	private int Identificador() {
		return ++identificador;
	}	
	
	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public int getNivelGlicose() {
		return nivelGlicose;
	}

	public void setNivelGlicose(int nivelGlicose) {
		this.nivelGlicose = nivelGlicose;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public String obterDiagnostico() {
		String diagnostico;
		if (nivelGlicose <= 99) {
			diagnostico = "Normal";
		} else if (nivelGlicose <= 125) {
			diagnostico = "Pré-diabetes";
		} else {
			diagnostico = "Diabetes";
		}		
		return diagnostico;
	}
	
	public String toString() {
		return "id do exame: " 
				+ idExame
				+ ", tipo do exame: "
				+ tipoExame
				+ ", nível glicose: "
				+ nivelGlicose
				+ ", id da Pessoa: "
				+idPessoa;
	}
	
}
