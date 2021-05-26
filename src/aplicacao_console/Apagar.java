package aplicacao_console;

import fachada.Fachada;

public class Apagar {

	public Apagar() {
		try {
			Fachada.inicializar();
			try {
				Fachada.apagarVisualizacao(1);
				Fachada.apagarVisualizacao(12);
				System.out.println("Apagando visualiza��o de id 1");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} finally {
			Fachada.finalizar();
		}
		System.out.println("fim do programa");
	}

	// =================================================
	public static void main(String[] args) {
		new Apagar();
	}
}