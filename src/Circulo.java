
public class Circulo extends Figura {

	private int raio;
	
	public Circulo(int raio ) {
	}

	double area() {
		return Math.PI*Math.pow(getRaio(), getRaio());
	}

	double perimetro() {
		return getRaio()*2*Math.PI;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
}
