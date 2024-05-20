package smartphone;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Smatphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA");

	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA");

	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA");

	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");

	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO");

	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("OUVINDO CORREIO DE VOZ");

	}

}
