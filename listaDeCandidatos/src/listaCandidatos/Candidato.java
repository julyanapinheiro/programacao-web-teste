package listaCandidatos;

public class Candidato {
	private String nome;
	private String sobrenome;
	private String cep;
	private String endere�o;
	private String rg;
	private String cpf;
	private String titulo;
	
	//os m�tdos acessores get foram criados para verificar os valores que foram atribuidos
	//os m�todos acessores set possibilita verificar os valores durante a execu��o.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		sobrenome = sobrenome;
	}
	public String getCEP() {
		return cep;
	}
	public void setCEP(String cep) {
		cep = cep;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		endere�o = endere�o;
	}
	public String getRG() {
		return rg;
	}
	public void setRG(String rg) {
		rg = rg;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		cpf = cpf;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t�tulo) {
		this.titulo = titulo;
	} 
	
	

}
