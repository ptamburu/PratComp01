
public class Trapezio extends CalcArea {

	public Trapezio(double base, double altura, double ladoA, double ladoB, double ladoC) {
		super(base, altura, ladoA, ladoB, ladoC);
	}
	
	public double area() {
		return super.area();
	}
	
	public double perimetro() {
		return getBase()+getLadoA()+getLadoB()+getLadoC();
	}


}
