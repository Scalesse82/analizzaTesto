package it.scalesse.service;

public class Conta {
	
	
	public static int contaVocali(String frase) {
		
		int numeroVocali=0;
		String testo=frase.toLowerCase().replaceAll(" ", "");
		for (int i = 0; i < testo.length(); i++) {			
			if(testo.charAt(i) =='a' || testo.charAt(i) =='e' || testo.charAt(i) =='i' || 
					testo.charAt(i) =='o' || testo.charAt(i) =='u') {
				numeroVocali++;				
			}			
		}		
		return numeroVocali;
		}
	
	
	public static int contaConsonanti(String frase) {
		
		
		return frase.length()-contaVocali(frase);
		
	}

}
