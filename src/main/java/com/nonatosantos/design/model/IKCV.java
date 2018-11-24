package com.nonatosantos.design.model;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {

		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean usarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 100 && conterItemValorMaiorCem(orcamento);
	}

	private boolean conterItemValorMaiorCem(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100.00)
				return true;
		}
		return false;
	}

}
