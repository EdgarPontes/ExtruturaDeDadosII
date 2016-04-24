package br.com.tecnonoticias.escreverNumero.SelectSort;

public class SelectSort {

	public void selectSort() {
		int[] sort = { 8, 5, 3, 7, 1, 4 };

		for (int i = 0; i < sort.length ; i++) {

			int menor = i;

			for (int j = i + 1; j < sort.length; j++) {
			
				if (sort[j] < sort[menor]) {
			
					menor = j;
					
				}
			}
			if (menor != i) {
				
				int aux = sort[i];
				
				sort[i] = sort[menor];
				
				sort[menor] = aux;
			}
			System.out.println(sort[i]);
		}
	}

	public static void main(String[] args) {
		new SelectSort().selectSort();
	}
}