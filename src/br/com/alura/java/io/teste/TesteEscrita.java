package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Escrita de arquivo
		
		OutputStream fos = new FileOutputStream("lorem2.txt"); //entrada
		Writer osw = new OutputStreamWriter(fos); //bits/bytes em char
		BufferedWriter bw = new BufferedWriter(osw); //saída
		
		bw.write("Mussum Ipsum, cacilds vidis litro abertis. Praesent vel viverra nisi");
		bw.newLine();
		bw.newLine();
		bw.write("Mauris aliquet nunc non turpis scelerisque, eget.");
		
		bw.close();
	}

}
