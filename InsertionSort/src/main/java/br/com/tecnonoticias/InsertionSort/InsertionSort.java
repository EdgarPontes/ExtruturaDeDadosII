package br.com.tecnonoticias.InsertionSort;

import java.util.Arrays;

import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;

public class InsertionSort {
	
	private static void ordenarInsertionSort(int[] vetor){
		
		int eleito;
		int j ;
		int i;
		
		for ( i = 1; i < vetor.length; i++) {
			
			eleito = vetor[i];
			
			for ( j = i; (j > 0) && (vetor[j - 1] > eleito); j--) {

				vetor[j] = vetor[j - 1];
			}
			vetor[j] = eleito;
			
		}
		
	}

	public static void main(String[] args) {

		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();
		
		int[] vetor = numbers.jumbledNumbers(10);
		
		System.out.println(Arrays.toString(vetor));
		
		ordenarInsertionSort(vetor);
		
		System.out.println();
		for ( int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}