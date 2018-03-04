
public class Piramide extends Poligono implements Volume {

	public Piramide(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(base, altura, ladoA, ladoB, ladoC);
	}

	public double calcularVolume() {
		return 0;
	}

	double area() {
		return 0;
	}

	double perimetro() {
		return (1/3)*getAltura()*getBase()*getLadoA();
	}

}
