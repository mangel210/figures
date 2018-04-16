package figures;

public class Circulo {
	private int radi;

	public Circulo(int radi) {
		super();
		this.radi = radi;
	}

	public int Area(int radi) {
		return (int) (radi*radi*Math.PI);
	}
	
	public int Perimetro(int radi) {
		return (int) (2*radi*Math.PI);
	}
	
	public int getRadi() {
		return radi;
	}

	public void setRadi(int radi) {
		this.radi = radi;
	}

}
