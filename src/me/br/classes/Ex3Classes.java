package me.br.classes;

import java.sql.Date;

public class Ex3Classes {
	public static class Conta {
		String nomeTitular;
		int numero;
		String agencia;
		float saldo;
		Date dataAbertura;
		
		Conta(String nomeTitular, int numero, String agencia, float saldo, Date dataAbertura) {
			this.nomeTitular = nomeTitular;
			this.numero = numero;
			this.agencia = agencia;
			this.saldo = saldo;
			this.dataAbertura = dataAbertura;
		}
		
		public void sacar(float v) {
			if (saldo < v) return;
			this.depositar(-v);
		}
		
		public void depositar(float v) {
			saldo += v;
		}
		
		public void calculaRendimento() {
			saldo += saldo * 0.13f/100; 
		}
		
	}
}
