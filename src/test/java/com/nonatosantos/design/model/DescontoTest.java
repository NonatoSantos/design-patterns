package com.nonatosantos.design.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescontoTest {

	@Test
	public void testaDesconto() {
		Orcamento orcamento = new Orcamento(1150.00);
		orcamento.adicionaItem(new Item("DVD", 250.00));
		orcamento.adicionaItem(new Item("Televisor", 900.00));
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		assertTrue(calculador.calcula(orcamento) == 115.00);
		assertTrue(orcamento.getItens().size() <= 5);
		assertTrue(orcamento.getValor() > 500.00);
	}

}
