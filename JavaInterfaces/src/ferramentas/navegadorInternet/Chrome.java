package ferramentas.navegadorInternet;

public class Chrome implements NavegadorInternet {

	
	public void exibirPagina(String url) {
		System.out.println("NAVEGANDO COM O CHROME!");
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA COM O CHROME!");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA COM O CHROME!");		
	}
}
