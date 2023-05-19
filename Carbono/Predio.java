
public class Predio implements EmissaoCarbono{
	private int pessoas;
	private int lampadas;
	private int arCondicionados;
	
	public Predio() {
		
	}
	
	public Predio(int pessoas, int lampadas, int arCondicionados) {
		this.pessoas = pessoas;
		this.lampadas = lampadas;
		this.arCondicionados = arCondicionados;
	}
	
	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	public int getLampadas() {
		return lampadas;
	}

	public void setLampadas(int lampadas) {
		this.lampadas = lampadas;
	}

	public int getArCondicionados() {
		return arCondicionados;
	}

	public void setArCondicionados(int arCondicionados) {
		this.arCondicionados = arCondicionados;
	}
	
	public double quantidadeEmitida() {
		return 14.4*lampadas +  10 * pessoas + 100 * arCondicionados;
	}
	
}
