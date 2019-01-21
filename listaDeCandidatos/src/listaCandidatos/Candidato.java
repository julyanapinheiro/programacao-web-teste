package listaCandidatos;

public class Candidato {
	private String nome;
	private String sobrenome;
	private String cep;
	private String endereço;
	private String rg;
	private String cpf;
	private String titulo;
	
	//os métdos acessores get foram criados para verificar os valores que foram atribuidos
	//os métodos acessores set possibilita verificar os valores durante a execução.
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		endereço = endereço;
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
	public void setTitulo(String título) {
		this.titulo = titulo;
	} 
	
	

}
