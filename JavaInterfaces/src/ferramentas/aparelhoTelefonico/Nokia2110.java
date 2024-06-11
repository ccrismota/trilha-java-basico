package ferramentas.aparelhoTelefonico;

public class Nokia2110 implements AparelhoTelefonico{
	
	public void ligar(String numero) {
		System.out.println("LIGANDO DO MEU NOKIA 2110 PARA O NUMERO " + numero);		
	}
	
	public void atender() {
		System.out.println("ATENDENDO DO MEU NOKIA 2110");				
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ DO MEU NOKIA 2110");				
	}
}
