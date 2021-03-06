package me.br.classes;

import java.sql.Date;

public class Ex3Classes {
	public static class Conta {
		String nomeTitular;
		int numero;
		String agencia;
		float saldo;
		Date dataAbertura;
		float rendimentoCoeficiente;
		
		public Conta(String nomeTitular, int numero, String agencia, float saldo, Date dataAbertura) {
			this.nomeTitular = nomeTitular;
			this.numero = numero;
			this.agencia = agencia;
			this.saldo = saldo;
			this.dataAbertura = dataAbertura;
			rendimentoCoeficiente = .1f;
		}
		
		public void sacar(float v) {
			if (saldo < v) return;
			this.depositar(-v);
		}
		
		public void depositar(float v) {
			saldo += v;
		}
		
		public float calculaRendimento() {
			return saldo * rendimentoCoeficiente; 
		}
		
	}
}
