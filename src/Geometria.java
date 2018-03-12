import java.util.ArrayList;
import java.util.List;

public class Geometria {
	public static void main(String args[]) {
	
	List<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Circulo(2));
		figuras.add(new Triangulo(4,3,4,4,0));
		figuras.add(new Quadrado(2,2,0,0,0));
		figuras.add(new Retangulo(5,3,0,0,0));
		figuras.add(new Losango(7,7,7,7,7));
		
	for(Figura figura:figuras) {
		System.out.println("Area "+figura.area());
		System.out.println("Perimetro "+figura.perimetro());
		if(figura instanceof Diagonal) {
			System.out.println("Diagonal "+((Diagonal) figura).calcularDiagonal());
		}
	}

	}	
}
