package me.br.classes;

import java.awt.Color;

public class Ex4And5Classes {
	
	public static class Casa {
		Porta[] portas;
		
		public Casa(int doorAmt) {
			portas = Porta.criarPortas(doorAmt);
		}
		
		public Porta pegarPorta(int index) {
			index = index % portas.length;
			return portas[index];
		}
		
		public int quantasPortasEstaoAbertas() {
			int sum = 0;
			for (Porta p : portas)
				if (p.aberta) sum++;
			return sum;
		}
	}
	
	public static class Porta {
		
		private Color cor = Color.red;
		private boolean aberta = false;
		private float[] dimensoes = {20, 100, 1};
		
		public Porta(Color cor, float[] dimensoes) {
			this.cor = cor;
			this.dimensoes = dimensoes;
		}
		
		public void setarDimensoes(float[] dimensoes) {
			this.dimensoes = dimensoes;
		}
		
		public float[] pegarDimensoes() {
			return dimensoes.clone();
		}
		
		public void pintar(Color cor) {
			this.cor = cor;
		}
		
		public Color pegarCor() {
			return cor;
		}
		
		public void toogle() {
			aberta = !aberta;
		}
		
		public void toogle(boolean v) {
			aberta = v;
		}
		
		public boolean estaAberta() {
			return aberta;
		}
		
		public static Porta[] criarPortas(int doorAmt) {
			Porta[] p = new Porta[doorAmt];
			for (int i = 0; i < p.length; i++)
				p[i] = new Porta(Color.red, new float[] {20, 90, 1});
			return p;
		}
	}
}
