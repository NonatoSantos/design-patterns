package com.nonatosantos.design.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadorDeImpostoTest {

	@Test
	public void test() {
		Orcamento orcamento = new Orcamento(850.00);
		orcamento.adicionaItem(new Item("MONITOR 14", 400.00));
		orcamento.adicionaItem(new Item("MONITOR 15", 450.00));
		Imposto impostoICPP = new ICPP();
		Imposto impostoComposto = new ISS(new ICMS());

		assertTrue(impostoComposto.calcula(orcamento) == 136.00);
		assertTrue(impostoICPP.calcula(orcamento) == 59.50000000000001);
	}

}
