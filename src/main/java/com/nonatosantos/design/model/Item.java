package com.nonatosantos.design.model;

public class Item {

	private Double valor;
	private String nome;

	public Item(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;

	}

	public Double getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}

}
