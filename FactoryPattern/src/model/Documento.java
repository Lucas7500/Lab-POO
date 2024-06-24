package model;

public abstract class Documento {
	private int numero;
	private String remetente;
	
	public Documento(int numero, String remetente) {
		this.numero = numero;
		this.remetente = remetente;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getRemetente() {
		return remetente;
	}
	
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	
	@Override
	public String toString() {
		return String.format("Tipo: %s\nNúmero: %d\nRemetente: %s\n", getClass(), getNumero(), getRemetente());
	}
}
