package com.nonatosantos.design.model;

public class ISS extends Imposto {

	private final double ISS = 0.06;

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * this.ISS + calculoOutroImposto(orcamento);
	}

}
