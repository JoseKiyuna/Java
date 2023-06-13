package v2;

	public abstract class Quarto {
		protected int numQuarto;
		protected double diaria;

	public Quarto(int numQuarto, double diaria) {
		this.numQuarto = numQuarto;
		this.diaria = diaria;
	}
	   
	    public int getNumQuarto() {
	        return numQuarto;
	    }

	    public double getDiaria() {
	        return diaria;
	    }

		public void info() {
		}

	}

