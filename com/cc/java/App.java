package com.cc.java;

public class App {
	
	public static void main(String[] args) {
		
		Double startTime = Timer.timerOn();

		RechnerInst rechnerInst = new RechnerInst();
		
			ausgabe("Ergebnis: " + rechnerInst.summe(1, 1));
			ausgabe("Ergebnis: " + rechnerInst.differenz(5, 1));
			ausgabe("Ergebnis: " + rechnerInst.produkt(2, 3));
			ausgabe("Ergebnis: " + rechnerInst.quotient(2, 4));
	
			Double stoppTime = Timer.timerOut();

		System.out.println("Laufzeit = " + Timer.result(startTime, stoppTime) + " ms");

		
		// ausgabe("-------------------------");

		startTime = Timer.timerOn();

		String preStr = "Das statische Ergebnis ist: ";

		ausgabe(preStr + RechnerStat.summe(1, 1));
		ausgabe(preStr + RechnerStat.differenz(5, 1));
		ausgabe(preStr + RechnerStat.produkt(2, 3));
		ausgabe(preStr + RechnerStat.quotient(2, 4));
		
		// ausgabe(preStr + Math.PI);

		stoppTime = Timer.timerOut();
		
		System.out.println("Laufzeit = " + Timer.result(startTime, stoppTime) + " ms");
	
	}

	static void ausgabe(String outStr){
		System.out.println(outStr);
		
	}
	
	
} // EoC
