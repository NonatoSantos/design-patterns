package com.nonatosantos.design.model;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (usarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoOutroImposto(orcamento);
		}

	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean usarMaximaTaxacao(Orcamento orcamento);

}
