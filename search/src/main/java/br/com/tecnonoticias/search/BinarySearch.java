package br.com.tecnonoticias.search;

public class BinarySearch {
	
	public static String[] nameOrder(){
		
		String[] names = new String[100];
		
		names[0] = "Jurandir";
		names[1] = "jose";
		names[2] = "Miguel";
		names[3] = "Davi";
		names[4] = "Arthur";
		names[5] = "Pedro";
		names[6] = "Gabriel";
		names[7] = "Bernardo";
		names[8] = "Lucas";
		names[9] = "Matheus";
		names[10] = "Rafael";
		names[11] = "Heitor";
		names[12] = "Enzo";
		names[13] = "Guilherme";
		names[14] = "Nicolas";
		names[15] = "Lorenzo";
		names[16] = "Gustavo";
		names[17] = "Felipe";
		names[18] = "Samuel";
		names[19] = "João Pedro";
		names[20] = "Daniel";
		names[21] = "Vitor";
		names[22] = "Leonardo";
		names[23] = "Henrique";
		names[24] = "Theo";
		names[25] = "Murilo";
		names[26] = "Eduardo";
		names[27] = "Pedro Henrique";
		names[28] = "Pietro";
		names[29] = "Cauã";
		names[30] = "Isaac";
		names[31] = "Caio";
		names[32] = "Vinicius";
		names[33] = "Benjamin";
		names[34] = "João";
		names[35] = "Lucca";
		names[36] = "João Miguel";
		names[37] = "Bryan";
		names[38] = "Joaquim";
		names[39] = "João Vitor";
		names[40] = "Thiago";
		names[41] = "Antônio";
		names[42] = "Davi Lucas";
		names[43] = "Francisco";
		names[44] = "Enzo Gabriel";
		names[45] = "Bruno";
		names[46] = "Emanuel";
		names[47] = "Ian";
		names[48] = "Davi Luiz";
		names[49] = "Rodrigo";
		names[50] = "Otávio";
		names[51] = "Thomas";
		names[52] = "Benício";
		names[53] = "Erick";
		names[54] = "Nathan";
		names[55] = "Fernando";
		names[56] = "Yuri";
		names[57] = "Davi Lucca";
		names[58] = "Calebe";
		names[59] = "Thales";
		names[60] = "Vicente";
		names[61] = "João Guilherme";
		names[62] = "Vitor Hugo";
		names[63] = "Ryan";
		names[64] = "Breno";
		names[65] = "João Lucas";
		names[66] = "Luiz Felipe";
		names[67] = "Alexandre";
		names[68] = "Igor";
		names[69] = "Carlos Eduardo";
		names[70] = "Diego";
		names[71] = "Kaique";
		names[72] = "Fudeu";
		names[73] = "Fudeu de Novo";
		names[74] = "Yago";
		names[75] = "Pedro Lucas";
		names[76] = "Diogo";
		names[77] = "Luiz Gustavo";
		names[78] = "Luiz Miguel";
		names[79] = "Ricardo";
		names[80] = "Kauê";
		names[81] = "Luan";
		names[82] = "Luiz Henrique";
		names[83] = "Danilo";
		names[84] = "Marcelo";
		names[85] = "Gael";
		names[86] = "Juan";
		names[87] = "Enrico";
		names[88] = "Henry";
		names[89] = "Vitor Gabriel";
		names[90] = "João Paulo";
		names[91] = "Lucas Gabriel";
		names[92] = "Luiz Fernando";
		names[93] = "Luiz Otávio";
		names[94] = "Renan";
		names[95] = "Kevin";
		names[96] = "Kelvi";
		names[97] = "Snoop Dog";
		names[98] = "Shakira";
		names[99] = "Stefano";

		ordenarString(names, 0, names.length -1);;
		
		return names;
	}
	
	public static void ordenarString(String[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separarString(vetor, inicio, fim);
			if (posicaoPivo == fim) {
				posicaoPivo--;
			}
			ordenarString(vetor, inicio, posicaoPivo);
			ordenarString(vetor, posicaoPivo + 1, fim);
		}
	}

	public static int separarString(String[] vetor, int inicio, int fim) {
		String pivot = vetor[inicio];
		int init = inicio;
		int end = fim;

		while (true) {
			while (vetor[end].compareTo(pivot) >= 0 && init < end) {
				end--;
			}
			while (vetor[init].compareTo(pivot) < 0 && init < end) {
				init++;
			}
			if (init < end) {
				String T = vetor[init];
				vetor[init] = vetor[end];
				vetor[end] = T;
			} else
				return end;
		}
	}
	
	public static int binarySearch(int[] vetor , int number){
		
		int start = 0;
		int end = vetor.length - 1;
		int center ;
		
		while (start <= end) {
			
			center = (start + end) / 2;
			
			if (vetor[center] == number) 
				return center;
			else if (vetor[center] < number) 
				start = center + 1;
			else if (vetor[center] > number) 
				end = center - 1;
		
		}
		return -1;
	}
	
	public static int binarySearchString(String[] vetor , String name){
			
			int start = 0;
			int end = vetor.length - 1;
			int center ;
			
			while (start <= end) {
				
				center = (start + end) / 2;
				
				if (vetor[center] == name) 
					return center;
				else if (vetor[center].compareTo(name) < 0) 
					start = center + 1;
				else if (vetor[center].compareTo(name) > 0) 
					end = center - 1;
			
			}
			return -1;
		}
	
	public static void main(String[] args) {
		
		String[] vetor = nameOrder();
		
		int numberResult = binarySearchString(vetor, "Stefano");
		
		System.out.println(numberResult);
		
//		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();
//		
//		int[] vetor = numbers.orderNumbers(100);
//		
//		System.out.println(Arrays.toString(vetor));
//		
//		int nummberSerach = binarySearch(vetor, 101);
//		
//		System.out.println(nummberSerach);
	}

}