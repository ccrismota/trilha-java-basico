package ferramentas.navegadorInternet;

public class Edge implements NavegadorInternet{
		
	public void exibirPagina(String url) {
		System.out.println("NAVEGANDO COM O EDGE!");
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA COM O EDGE!");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA COM O EDGE!");		
	}
		
}
