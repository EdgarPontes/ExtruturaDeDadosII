package br.com.tecnonoticias.QuickSort;

import java.util.Arrays;

import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;

public class QuickSort {

	static void ordenar(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int posicaoPivo = Separar(vetor, inicio, fim);
			ordenar(vetor, inicio, posicaoPivo - 1);
			ordenar(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int Separar(int[] vetor, int inicio, int fim) {

		int pivo = vetor[inicio];
		for (int i = inicio + 1; i <= fim;) {
			if (vetor[i] <= pivo) {
				i++;
			} else if (pivo < vetor[fim]) {
				fim--;
			} else {
				int troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}

	public static void main(String[] args) {
		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();
		
		int[] vetor = numbers.jumbledNumbers(100);
		
		System.out.println(Arrays.toString(vetor));
		
		ordenar(vetor, 0, vetor.length - 1);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}