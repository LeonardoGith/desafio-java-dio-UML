package Main;

import Marcas.Iphone;

public class main {
	 public static void main(String[] args) {
		Iphone meuCelular = new Iphone();
		
		
		meuCelular.ligar("(11) 9 9999-9999");
		meuCelular.atender();
		meuCelular.exibirPagina("https://web.dio.me/project/desafio-de-projeto-1/learning/6d16483b-8e3c-4275-9e1d-9ecea46a839c?back=/track/bradesco-java-cloud-native&tab=undefined&moduleId=undefined");
		meuCelular.atualizarPagina();
		meuCelular.selecionarMusica("Musicona");
		meuCelular.tocar();
		
		

		
	}
}
