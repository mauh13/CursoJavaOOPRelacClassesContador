package senac.entra21.java.oop.lista04;

public class Contador {

	private static int contador;
	
	public static void incrementar() {
		contador++;
	}
	
	public static void zerar() {
		contador=0;
	}
	
	public static int retornarValor() {
		return contador;
	}
	
}
