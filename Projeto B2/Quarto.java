
public abstract class Quarto {
	private int numero;
	private String tipo;
	private int capacidade;
	private double precoNoite;
	private boolean disponibilidade;
	
	public Quarto() {
		
	}
	
	public Quarto(int numero, String tipo, int capacidade, double precoNoite, boolean disponibilidade) {
		this.numero = numero;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.precoNoite = precoNoite;
		this.disponibilidade = disponibilidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getPrecoNoite() {
		return precoNoite;
	}

	public void setPrecoNoite(double precoNoite) {
		this.precoNoite = precoNoite;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public String toString() {
		return "\nNúmero do quarto: " + numero + 
				"\nTipo do quarto: " + tipo + 
				"\nCapacidade do quarto: " + capacidade + 
				"\nPreço por noite: " + precoNoite + 
				"\nDisponibilidade do quarto: " + disponibilidade;
	}
}
