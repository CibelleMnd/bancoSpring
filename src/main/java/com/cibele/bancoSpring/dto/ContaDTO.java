package com.cibele.bancoSpring.dto;

public class ContaDTO {

	private Long numero;
	private Double saldo;
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "ContaDTO [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	
}
