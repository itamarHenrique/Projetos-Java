package entidade;

public class Banco {
	
	private Pessoa titular;
	private String Id;
	private double saldo;
	private String conta;
	private String agencia;
	
	public Banco() {
		
	}
	
	public Banco(Pessoa titular, String Id, String agencia, double saldo, String conta) {
		this.titular = titular;
		this.Id = Id;
		this.saldo = saldo;
		this.conta = conta;
		this.agencia = agencia;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		String nomeCompletoTitular = titular.getNome() + " " + titular.getSobrenome();
		Endereco enderecoTitular = getTitular().getEndereco();
		return "O titular da conta " + getId() + " / agencia " + getAgencia() + " é " + nomeCompletoTitular + "que mora no endereço: " + enderecoTitular + " e o saldo é de: R$ " + getSaldo(); 
	}
	
	
	
	

}
