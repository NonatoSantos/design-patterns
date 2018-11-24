package com.nonatosantos.design.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void test() {
		Orcamento orcamento = new Orcamento(850.00);
		orcamento.adicionaItem(new Item("MONITOR 14", 400.00));
		orcamento.adicionaItem(new Item("MONITOR 15", 450.00));

		assertTrue(orcamento.getValor() == 850.00);
		orcamento.estadoAtual = new OrcamentoAprovado();
		orcamento.aplicaDescontoExtra();
		assertFalse(orcamento.getValor() == 850.00);
		assertTrue(orcamento.getValor() == 833.00);

	}

}
