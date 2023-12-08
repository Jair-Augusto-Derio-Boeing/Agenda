
public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int numero = 0;
		while(true) {
			switch (Menu.Menu()) {
	
			case 1:
				System.out.println("Qual o nome do  contato que quer adicionar");
				nomearCtt.contato();
				System.out.println("Qual é o numero do contato que quer adicionar");
				numeroDoCtt.numero(numero);
				break;
			
			case 2:
				
				Lista.Lista(vetor, numero);
				break;
				
			case 3:
				
				BuscarCtt.Buscar();
				break;
				
			case 4:
				
				RemoverCtt.Remover();
				break;
				
			case 0:
				
				System.out.println("Fim Do Algoritmos.");
				break;
				
			default:
				
				System.out.println("Opção Inválida.");
				break;
			}
		}
	}

}
