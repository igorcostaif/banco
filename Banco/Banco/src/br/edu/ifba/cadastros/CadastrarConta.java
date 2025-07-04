package br.edu.ifba.cadastros;

import java.util.Arrays;



import br.edu.ifba.basica.Conta;

public class CadastrarConta {
	
	private Conta[] contas = new Conta[3];
	
	int totalConta = 0;
	
	public void adicionar(Conta c) {
		
		contas[this.totalConta] = c;
		this.totalConta++;
		
	}
	
	public void listarConta() {
		
		System.out.println(Arrays.toString(contas));
		
	}
	
	public Conta procurarPorNome(String nome) {
		
		
		Conta c = null;
		
		for(int cont = 0; cont < this.contas.length;cont++) {
			
			if(contas[cont].getNome().equals(nome)) {
				c = contas[cont];
			}
			
		}
		
		return c;
			
		
	}
	
	public void adicionarPorPosicao(int posicao, Conta c) {
		
		for(int cont = this.totalConta-1;cont>=posicao;cont--) {
			this.contas[cont+1] = this.contas[cont];
		}
		
		this.contas[posicao] = c;
		this.totalConta++;
		
	}
	
	
	
	

}
