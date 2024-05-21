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
		
		int acao = 0;

		do {
			System.out.printf("1 - Ligar%n2 - Atender%n3 - Correio de Voz%n"
					+ "4 - Exibir página do navegador%n5 - Atualizar Página%n"
					+ "6 - Adicionar nova aba%n7 - Selecionar Música%n8 - Tocar música%n"
					+ "9 - Pausar música%n0 - Para bloquear o Iphone%n");
			acao = sc.nextInt();

			switch (acao) {
			case 1:
				smatphone.ligar();
				System.out.println();
				break;
			case 2:
				smatphone.atender();
				System.out.println();
				break;
			case 3:
				smatphone.iniciarCorreioVoz();
				System.out.println();
				break;
			case 4:
				smatphone.exibirPagina();
				System.out.println();
				break;
			case 5:
				smatphone.atualizarPagina();
				System.out.println();
				break;
			case 6:
				smatphone.adicionarNovaAba();
				System.out.println();
				break;
			case 7:
				smatphone.selecionarMusica();
				System.out.println();
				break;
			case 8:
				smatphone.tocar();
				System.out.println();
				break;
			case 9:
				smatphone.pausar();
				System.out.println();
				break;
			case 0:
				System.out.println("Tela do Iphone bloqueada");
				break;
			}

		} while (acao != 0);

	}
}