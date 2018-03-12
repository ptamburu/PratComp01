
public abstract class Poligono extends Figura {

	private double base;
	private double altura;
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	
	public Poligono(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super();
		this.base=base;
		this.altura=altura;
		this.ladoA=ladoA;
		this.ladoB=ladoB;
		this.ladoC=ladoC;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	 
	
}
