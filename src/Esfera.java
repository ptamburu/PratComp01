
public class Esfera extends Circulo implements Volume {

	public Esfera(int raio) {
		super(raio);
	}

	public double calcularVolume() {
		return Math.PI*(4/3)*Math.pow(getRaio(),getRaio());
	}

}
