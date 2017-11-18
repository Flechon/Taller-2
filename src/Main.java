
import java.util.Scanner;
import static java.lang.System.out; 

public class Main {
	//crear inventario
	public static Inventario inventario = new Inventario();
	
	public static void main(String args[]) {
		int opcion;
		boolean salir = true;
		Scanner Input = new Scanner(System.in);
		
		//crear los objetos
        Arbol arbol1 = new Arbol(100, "ficus", 3000, 120);
        Arbol arbol2 = new Arbol(101, "rauli", 7000, 300);
        Arbol arbol3 = new Arbol(102, "lenga", 6000, 220);
        Flor flor1 = new Flor(501, "tulipan", 8000, "rojo");
        Flor flor2 = new Flor(502, "orquidea", 4000, "blanco");
        Flor flor3 = new Flor(503, "loto", 9000, "amarillo");
        
        //agragar al inventario
        inventario.agregar(arbol1);
        inventario.agregar(arbol2);
        inventario.agregar(arbol3);
        inventario.agregar(flor1);
        inventario.agregar(flor2);
        inventario.agregar(flor3);
        
		while(salir) {
			out.println("-------------------------------------------");
			out.println("1.- Agregar Semilla");
			out.println("2.- Eliminar Semilla");
			out.println("3.- Lista de Semillas");
			out.println("4.- Buscar Semilla");
			out.println("5.- Salir");
			out.println("-------------------------------------------");
			opcion = Input.nextInt();
			switch (opcion) {
			
			case 1:
                out.println("Que tipo desea ingresar");
                out.println("1.\tArbol");
                out.println("2.\tFlor");
                int op2 = Input.nextInt();
                switch (op2) {
                    case 1:
                        out.println("Ingrese el codigo de la semilla (100-999)");
                        int cod = Input.nextInt();
                        while (cod < 100 || cod > 999 || inventario.buscarBoolean(cod)) {
                            System.err.println("El codigo debe estar en el rango(100-999) o ya esta registrado");
                            cod = Input.nextInt();
                        }
                        
                        out.println("Ingrese el nombre de la semilla (5 o más letras)");
                        Input.nextLine();
                        String nom = Input.nextLine();
                        while(nom.length()<5){
                            System.err.println("Ingrese el nombre de la semilla (5 o más letras)");
                            nom = Input.nextLine();
                        }
                        
                        out.println("Ingrese el precio de la semilla");
                        int pre = Input.nextInt();
                        while(pre<1){
                            System.err.println("El precio debe ser mayor a cero");
                            pre = Input.nextInt();
                        }
                        
                        out.println("Ingrese la altura maxima del Arbol en centimetros");
                        int alt = Input.nextInt();
                        while(alt<1 || alt>2000){
                            System.err.println("Ingrese una altura valida");
                            alt = Input.nextInt();
                        }
                        inventario.agregar(new Arbol(cod, nom, pre, alt));
                        break;
                    case 2:
                        out.println("Ingrese el codigo de la semilla (100-999)");
                        int cod2 = Input.nextInt();
                        while (cod2 < 100 || cod2 > 999 || inventario.buscarBoolean(cod2)) {
                            System.err.println("El codigo debe estar en el rango(100-999) o ya esta registrado");
                            cod2 = Input.nextInt();
                        }
                        
                        out.println("Ingrese el nombre de la semilla (5 o más letras)");
                        Input.nextLine();
                        String nom2 = Input.nextLine();
                        while(nom2.length()<5){
                            System.err.println("Ingrese el nombre de la semilla (5 o más letras)");
                            nom2 = Input.nextLine();
                        }
                        
                        out.println("Ingrese el precio de la semilla");
                        int pre2 = Input.nextInt();
                        while(pre2<1){
                            System.err.println("El precio debe ser mayor a cero");
                            pre2 = Input.nextInt();
                        }
                        
                        out.println("Ingrese la altura maxima del Arbol en centimetros");
                        Input.nextLine();
                        String col = Input.nextLine();
                        while(col.length()<2){
                            System.err.println("Ingrese una altura valida");
                            col = Input.nextLine();
                        }
                        inventario.agregar(new Flor(cod2, nom2, pre2, col));
                        break;
                    default:
                        System.err.println("Ingrese un numero valido");
                        break;
                }
                out.println("-------------------------------------------");
                out.println("La semilla fue ingresada con exito");
                out.println("-------------------------------------------");
                Input.nextLine();
                String wait1 = Input.nextLine();

				
				break;
				
			case 2:
				out.println("-------------------------------------------");
				inventario.listar();
				out.println("-------------------------------------------");
				out.println("Ingrese el codigo de la semilla a eliminar: ");
				out.println("-------------------------------------------");
				int eliminar = Input.nextInt();
				inventario.eliminar(eliminar);
				out.println("Presione enter para continuar...");
                Input.nextLine();
                String wait2 = Input.nextLine();
				
				break;
			
			case 3:
				inventario.listar();
				out.println("Presione enter para continuar...");
                Input.nextLine();
                String wait3 = Input.nextLine();
				break;
				
			case 4:
				out.println("-------------------------------------------");
				out.println("Ingrese el Codigo de la Semilla a Buscar: ");
				out.println("-------------------------------------------");
				int buscar = Input.nextInt();
				inventario.buscar(buscar);
				out.println("Presione enter para continuar...");
                Input.nextLine();
                String wait4 = Input.nextLine();
				break;
				
			case 5:
				salir = false;
				
				break;

			default:
				out.println("Opcion NO valida");
				break;
			}
		}
	}
}
