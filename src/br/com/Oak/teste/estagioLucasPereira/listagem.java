package br.com.Oak.teste.estagioLucasPereira;

import javax.swing.JTextField;

public class listagem extends cadastrojav implements Comparable<listagem>{
	private static final String JTextField = null;
	private JTextField prod;
	private JTextField despro;
	private JTextField valor;
	private JTextField disponivel;
	
	public listagem(JTextField prod, JTextField despro, JTextField valor, JTextField disponivel) {
		this.prod = prod;
		this.despro = despro;
		this.valor = valor;
		this.disponivel = disponivel;
	}
	
	
	public JTextField getProd() {
		return prod;
	}
	public void setProd(JTextField prod) {
		this.prod = prod;
	}
	
	
	public JTextField getDespro() {
		return despro;
	}
	public void setDespro(JTextField despro) {
		this.despro = despro;
	}
	
	
	public JTextField getValor() {
		return valor;
	}
	public void setValor(JTextField valor) {
		this.valor = valor;
	}
	
	
	public JTextField getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(JTextField disponivel) {
		this.disponivel = disponivel;
	}
	@Override
	public int compareTo(listagem o) {
		return 0;
	}
	
	
}
