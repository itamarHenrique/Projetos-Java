package programa;

import enums.Categoria;
import produto.Produto;

public class TestProduct {

	public static void main(String[] args) {
		Produto liquidificador = new Produto();
		liquidificador.setNome("Liquidificador Mondial");
		liquidificador.setCategoria(Categoria.ELETRODOMESTICO);
		liquidificador.setPreço(90);
		
		Produto mesa = new Produto();
		mesa.setCategoria(Categoria.MOVEIS);
		mesa.setNome("Mesa de jantar");
		mesa.setPreço(1500);
		
		System.out.println(mesa);
		System.out.println(liquidificador);
	
	}

}
