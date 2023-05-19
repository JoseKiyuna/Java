import java.util.ArrayList;

public class TestaCidade {
	public static void main(String [] args) {
		Cidade c = new Cidade();
		ArrayList<EmissaoCarbono> teste = new ArrayList<EmissaoCarbono>();
		Predio p = new Predio(1000, 20000, 50);
		Automovel a = new Automovel("gasolina", 100);
		Bicicleta b = new Bicicleta();
		teste.add(a);
		teste.add(p);
		teste.add(b);
		c.setElementos(teste);
		System.out.println("Gasto: " + c.calculaEmissaoMensal());
	
	}
}
