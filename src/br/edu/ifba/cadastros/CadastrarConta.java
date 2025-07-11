package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basica.Conta;

public class CadastrarConta {
	
	private Conta[] contas = new Conta[5];
	
	int totalConta = 0;
	
	public void adicionar(Conta c) {
		aumentarVetor();
		contas[this.totalConta] = c;
		this.totalConta++;
		
	}
	
	public void listarConta() {
		
		System.out.println(Arrays.toString(contas));
		
	}
	
	public Conta procurarPorNome(String nome) {
		
		
		Conta c = null;
		
		for(int cont = 0; cont < this.totalConta-1;cont++) {
			
			if(contas[cont].getNome().equals(nome)) {
				c = contas[cont];
			}
			
		}
		
		return c;
			
		
	}
	
	public int size() {
		return this.totalConta;
	}
	
	public void adicionarPorPosicao(int posicao, Conta c) {
		
		if(!verificarPosicao(posicao)) {
			throw new IllegalArgumentException("posicao invalida!");
		}
		aumentarVetor();
		
		for(int cont = this.totalConta-1;cont>=posicao;cont--) {
			this.contas[cont+1] = this.contas[cont];
		}
		
		this.contas[posicao] = c;
		this.totalConta++;
		
	}
	
	public void remover(int posicao) {
		
		if(!verificaPosicaoOculpada(posicao)) {
			throw new IllegalArgumentException("Verifique posicao nao oculpada!");
		}
		
		aumentarVetor();
		
		for(int i = posicao;i<this.totalConta;i++) {
			this.contas[i] = this.contas[i+1];
		}
		
		this.contas[this.totalConta-1]=null;
		this.totalConta --;
		
	}
	
	private boolean verificaPosicaoOculpada(int posicao) {
		return posicao>=0 && posicao<this.totalConta;
	}
	
	private boolean verificarPosicao(int posicao) {
		return posicao>=0 && posicao<=this.totalConta;
	}
	
	public String toString() {
		
		if(this.totalConta==0) {
			return "[]";
		}
		
		StringBuffer vetor = new StringBuffer();
		
		vetor.append("[");
		
		for(int cont=0;cont<this.totalConta-1;cont++) {
			vetor.append(this.contas[cont]);
			vetor.append(",");
		
		}
		
		vetor.append(this.contas[this.totalConta-1]);
		vetor.append("]");
		
		
		
		return vetor.toString();
		
	}
	
	private void aumentarVetor() {
		
		if(this.totalConta==this.contas.length) {
			
			Conta[] newContas = new Conta[this.contas.length*2];
			
			System.arraycopy(this.contas, 0, newContas, 0, this.contas.length);
			
			this.contas = newContas;
			
		}
		
	}
	
	
	
	

}
