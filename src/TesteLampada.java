import me.br.classes.Ex6Classes.LampStates;
import me.br.classes.Ex6Classes.Lampada;

public class TesteLampada {
	
	public static void main(String[] args) {
		Lampada[] lamps = {new Lampada(LampStates.ACESA), new Lampada(LampStates.APAGADA)};
		for (Lampada l : lamps)
			System.out.println("Lampada ligada: " + l.estaLigada());
	}
}
