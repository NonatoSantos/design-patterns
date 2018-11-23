package com.nonatosantos.design.model;

public class ICMS implements Imposto {

	private final double ICMS = 0.10;

	@Override
	public double calcula(Orcamento orcamento) {

		return orcamento.getValor() * this.ICMS;
	}

}
