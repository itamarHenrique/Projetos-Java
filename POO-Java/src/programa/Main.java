package programa;

import entidade.Banco;
import entidade.Endereco;
import entidade.Pessoa;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua das flores", "123B", "44777-789", "Centro", "Salvador", "Bahia");
		Pessoa pessoa = new Pessoa("Waldemir", "Cruz", endereco);
		Banco banco = new Banco(pessoa, "457", "6877", 4581.0, "58744-9");
		
		System.out.println(banco);
		
	}

}
