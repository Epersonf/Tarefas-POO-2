import me.br.classes.Ex4And5Classes.Casa;

public class Ex5 {
	
	/*
	 * Crie uma casa e pinte-a.
	 * Crie tr�s portas e coloque-as na casa;
	 * 		abra e feche as mesmas como desejar.
	 * Utilize o m�todo quantasPortasEstaoAbertas para imprimir o n�mero de portas abertas
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Casa casa = new Casa(3);
		casa.pegarPorta(2).toogle();
		System.out.println(casa.quantasPortasEstaoAbertas());
	}
	
}
