package br.com.tecnonoticias.BubbleSort;

public class BubbleSort {

	public BubbleSort(int[] vetor) {
		int aux;

		for (int i = vetor.length - 1; i >= 1; i--) {

			for (int j = 0; j < i; j++) {

				if (vetor[j] > vetor[j + 1]) {

					aux = vetor[j];

					vetor[j] = vetor[j + 1];

					vetor[j + 1] = aux;

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] vetor = { 9, 2, 5, 3, 7, 8, 4, 6, 1 };

		new BubbleSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");

		}
	}
}