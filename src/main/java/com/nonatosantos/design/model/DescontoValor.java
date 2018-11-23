package com.nonatosantos.design.model;

public class DescontoValor implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.00) {
			return orcamento.getValor() * 0.10;
		} else {
			return proximo.desconta(orcamento);
		}

	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;

	}

}
