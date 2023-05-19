import java.util.ArrayList;

public class Cidade {
	private ArrayList<EmissaoCarbono> elementos;
	
	public Cidade() {
		elementos = new ArrayList<EmissaoCarbono>();
	}
	
	public ArrayList<EmissaoCarbono> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<EmissaoCarbono> elementos) {
		this.elementos = elementos;
	}

	public double calculaEmissaoMensal() {
		double total = 0;
		for(int i = 0; i < elementos.size(); i++) {
			total += elementos.get(i).quantidadeEmitida();
		}
		return total;
	}
}
