package com.nonatosantos.design.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateDeImpostoCondicionalTest {

	@Test
	public void test() {
		Orcamento orcamento = new Orcamento(850.00);
		orcamento.adicionaItem(new Item("MONITOR 14", 400.00));
		orcamento.adicionaItem(new Item("MONITOR 15", 450.00));
		TemplateDeImpostoCondicional calculador = new ICPP();
		TemplateDeImpostoCondicional calculadorIKCV = new IKCV();
		
		assertTrue(calculadorIKCV.calcula(orcamento)==85.00);
		assertTrue(calculador.calcula(orcamento)==59.50000000000001);
		
	}

}
