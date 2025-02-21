package Marcas;

import toolsInterface.ReprodutorMusical;
import toolsInterface.AparelhoTelefonico;
import toolsInterface.NavegadorInternet;


public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibi uma página no IPHONE");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionei uma página no IPHONE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizei a página do Iphone");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando o celular IPHONE");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o celular IPHONE");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz do celular IPHONE");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Música no celular IPHONE");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música o celular IPHONE");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Música o celular IPHONE");
		
	}

}
