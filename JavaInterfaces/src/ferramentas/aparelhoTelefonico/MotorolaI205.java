package ferramentas.aparelhoTelefonico;

public class MotorolaI205 implements AparelhoTelefonico{
	
	public void ligar(String numero) {
		System.out.println("LIGANDO DO MEU MOTOROLA I205 PARA O NUMERO " + numero);		
	}
	
	public void atender() {
		System.out.println("ATENDENDO DO MEU MOTOROLA I205");				
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ DO MEU MOTOROLA I205");				
	}
}
