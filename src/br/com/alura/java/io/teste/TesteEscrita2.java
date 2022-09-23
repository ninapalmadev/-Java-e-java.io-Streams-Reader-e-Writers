package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Escrita de arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); //saída
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Mussum Ipsum, cacilds vidis litro abertis. Praesent vel viverra nisi");
		bw.newLine();
		bw.newLine();
		bw.write("Mauris aliquet nunc non turpis scelerisque, eget.");
		
		bw.close();
	}
}
