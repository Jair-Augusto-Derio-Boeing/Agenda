import java.util.Scanner;

public class nomearCtt {

	public static String contato() {
		Scanner t = new Scanner(System.in);
		System.out.println("Qual o nome do  contato que quer adicionar");

		 String contato=t.nextLine();		
		return contato;
	}

}
