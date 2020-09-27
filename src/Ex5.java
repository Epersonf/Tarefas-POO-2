import me.br.classes.Ex4And5Classes.Casa;

public class Ex5 {
	
	/*
	 * Crie uma casa e pinte-a.
	 * Crie três portas e coloque-as na casa;
	 * 		abra e feche as mesmas como desejar.
	 * Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Casa casa = new Casa(3);
		casa.pegarPorta(2).toogle();
		System.out.println(casa.quantasPortasEstaoAbertas());
	}
	
}
