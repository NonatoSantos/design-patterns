package com.nonatosantos.design.model;

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		
		Desconto desconto1 = new DescontoQuantidade();
		Desconto desconto2 = new DescontoValor();
		Desconto desconto3 = new SemDesconto();
		
		desconto1.setProximoDesconto(desconto2);
		desconto2.setProximoDesconto(desconto3);
		
		return desconto1.desconta(orcamento);
		
	}
	

	


}
