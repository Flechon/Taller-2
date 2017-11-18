
public class Arbol extends Semilla{
	int alturaMaxima;
	
	public Arbol(int cod,String nom,int pre,int alt) {
		this.codigo = cod;
		this.nombre = nom;
		this.precio = pre;
		this.alturaMaxima = alt;
	}
		
	@Override
	public double calcularPrecioOferta() {
		double oferta = this.precio*(1-DESC_ARBOL);
		if (this.alturaMaxima>180) {
			precioOferta = oferta;
		}
		return oferta;
	}
}
