
public class Cilindro extends Poligono implements Volume {

	public Cilindro(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(base, altura, ladoA, ladoB, ladoC);
	}

	double area() {
		return 0;
	}

	double perimetro() {
		return 0;
	}

	public double calcularVolume() {
		return Math.PI*(getBase()/2)*(getBase()/2)*(getBase()/2)*getAltura();
	}

}
