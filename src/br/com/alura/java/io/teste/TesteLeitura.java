package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com arquivo
		
		FileInputStream fis = new FileInputStream("lorem.txt"); //entrada
		InputStreamReader isr = new InputStreamReader(fis); //bits/bytes em char
		BufferedReader br = new BufferedReader(isr); //
		
		String linha = br.readLine(); 
		
		while ( linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();
	}

}
