package apple;

import java.util.Scanner;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import smartphone.Smatphone;
import telefone.AparelhoTelefonico;

public abstract class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public static void main(String[] args) {
		Smatphone smatphone = new Smatphone();
		Scanner sc = new Scanner(System.in);

		System.out.printf("1 - Ligar%n2 - Atender%n3 - Correio de Voz%n"
				+ "4 - Exibir página do navegador%n5 - Atualizar Página%n"
				+ "6 - Adicionar nova aba%n7 - Selecionar Música%n8 - Tocar música%n"
				+ "9 - Pausar música%n0 - Para bloquear o Iphone");
		int acao = sc.nextInt();

		switch (acao) {
		case 1:
			smatphone.ligar();
			break;
		case 2:
			smatphone.atender();
			break;
		case 3:
			smatphone.iniciarCorreioVoz();
			break;
		case 4:
			smatphone.exibirPagina();
			break;
		case 5:
			smatphone.atualizarPagina();
			break;
		case 6:
			smatphone.adicionarNovaAba();
			break;
		case 7:
			smatphone.selecionarMusica();
			break;
		case 8:
			smatphone.tocar();
			break;
		case 9:
			smatphone.pausar();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

	}

}
//implementar um looping antes de entregar na plataforma da DIO