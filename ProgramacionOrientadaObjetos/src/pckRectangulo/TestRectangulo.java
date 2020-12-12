package pckRectangulo;
public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo();
		rec.base=10;
		rec.altura=5;
		rec.imprimirArea();
		rec.imprimirPerimetro();
		System.out.println("Otra opción.");
		System.out.println("Perimetro: "+rec.calcularPerimetro(10, 5));
		System.out.println("Area: "+rec.calcularArea(10, 5));
	}

}
