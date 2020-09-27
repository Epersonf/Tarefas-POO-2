import java.awt.Color;

import me.br.classes.Ex4And5Classes.Porta;

public class Ex4 {
	
	/*Crie uma porta, abra e feche a mesma, pinte-a de diversas cores,
	 * altere suas dimensões e use o método
	 * estaAberta para verificar se ela está aberta.
	*/
	
	public static void main(String[] args) {
		Porta porta = new Porta(Color.blue, new float[] {35, 100, 2});
		porta.toogle();
		porta.toogle();
		Color[] cores = {Color.black, Color.cyan, Color.green};
		for (Color c : cores)
			porta.pintar(c);
		porta.setarDimensoes(new float[] {40, 200, 10});
		System.out.println(porta.estaAberta());
	}
	
}
