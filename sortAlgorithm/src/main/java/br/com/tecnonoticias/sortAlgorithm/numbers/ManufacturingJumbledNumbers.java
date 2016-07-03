package br.com.tecnonoticias.sortAlgorithm.numbers;

public class ManufacturingJumbledNumbers {
	
	public int[] jumbledNumbers(int length){
		
		int vetor[] = new int[length];
		
		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] = (int) (Math.random() * length);
			
		}
		
		return vetor;
		
	}
	public int[] orderNumbers(int number){
		
		int[] vetor = new int[number];
		
		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] = i+1;
		}
		return vetor;
	}

}