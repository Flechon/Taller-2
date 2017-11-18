import java.util.ArrayList;
import static java.lang.System.out;

public class Inventario {
	ArrayList<Semilla> listaSemillas = new ArrayList<>();
	
	
	
	//inicio metodo agregar()
	public boolean agregar(Semilla sem) {
		boolean exito;
		try {
			listaSemillas.add(sem);
			exito = true;
		}
		catch(Exception e){
			out.println(e);
			exito = false;
		}
		return exito;
	}
	//fin metodo agregar()
	
	
	
	//inicio metodo eliminar()
	public boolean eliminar(int cod) {
		boolean exito = false;
		int indiceEliminar = -2;
		try {
			for (Semilla sEliminar : listaSemillas) {
				if (sEliminar.codigo == cod) {
					indiceEliminar = listaSemillas.indexOf(sEliminar);
					exito = true;
					listaSemillas.remove(indiceEliminar);
					out.println("-----------------------------------");
					out.println("La semilla fue eliminada con exito");
					out.println("-----------------------------------");
				}
				else {
					out.println("-----------------------------------");
					out.println("La semilla "+cod+" no se encuentra");
					out.println("-----------------------------------");
					exito=false;
				}
			}
		}
		catch(Exception e){
			out.println(e);
		}
		return exito;
	}
	//fin metodo eliminar()
	
	
	
	//inicio metodo listar()
	public void listar() {
		out.println("---------------------------------------------------");
		out.println("Codigo\tNombre\t\tPrecio\tP.Oferta\t\tTipo");
		for (Semilla semi:listaSemillas) {
			semi.calcularPrecioOferta();
			out.println(semi.codigo + "\t" + String.format("%-15s", semi.nombre) + "\t" + semi.precio + "\t" + semi.precioOferta + "\t\t" + semi.getClass().getSimpleName());
		}
		out.print("-----------------------------------------------------");
	}
	//fin metodo listar()
	
	
	
	//inicio metodo buscar()
	public boolean buscar(int cod) {
		boolean exito = false;
		for (Semilla sBuscar:listaSemillas) {
			if(sBuscar.codigo==cod) {
				exito = true;
			}
		}
		if (exito==true) {
			out.println("--------------------------------");
			out.println("Semilla SI se encuentra listada");
			out.println("--------------------------------");
		}else {
			out.println("--------------------------------");
			out.println("Semilla NO se encuentra listada");
			out.println("--------------------------------");
		}
		return exito;
	}
	//fin metodo busar()
	
	public boolean buscarBoolean(int codigo) {
        boolean valida = listaSemillas.stream().anyMatch(semi -> semi.codigo == codigo);
        return valida;
    }
	
}

