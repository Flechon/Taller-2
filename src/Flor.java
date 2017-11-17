
public class Flor extends Semilla{
	String color;
	
	@Override
	public double calcularPrecioOferta() {
		double precioOferta = precio*(1-DESC_FLOR);
		if ("rojo".equalsIgnoreCase(color)) {
			precioOferta = precio;
		}
		return precioOferta;
		
	}
}
