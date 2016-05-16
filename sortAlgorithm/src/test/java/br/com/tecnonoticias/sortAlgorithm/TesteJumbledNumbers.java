package br.com.tecnonoticias.sortAlgorithm;

import java.util.Arrays;

import br.com.tecnonoticias.sortAlgorithm.numbers.ManufacturingJumbledNumbers;
import junit.framework.TestCase;

public class TesteJumbledNumbers extends TestCase{
	
	public void testeJumbledNumbers(){
		
		ManufacturingJumbledNumbers numbers = new ManufacturingJumbledNumbers();
		
		int[] numbersTest = numbers.jumbledNumbers(2);
		
		int[] testNumbers = {0,1};
		
		assertTrue(Arrays.equals(testNumbers, numbersTest));

	}

}
