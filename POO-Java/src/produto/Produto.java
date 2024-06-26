package produto;

import enums.Categoria;

public class Produto {
	
	private String nome;
	private Categoria categoria;
	private double preço;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Categoria categoria, double preço) {
		this.nome = nome;
		this.categoria = categoria;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public double getComissao() {
		return getPreço() * getCategoria().getPercentualComissao() / 100;
	}

	@Override
	public String toString() {
		return String.format("O produto %s tem valor R$ %s e faz parte da categoria %s e fornece uma comissão de R$ %s", getNome(), getPreço(), getCategoria(), getComissao());
	}
	
	
	

}
