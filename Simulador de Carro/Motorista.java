import java.util.Scanner;

public class Motorista {
	private Scanner scanner;

	public Motorista() {
	   this.scanner = new Scanner(System.in);
	}

	public String nomeMotorista() {
	   System.out.print("Informe o nome do motorista: ");
	   String nome = scanner.nextLine();
	   return nome;
	}

	public String numeroCnh() {
	   System.out.print("Informe o número da CNH: ");
	   String cnh = scanner.nextLine();
	   return cnh;
	}

	public int idadeMotorista() {
	   System.out.print("Informe a idade do motorista: ");
	   int idade = scanner.nextInt();
	   return idade;
	}

} //Fim da class motorista