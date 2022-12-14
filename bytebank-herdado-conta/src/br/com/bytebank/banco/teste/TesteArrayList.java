package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new Vector<Conta>(); //thread safe
		
		Conta cc = new ContaCorrente(1, 22);
		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(1, 221);
		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(1, 221);
		
		lista.add(cc3);
		
		int tamanho = lista.size();
		System.out.println(tamanho);
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
	}

}
