package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas (1).csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String conta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String formatado = String.format(Locale.US, "Conta: %s - %04d-%04d, Titular: %s: %08.2f", 
												conta, agencia, numero, titular, saldo);
			
			System.out.println(formatado);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			linhaScanner.close();
		
		};
		scanner.close();
	}
}
