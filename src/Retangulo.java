
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(altura, base, ladoA, ladoB, ladoC);
	}

	double area() {
		return getBase()*getAltura();
	}
	
	public double calcularDiagonal() {
		return Math.sqrt((getAltura()*getAltura())+(getBase()*getBase())) ;
	}

	double perimetro() {
		return (getBase()*2)+(getAltura()*2);
	}

}
