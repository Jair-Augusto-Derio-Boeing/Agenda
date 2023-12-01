import java.util.Scanner;

public class Menu {
	public static int Menu() {
		Scanner t = new Scanner(System.in);

		System.out.println("1ª Opção - Adicionar Contato.");
		System.out.println("2ª Opção - Listar Contatos.");
		System.out.println("3ª Opção - Buscar Contato.");
		System.out.println("4ª Opção - Remover Contato.");
		System.out.println("Digite 0 - Para Finalizar.");
		int escolha = t.nextInt();
		return escolha;

	}
}
