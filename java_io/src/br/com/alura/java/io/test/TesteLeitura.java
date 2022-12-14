package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo.		
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis); //transformando bytes em caracteres
		BufferedReader br = new BufferedReader(isr); //para ler uma linha 
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);	
			linha = br.readLine();
		}
			
		br.close();
	}

}
