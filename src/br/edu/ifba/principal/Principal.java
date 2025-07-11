package br.edu.ifba.principal;
import br.edu.ifba.basica.Conta;
import br.edu.ifba.cadastros.CadastrarConta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastrarConta c = new CadastrarConta();
		
		Conta p = new Conta("Fulano", 100.00);
		Conta p1 = new Conta("Sicrano", 571.80);
		Conta p2 = new Conta("Beltrano", 1005.00);
		Conta p3 = new Conta("Cosinha", 5000.00);
		c.adicionar(p);
		c.adicionar(p1);
		c.adicionar(p2);
		c.adicionarPorPosicao(3, p3);
		
		System.out.println(c.toString());
		Conta cp = c.procurarPorNome("Sicrano");
		
		if(cp!=null) {
			System.out.println("Conta encontrada");
			System.out.println(cp);
		}else {
			System.out.println("Conta não existe");
			
		}
		
		c.remover(2);
		System.out.println(c.toString());

	}

}
