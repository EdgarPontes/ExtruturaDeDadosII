package br.com.tecnonoticias.escreverNumero.EscreverNumero;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EscreveNumero {

	private static final int MILHAR = 4;
	private static final int CENTENA = 3;
	private static final int DEZENA = 2;
	private static final int UNIDADE = 1;

	int[] cem = { 1, 0, 0 };
	
	private String[] unidade = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
			"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };

	private String[] dezena = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta",
			"noventa" };

	private String[] centena = { "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
			"setecentos", "oitocentos", "novecentos" };
	
	private String[] milhar = { "mil", "milhão", "bilhão", "trilhão" };

	@SuppressWarnings("resource")
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero! ");
		Integer numero = sc.nextInt();
		int[] tamanho = quebraNumero(numero);

		String imprimi = numeroZeroTotal(numero);

		if (numero == 100) {

			imprimirResultado("Cem");

		} else if(numero == 0){
			imprimirResultado("Zero");
			
		}else if (numero % 100 == 0) {

			imprimirResultado(imprimi);

		} else if (tamanho.length == MILHAR) {

			imprimirResultado(imprimiMilhar(ordenaArray(quebraNumero(numero)), separaCentena(numero)));

		}else if (tamanho.length == CENTENA) {

			imprimirResultado(imprimi(ordenaArray(quebraNumero(numero)), separaCentena(numero)));

		} else if (tamanho.length == DEZENA) {

			imprimirResultado(imprimiDezena(ordenaArray(quebraNumero(numero))));

		} else {

			imprimirResultado(imprimiUnidade(quebraNumero(numero)));
		}
	}

	public void imprimirResultado(String retorno) {

		JOptionPane.showMessageDialog(null, retorno, "Numeros por extenso", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	public String numeroZeroTotal(int zero) {
		int[] numero = quebraNumero(zero);
		String centenaImprimi = "";

		for (int i = 0; i < centena.length; i++) {
			if (numero[0] == i) {
				centenaImprimi = centena[i];
			}
		}
		return centenaImprimi;
	}

	public String numeroZero(Integer zero) {

		if (zero.equals(cem)) {
			System.out.println("cem");
		}
		return "cem";

	}

	public Integer separaCentena(Integer numero) {

		int sobra = numero % 100;

		System.out.println(sobra);

		return sobra;
	}
	
	public String imprimiMilhar(int[] numeroImprimiMilhar, Integer numeroRecebe) {
		String M = "";
		String C = "";
		String D = "";
		String U = "";

		if (numeroImprimiMilhar.length >= MILHAR) {
			for (int i = 0; i < centena.length; i++) {
				if (numeroRecebe % 100 == 0) {
					
					if (numeroImprimiMilhar[0] == i) {
						M = unidade[i]+" "+milhar[0];
					}					
				}else{
					if (numeroImprimiMilhar[0] == i) {
						M = unidade[i]+" "+milhar[0] + " e ";
					}		
					if (numeroImprimiMilhar[1] == i) {
						C = centena[i] + " e ";
					}
					if (numeroRecebe >= 10 && numeroRecebe < 20) {
						if (numeroImprimiMilhar[2] == i ) {
							U += unidade[10+i];
						}
					} else if (numeroImprimiMilhar[2] == i) {
						D += dezena[i] + " e ";
						
					} else if (numeroImprimiMilhar[3] == i) {
						U += unidade[i];
					}
				}
			}
		}
		return M + C + D + U;
	}

	public String imprimi(int[] numeroImprimiCentena, Integer numeroRecebe) {
		String C = "";
		String D = "";
		String U = "";

		if (numeroImprimiCentena.length <= CENTENA) {
			for (int i = 0; i < centena.length; i++) {
				if (numeroImprimiCentena[0] == i) {
					C = centena[i] + " e ";
				}
				if (numeroRecebe >= 10 && numeroRecebe < 20) {
					if (numeroImprimiCentena[1] == i ) {
						U += unidade[10+i];
					}
				} else if (numeroImprimiCentena[1] == i) {
					D += dezena[i] + " e ";
					
				} else if (numeroImprimiCentena[2] == i) {
					U += unidade[i];
				}
			}
		}
		return C + D + U;
	}

	public String imprimiDezena(int[] numeroImprimiDezena) {
		String D = "";
		String U = " e ";

		if (numeroImprimiDezena.length <= DEZENA) {
			for (int i = 0; i < dezena.length; i++) {
				if (numeroImprimiDezena[0] == i) {
					D += dezena[i];
				}
				if (numeroImprimiDezena[1] == i) {
					U += unidade[i];
				}
			}
		}
		return D + U;
	}

	public String imprimiUnidade(int[] numeroImprimiUnidade) {
		String U = "";
		if (numeroImprimiUnidade.length <= UNIDADE) {
			for (int i = 0; i < unidade.length; i++) {
				if (numeroImprimiUnidade[0] == i) {
					U = unidade[i];
				}
			}
		}
		return U;
	}

	public int[] quebraNumero(int test) {

		String[] x = String.valueOf(test).split("")	;
		int[] retornaArray = new int[x.length - 1];

		for (int i = 0; i < x.length - 1; i++) {
			retornaArray[i] = Integer.parseInt(x[i + 1]);
		}
		return retornaArray;
	}

	public int[] ordenaArray(int[] valor) {
		int auxiliar = 0;

		for (int i = valor.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (valor[j] < valor[j + 1]) {
					auxiliar = valor[j];
					valor[j] = valor[j + 1];
					valor[j + 1] = auxiliar;
				}
			}
		}
		return valor;
	}

	public int[] retornaNumeroLiterario(int numero) {

		int[] nliterario = ordenaArray(quebraNumero(numero));
		return nliterario;
	}
}
