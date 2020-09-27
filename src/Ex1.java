import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	
	//Faca um programa de agenda telefonica, com as classes Agenda e Contato
	
	static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	static class Agenda {
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		public void addContato(Contato c) {			
			for (int i = 0; i < contatos.size(); i++) {
				char one = c.nome.toCharArray()[0];
				char two = contatos.get(i).nome.toCharArray()[0];
				if (getKeyIndex(one) < getKeyIndex(two)) {
					contatos.add(i, c);
					return;
				}
			}
			
			contatos.add(c);
		}
		
		private int getKeyIndex(char key) {
			char k = Character.toLowerCase(key);
			for (int i = 0; i < alphabet.length; i++)
				if (alphabet[i] == k)
					return i;
			return -1;
		}
		
		public void mostrarAgenda() {
			for (Contato e : contatos)
				e.mostrar();
		}
	}
	
	static class Contato {
		String nome;
		String telefone;
		
		Contato(String nome, String telefone) {
			this.nome = nome;
			this.telefone = telefone;
		}
		
		public void mostrar() {
			System.out.println(nome + ": " + telefone);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		System.out.println("Quantos contatos deseja adicionar?");
		int amt = scan.nextInt();
		for (int i = 0; i < amt; i++) {
			System.out.println("Digite o nome:");
			String name = scan.next();
			System.out.println("Digite o telefone:");
			String telefone = scan.next();
			agenda.addContato(new Contato(name, telefone));
		}
		
		System.out.println("\nAgenda: ");
		agenda.mostrarAgenda();		
		scan.close();
	}
	
}
