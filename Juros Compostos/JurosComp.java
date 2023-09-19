/* JurosComp.java
   Programa para calcular juros compostos. */
import java.util.Scanner;

public class JurosComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	double capital;
	double taxa;
	int tempo;
	double aux;

	System.out.print("Informe o Capital (c): ");
	capital = scanner.nextDouble();

	System.out.print("Informe a Taxa (i): ");
	taxa = scanner.nextDouble();

	System.out.print("Informe o Tempo (t): ");
	tempo = scanner.nextInt();

	aux = 1;
	for (int j = 1; j <= tempo; j++) {
		aux *= (1 + taxa);
	}
	
	System.out.printf("O montante é igual a %.2f\n", capital * aux);
   } //Final do método main
} //Final da classe JurosComp

/*Capitulos 2, 4 e 5 para estudos*/
