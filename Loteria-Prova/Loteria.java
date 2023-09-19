/*
 * Loteria.java
 *
 * Classe que executa o programa e verifica o vencedor.
 */

public class Loteria {
    private static final int QTDE_DEZENAS = 6;
    private static final int MENOR_DEZENA = 1;
    private static final int MAIOR_DEZENA = 60;

    public static void main(String[] args) {
	// Item 1
	Jogador j = new Jogador();
	j.apostar(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA);

	// Item 2
	int[] s = Sorteio.sortear(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA);
	System.out.print("Números sorteados: ");
	for(int i = 0; i < s.length; i++) {
	   System.out.printf("%d ", s[i]);
	}
	System.out.println();

	// Item 3
	int[] a = j.getAposta();
	int acertos = 0;
	for(int i = 0; i < s.length; i++) {
	   for(int k = 0; k < s.length; k++) {
		if (s[i] == a[k]) {
		   acertos++; // acertos = acertos+1
		}
	   }
	}

	// Item 4 e 5
	if (acertos >=5) {
	   System.out.printf("Você ganhou! Você acertou %d dezenas.\n", acertos);
	} else {
	   System.out.printf("Sinto muito! Não foi desta vez. Você acertou %d dezenas.\n", acertos);   
	}


    } // fim do método main
    
} // fim da classe Loteria
