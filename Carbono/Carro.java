
public class Automovel implements EmissaoCarbono{
	private String combustivel;
	private double km;
	
	public Automovel() {
		
	}
	
	public Automovel(String combustivel, double km) {
		this.combustivel = combustivel;
		this.km = km;
	}
	
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}

	public double quantidadeEmitida() {
		return 96 * km;
	}

}
