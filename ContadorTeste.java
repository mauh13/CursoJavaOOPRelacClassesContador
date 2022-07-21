package senac.entra21.java.oop.lista04;

public class ContadorTeste {

	public static void main(String[] args) {
		
		System.out.println(Contador.retornarValor());
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		System.out.println(Contador.retornarValor());
		
		Contador.zerar();
		
		System.out.println(Contador.retornarValor());
		
		Contador.incrementar();
		Contador.incrementar();
		
		System.out.println(Contador.retornarValor());
	}

}
