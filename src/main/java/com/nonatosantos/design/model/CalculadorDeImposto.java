package com.nonatosantos.design.model;

public class CalculadorDeImposto {
	
	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		return valorImposto;
	}

}
