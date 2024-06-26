package enums;

public enum Categoria {
	
	ELETRODOMESTICO("Eletrodomésticos", 3),
	MOVEIS("Móveis", 5),
	PORTATEIS("Portateis", 2),
	MESA_BANHO("Mesa e banho", 8),
	INFORMATICA("Informatica", 2);
	
	private String nome;
	private double percentualComissao;
	
	
	Categoria(String nome, double percentualComissao) {
		this.nome = nome;
		this.percentualComissao = percentualComissao;
	}


	public String getNome() {
		return nome;
	}


	public double getPercentualComissao() {
		return percentualComissao;
	}
	
	
	
	

}
