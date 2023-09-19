/* ParImpar.java
   Jogo de par ou impar */
import java.util.Scanner;
import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int NumUser;
	int NumCpu;
	int ParImpar;
	int Soma;
	boolean Valido;
	boolean Sair;

	do {
	   System.out.printf("Digite 0 para par, 1 para ímpar ou 000 para sair: ");
	   ParImpar = scanner.nextInt();

	   Valido = ParImpar == 0 || ParImpar == 1 || ParImpar == 000;
	   if (!Valido)
		System.out.printf("Número Inválido! Informe 0 ou 1 para escolher entre par ou ímpar%n", ParImpar);
	} while (!Valido); 

	do {
	   System.out.printf("Digite um número de 0 a 10: ");
	   NumUser = scanner.nextInt();

	   Valido = NumUser >= 0 && NumUser <= 10;
	   if (!Valido)
		System.out.printf("Número Inválido! Informe um número entre 0 e 10%n", NumUser);
	} while (!Valido); 

	Random random = new Random();
	NumCpu = random.nextInt(11);

	Soma = (NumUser + NumCpu);
	if (((Soma % 2 == 0) && (ParImpar == 0)) || ((Soma % 2 != 0) && (ParImpar == 1))) {
	   System.out.printf("CPU=%d; ganhei\n", NumCpu);
	} else {
	   System.out.printf("CPU=%d; perdi\n", NumCpu);
	}
	
    } // fim do método main
} // fim da classe ParImpar

/*	    Sair = ParImpar == 000;
	    if (!Sair) {
		System.out.printf("Digite
	    }
	} while (!Sair); */