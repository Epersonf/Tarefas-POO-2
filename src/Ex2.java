import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	/*
		Crie uma pessoa, coloque seu nome e
	   	idade iniciais, faça alguns aniversários(aumentando a idade)
	    e imprima seu nome e sua idade.
	*/
	
	public static class Pessoa {
		String nome;
		int idade;

		Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		public void mostrarDados() {
			System.out.println("\nNome: " + nome);
			System.out.println("Idade: " + idade);
		}
		
		public void fazerAniversario() {
			System.out.println("Aniversario de " + nome + " realizado.");
			idade++;
		}
	}
	
	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja criar?");
		int pessoasQtd = scan.nextInt();
		for (int i = 0; i < pessoasQtd; i++) {
			System.out.println("\nDigite o nome da pessoa: ");
			String nome = scan.next();
			System.out.println("Digite a idade: ");
			int idade = scan.nextInt();
			pessoas.add(new Pessoa(nome, idade));
		}
		while (true) {
			System.out.println("Avancar o ano? (1 - sim / 0 - nao)");
			if (scan.nextInt() == 0) break;
			for (Pessoa p : pessoas)
				p.fazerAniversario();
		}
		for (Pessoa p : pessoas)
			p.mostrarDados();
		scan.close();
	}
}
