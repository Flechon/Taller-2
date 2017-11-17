
public class Arbol extends Semilla{
	int alturaMaxima;
	
	@Override
	public double calcularPrecioOferta() {
		double precioOferta = 0;
		if (alturaMaxima<180) {
			precioOferta = precio*(1-DESC_ARBOL);
		}
		return precioOferta;
	}
}
