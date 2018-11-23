package com.nonatosantos.design.model;

public class ISS implements Imposto {

	private final double ISS = 0.06;

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * this.ISS;
	}

}
