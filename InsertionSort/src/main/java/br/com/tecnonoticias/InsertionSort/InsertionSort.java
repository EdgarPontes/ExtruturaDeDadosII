package br.com.tecnonoticias.InsertionSort;

public class InsertionSort {

	public static void main(String[] args) {

		int eleito;
		int j ;
		int i;
		
		int[] vetor = { 9, 3, 5, 1, 8, 4, 2, 6 };
		for (int k = 0; k < vetor.length; k++) {
			
			System.out.print(vetor[k]);
		}
		for ( i = 1; i < vetor.length; i++) {
			
			eleito = vetor[i];
			
			for ( j = i; (j > 0) && (vetor[j - 1] > eleito); j--) {

				vetor[j] = vetor[j - 1];
			}
			vetor[j] = eleito;
			
		}
		System.out.println();
		for ( i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}
	}
}