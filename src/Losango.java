
public class Losango extends Poligono {

	public Losango(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(altura, base, ladoA, ladoB, ladoC);
	}

	double area() {
		return getBase()*getAltura();
	}

	double perimetro() {
		return getBase()+getLadoA()+getLadoB()+getLadoC();
	}

}
