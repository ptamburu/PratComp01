
public class Triangulo extends Poligono{

	public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(base, altura, ladoA, ladoB, ladoC);
	}

	double area() { 
		return getBase()*getAltura()/2;
	}

	double perimetro() {
		return getBase()+getLadoA()+getLadoB();
	}
}