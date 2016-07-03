package br.com.tecnonoticias.sortAlgorithm;

import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;
import br.com.tecnonoticias.sortAlgorithm.timespent.TimeSpent;

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
//		int[] vetor = { 9, 2, 5, 3, 7, 8, 4, 6, 1 };
		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();
		
		int[] vetor = numbers.jumbledNumbers(100);
			
			System.out.println("Vetor sem ordenação: ");
			
		for (int i : vetor) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Tempo inicial em segundos: " + new TimeSpent().starTime());
		
		new BubbleSort(vetor);
		
		System.out.println("Tempo inicial em segundos: " + new TimeSpent().starTime());
		System.out.println();
		System.out.println("Vetor com ordenação: ");
	
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");

		}
	}
}