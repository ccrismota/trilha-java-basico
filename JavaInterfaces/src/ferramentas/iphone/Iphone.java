package ferramentas.iphone;

import ferramentas.aparelhoTelefonico.AparelhoTelefonico;
import ferramentas.navegadorInternet.NavegadorInternet;
import ferramentas.reprodutorMusical.reprodutorMusical;

public class Iphone implements AparelhoTelefonico, reprodutorMusical, NavegadorInternet {
	//APARELHO TELEFONICO
	public void ligar(String numero) {
		System.out.println("LIGANDO DO MEU IPHONE PARA O NUMERO "+numero);		
	}
	
	public void atender() {
		System.out.println("ATENDENDO DO MEU IPHONE");				
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ DO IPHONE");				
	}
	
	//REPRODUTOR MUSICAL
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO IPHONE");		
	}
		
	public void pausar() {
		System.out.println("PAUSAR MUSICA NO IPHONE");				
	}
		
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA NO IPHONE");			
	}
	
	//CONEXÃO COM A INTERNET
	public boolean conexaoComInternet() {
		return true;
	}
	
	public void exibirPagina(String url) {
		conexaoComInternet();
		System.out.println("NAVEGANDO COM O IPHONE");
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA COM O IPHONE!");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA COM O IPHONE!");		
	}
	
}
