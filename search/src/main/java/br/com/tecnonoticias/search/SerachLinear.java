package br.com.tecnonoticias.search;

import java.util.Arrays;

import br.com.tecnonoticias.listaLigada.Aluno;
import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;

public class SerachLinear {

	public int searchLinearInt(int[] vetor, int x) {
		int i = 0;

		while (i < vetor.length) {

			if (vetor[i] == x) {

				return i;

			}
			i++;
		}
		return -1;
	}

	private int searchLinearString(String[] vetor, String x) {

		int i = 0;

		while (i < vetor.length) {

			if (vetor[i].equals(x)) {
				return i;
			}
			i++;
		}

		return -1;
	}

	private int searchLinearObject(Object[] vetor, Object x) {

		int i = 0;

		while (i < vetor.length) {

			if (x.equals(vetor[i])) {

				return i;
			}

			i++;
		}

		return -1;
	}

	private int[] searchLinearMult(int[] vetor, int x) {

		int aux[];
		int i = 0;
		int j = 0;

		while (j < vetor.length) {
			if (vetor[j] == x) {
				i++;
			}
			j++;
		}
		aux = new int[i];
		i = 0;
		j = 0;

		while (j < vetor.length) {
			if (vetor[j] == x) {
				aux[i] = j;
				i++;
			}
			j++;
		}

		return aux;
	}

	public static void main(String[] args) {

		int[] vetor = new ManufacturingJumbledNumbers().jumbledNumbers(10);

		int[] number = new SerachLinear().searchLinearMult(vetor, 5);

		System.out.println(Arrays.toString(vetor));

		System.out.println(Arrays.toString(number));

		String[] vetorString = { "a", "b", "c", "e", "d" };

		int stringNumber = new SerachLinear().searchLinearString(vetorString, "c");

		System.out.println(Arrays.toString(vetorString));

		System.out.println(stringNumber);

		Aluno aluno = new Aluno();
		aluno.setNome("edgar");
		Aluno aluno1 = new Aluno();
		aluno1.setNome("victor");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("paula");

		Aluno alunoBusca = new Aluno();
		alunoBusca.setNome("edgar");

		Object[] vetorObject = { aluno, aluno1, aluno2 };

		int result = new SerachLinear().searchLinearObject(vetorObject, alunoBusca);

		System.out.println(Arrays.toString(vetorObject));

		System.out.println(result);

	}

}
