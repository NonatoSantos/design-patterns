package com.nonatosantos.design.model;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximoDesconto(Desconto proximo);

}
