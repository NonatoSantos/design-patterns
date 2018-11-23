package com.nonatosantos.design.model;

public class DescontoQuantidade implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {

		if (orcamento.getItens().size() > 5) {
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
