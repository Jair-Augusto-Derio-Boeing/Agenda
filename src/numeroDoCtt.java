import java.util.Scanner;

public class numeroDoCtt {

	public static int numero() {

		Scanner t = new Scanner(System.in);
		System.out.println("Qual é o numero do contato que quer adicionar");
		int numero = t.nextInt();
		return numero;

	}
}
