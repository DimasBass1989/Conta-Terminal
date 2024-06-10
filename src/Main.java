import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Dados dados = new Dados();
		 System.out.println("Nome do Cliente: ");
		 dados.setNome(scanner.nextLine());
		 System.out.println("Agência: ");
		 dados.setAgencia(scanner.nextInt());
		 System.out.println("Número da Conta: ");
		 dados.setNumecoConta(scanner.nextInt());
		 System.out.println("Infomr o saldo: ");
		 dados.setSaldo(scanner.nextDouble());
		 
		 
		 System.out.println(dados);
		 
		 
		
		
		// TODO Auto-generated method stub

	}

}
