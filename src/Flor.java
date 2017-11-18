
public class Flor extends Semilla{
	String color;
	
	public Flor(int cod,String nom,int pre,String col) {
		this.codigo = cod;
		this.nombre = nom;
		this.precio = pre;
		this.color = col;
	}
	
	@Override
	public double calcularPrecioOferta() {
		double oferta = this.precio*(1-DESC_FLOR);
		if ("rojo".equalsIgnoreCase(color)) {
			precioOferta = 0;
		}
		else {
			precioOferta = oferta;
		}
		return oferta;
		
	}
}
