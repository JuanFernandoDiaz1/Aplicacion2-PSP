package controlador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gestor gestor = new Gestor();
		
		System.out.println("Leyendo de manera secuencial todos los registros...");
		System.out.println("");
		gestor.leerSecuencial();
		System.out.println();
		System.out.println("*********************");
		
		System.out.println("");
		System.out.println("Leyendo con cinco hilos de ejecución concurrentes...");
		System.out.println("");
		gestor.leerConcurrente();		
	}
}
