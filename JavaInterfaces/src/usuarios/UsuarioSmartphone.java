package usuarios;

import ferramentas.aparelhoTelefonico.MotorolaI205;
import ferramentas.iphone.Iphone;
import ferramentas.navegadorInternet.Chrome;

public class UsuarioSmartphone {
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		MotorolaI205 motorola = new MotorolaI205();
		Chrome chrome = new Chrome();
			
		motorola.ligar("11 9 8214-5847");
		iphone.ligar("11 9 5214-5847");
		chrome.atualizarPagina();
			
		iphone.atualizarPagina();
		
	}
}
