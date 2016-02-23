package br.com.tecnonoticias.escreverNumero.EscreverNumero;

import org.junit.Assert;
import org.junit.Test;

public class EscreveNumeroTeste {
	
	private int numeroScanner = 23;
	private int[] numeroMC = {  1, 5, 1, 1 };
	private int[] numeroM = {  1, 0, 0, 0 };
	private int[] numeroC = { 9, 5, 7 };
	private int[] numeroA = { 5, 1, 5 };
	private int[] numeroD = { 5, 7 };
	private int[] numeroU = { 7 };
	private int[] numeroUA = { 15 };
	
	private Integer zero = 100;
	private int zeroTotal = 900;
	EscreveNumero teste = new EscreveNumero();
	
	@Test
	public void separaCentenaTeste(){
		
		int retorno = teste.separaCentena(515);
		int esperado = 15;
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void numeroZeroCentenaTeste(){
		
		String retorno = teste.numeroZeroTotal(zeroTotal);
		String esperado = "novecentos";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void numeroZeroTeste(){
		
		String retorno = teste.numeroZero(zero);
		String esperado = "cem";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void numeroLiterarioTeste() {
	
		int[] retorno = teste.retornaNumeroLiterario(numeroScanner);
		int[] esperado = { 3, 2 };
		Assert.assertArrayEquals(esperado, retorno);
	}
	
	@Test
	public void receberValorUnidadeAltaTest() {
	
		String retorno = teste.imprimiUnidade(numeroUA);
		String esperado = "quinze";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void receberValorUnidadeTest() {

		String retorno = teste.imprimiUnidade(numeroU);
		String esperado = "sete";
		Assert.assertEquals(esperado, retorno);
	}

	@Test
	public void receberValorDezenaUnidadeTest() {

		String retorno = teste.imprimiDezena(numeroD);
		String esperado = "cinquenta e sete";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void receberCentenaDezenaUnidadeQuebradoTest() {

		String retorno = teste.imprimi(numeroA, teste.separaCentena(510));
		String esperado = "quinhentos e onze";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void receberMilharCentenaDezenaUnidadetrescasasTest() {

		String retorno = teste.imprimiMilhar(numeroMC, teste.separaCentena(1511));
		String esperado = "um mil e quinhentos e onze";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void receberMilharCentenaDezenaUnidadeTest() {

		String retorno = teste.imprimiMilhar(numeroM, teste.separaCentena(0));
		String esperado = "um mil";
		Assert.assertEquals(esperado, retorno);
	}
	
	@Test
	public void receberCentenaDezenaUnidadeTest() {

		String retorno = teste.imprimi(numeroC, teste.separaCentena(0));
		String esperado = "novecentos e cinquenta e sete";
		Assert.assertEquals(esperado, retorno);
	}

	@Test
	public void ordenaArrayTest() {

		int[] retorno = teste.ordenaArray(numeroC);
		int[] esperado = { 9, 7, 5 };
		Assert.assertArrayEquals(esperado, retorno);
	}

	@Test
	public void transformaInteiroEmArrayTest() {

		int numeroInformado = 579;
		int[] retorno = teste.quebraNumero(numeroInformado);
		int esperado[] = { 5, 7, 9 };
		Assert.assertArrayEquals(esperado, retorno);
	}

	@Test
	public void transformaInteiroEmArrayTest2() {

		int numeroInformado = 57;
		int[] retorno = teste.quebraNumero(numeroInformado);
		int esperado[] = { 5, 7 };
		Assert.assertArrayEquals(esperado, retorno);
	}
}
