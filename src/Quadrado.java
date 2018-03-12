
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(altura, base, ladoA, ladoB, ladoC);
	}

	double area() {
		return getBase()*getAltura();		
	}
	
	public double calcularDiagonal() {
		return getBase()*Math.sqrt(2);
	}

	double perimetro() {
		return getBase()*4;
	}

}
