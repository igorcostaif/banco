package br.edu.ifba.basica;

public class Conta {
	
	private String nome;
	private double saldo;
	public Conta(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}
	public Conta() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	

}
