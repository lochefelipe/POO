/* Bissexto.java
   Informa se o ano fornecido pelo usuário é bissexto ou não. */
import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int ano;
	boolean valido;

	do {
	   System.out.printf("Informe um ano: ");

	   ano = scanner.nextInt();
	   valido = ano >= 0;
	   if (!valido)
	      System.err.println("Ano inválido");
	} while(!valido);

	if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
	   System.out.printf("O ano %d é bissexto\n", ano);
	} else {
	   System.out.printf("O ano %d NÃO é bissexto\n", ano);
	}
   } //Fim do método main(String[])
} //Fim da classe bissexto
