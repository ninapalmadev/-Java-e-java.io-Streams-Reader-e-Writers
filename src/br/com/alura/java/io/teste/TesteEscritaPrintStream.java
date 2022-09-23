package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Escrita de arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); //saída
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
 		
		ps.println("Mussum Ipsum, cacilds vidis litro abertis. Praesent vel viverra nisi");
		ps.println();
		ps.println(); //o out se torna a mesma coisa que o ps
		ps.println();
		ps.println();
		ps.println("Mauris aliquet nunc non turpis scelerisque, eget.");
		ps.close();
	}
}
