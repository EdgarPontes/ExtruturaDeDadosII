package br.com.tecnonoticias.QuickSort;

import java.util.Arrays;

import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;

public class QuickSort {

	public static void ordenar(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int posicaoPivo = Separar(vetor, inicio, fim);
			ordenar(vetor, inicio, posicaoPivo - 1);
			ordenar(vetor, posicaoPivo + 1, fim);
		}
	}

	public static int Separar(int[] vetor, int inicio, int fim) {

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
	
	public void ordenarString(String[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separarString(vetor, inicio, fim);
			if (posicaoPivo == fim) {
				posicaoPivo--;
			}
			ordenarString(vetor, inicio, posicaoPivo);
			ordenarString(vetor, posicaoPivo + 1, fim);
		}
	}

	public int separarString(String[] vetor, int inicio, int fim) {
		String pivot = vetor[inicio];
		int lo = inicio;
		int hi = fim;

		while (true) {
			while (vetor[hi].compareTo(pivot) >= 0 && lo < hi) {
				hi--;
			}
			while (vetor[lo].compareTo(pivot) < 0 && lo < hi) {
				lo++;
			}
			if (lo < hi) {
				String T = vetor[lo];
				vetor[lo] = vetor[hi];
				vetor[hi] = T;
			} else
				return hi;
		}
	}

	public static void main(String[] args) {
		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();

		int[] vetor = numbers.jumbledNumbers(100);
		
		System.out.println("Vetor sem ordenação: ");
		System.out.println(Arrays.toString(vetor));

		ordenar(vetor, 0, vetor.length - 1);
		
		System.out.println("Vetor já ordenação: ");
		System.out.println(Arrays.toString(vetor));
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.print(vetor[i] + " ");
//		}
	}
}