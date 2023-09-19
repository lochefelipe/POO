/* RandomArray.java
Script para ordenar array com 10 posições e valores aleatórios*/

import java.util.Random;

public class RandomArray {
	public static void main (String[] args) {

	int[] a = new int[10];
	Random random = new Random();

	for(int i=0; i < a.length; i++){
	   a[i] = random.nextInt(100);
	}

	int j = 0;
	while(j < a.length) {
	   System.out.printf("%d, ", a[j]);
	   j++;
	}
	System.out.println();

	for (int i = 0; i < a.length; i++) {
	   for (j = 0; j < a.length; j++) {		
		if (a[i] > a[j] && i > j) {
		   int tmp = a[i];
		   a[i] = a[j];
		   a[j] = tmp;
		}
	   }
	}
	
	for (int valor : a) {
	   System.out.printf("%d, ", valor);
	}

     } //Final do método Main
} //Final da class RandomArray

// Ordem decrescente 