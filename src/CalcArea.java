
public class CalcArea extends Poligono {

	public CalcArea(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(altura, base, ladoA, ladoB, ladoC);
	}

	double area() {
		return getAltura()*getBase();
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
