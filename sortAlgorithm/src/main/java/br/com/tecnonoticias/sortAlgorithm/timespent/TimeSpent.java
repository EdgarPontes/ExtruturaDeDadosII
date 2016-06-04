package br.com.tecnonoticias.sortAlgorithm.timespent;

public class TimeSpent {
	
	public String starTime(){
		
		long startTime = System.currentTimeMillis();
		
//		Object segundos = ( startTime / 1000 ) % 60;      // se não precisar de segundos, basta remover esta linha.
		Object minutos = ( startTime / 60000 ) % 60;     // 60000   = 60 * 1000
		Object horas = startTime / 3600000;            // 3600000 = 60 * 60 * 1000
		System.out.println( String.format( "%03d:%02d", horas, minutos ) );
		
		return String.format( "%03d:", ( startTime / 1000 ) % 60 );
		
	}

}
