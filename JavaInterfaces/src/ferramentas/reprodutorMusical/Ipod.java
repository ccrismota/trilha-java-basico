package ferramentas.reprodutorMusical;

public class Ipod implements reprodutorMusical {
	
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO IPOD");		
	}
	
	
	public void pausar() {
		System.out.println("PAUSAR MUSICA NO IPOD");				
	}
	
	
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA NO IPOD");			
	}
}
