package me.br.classes;

public class Ex6Classes {
	
	public enum LampStates {
		APAGADA,
		MEIALUZ,
		ACESA
	}
	
	public static class Lampada {
		private LampStates state;
		
		public Lampada(LampStates state) {
			setState(state);
		}
		
		public LampStates getState() {
			return state;
		}
		
		public void setState(LampStates state) {
			this.state = state;
		}
		
		public boolean estaLigada() {
			return state != LampStates.APAGADA;
		}
	}
	
}
