package com.nonatosantos.design.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImpostoTest {

	@Test
	public void testICMS() {
		Orcamento orcamento = new Orcamento(500.00);
		Imposto icms = new ICMS();
		CalculadorDeImposto calculador = new CalculadorDeImposto();

		assertTrue(calculador.realizaCalculo(orcamento, icms) == 50.00);

	}

	@Test
	public void testaISS() {
		Orcamento orcamento = new Orcamento(500.00);
		Imposto iss = new ISS();
		CalculadorDeImposto calculador = new CalculadorDeImposto();

		assertTrue(calculador.realizaCalculo(orcamento, iss) == 30.00);
	}

}
