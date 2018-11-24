package com.nonatosantos.design.model;

public class ICMS extends Imposto {

	private final double ICMS = 0.10;

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {
	}

	@Override
	public double calcula(Orcamento orcamento) {

		return orcamento.getValor() * this.ICMS + calculoOutroImposto(orcamento);
	}

}
