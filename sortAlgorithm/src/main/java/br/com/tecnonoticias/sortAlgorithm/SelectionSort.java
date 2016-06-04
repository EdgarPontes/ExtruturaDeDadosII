package br.com.tecnonoticias.sortAlgorithm;

import java.util.Arrays;

import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;

public class SelectionSort {

	private static void selectSort(int[] vetor) {

		for (int i = 0; i < vetor.length; i++) {

			int menor = i;

			for (int j = i + 1; j < vetor.length; j++) {

				if (vetor[j] < vetor[menor]) {

					menor = j;

				}
			}
			if (menor != i) {

				int aux = vetor[i];

				vetor[i] = vetor[menor];

				vetor[menor] = aux;
			}
		}
	}

	public static void main(String[] args) {

		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();

		int[] vetor = numbers.jumbledNumbers(10);

		System.out.println(Arrays.toString(vetor));

		selectSort(vetor);
		
		System.out.println();
		
		for ( int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}