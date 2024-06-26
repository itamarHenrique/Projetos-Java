package entidade;

public class Endereco {
	
	private String numero;
	private String logadouro;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco() {
		
	}
	
	public Endereco(String logadouro, String numero, String cep, String bairro, String cidade, String estado) {
		this.numero = numero;
		this.logadouro = logadouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return String.format("Logadouro: %s, Numero: %s, Bairro: %s, CEP: %s, Cidade: %s / %s", getLogadouro(), getNumero(), getBairro(), getCep(), getCidade(), getEstado());
	}
	
}
