
public class Cubo extends Poligono implements Volume {

	public Cubo(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(base, altura, ladoA, ladoB, ladoC);
	}

	double area() {
		return 0;
	}

	double perimetro() {
		return 0;
	}

	public double calcularVolume() {
		return getBase()*getAltura()*getLadoA();
	}

}
