package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura2 {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com arquivo
		
		InputStream fis = new FileInputStream("lorem.txt"); //entrada
		Reader isr = new InputStreamReader(fis); //bits/bytes em char
		BufferedReader br = new BufferedReader(isr); //saída
		
		String linha = br.readLine(); 
		
		while ( linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();
	}

}
