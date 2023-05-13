
public class Carro implements EmissaoCarbono{
	private double combustivel;
	private double km;
	
	
	
	public Carro(){}
	
	public Carro(double combustivel, double km) {
		this.combustivel = combustivel;
		this.km = km;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	public double quantidadeEmitida() {
		if(combustivel == 1) {
			return 96 * km;
		}else if(combustivel == 2) {
			return 53 * km;
		}else if(combustivel == 3) {
			return 171 * km;
		}else {
			return 0;
		}
	}
	
}
