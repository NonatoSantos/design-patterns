package com.nonatosantos.design.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaFiscalBuilderTest {

	@Test
	public void test() {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("SYSTEM WEB LTDA")
		.comCnpj("01.002.003/0001-00")
		.comItem(new ItemDaNota("Item 1", 300.00))
		.comItem(new ItemDaNota("Item2", 400.00))
		.comObservacoes("Observe bem")
		.dataNota();
		NotaFiscal nf = builder.emiteNf();

		assertEquals(nf.getRazaoSocial(), "SYSTEM WEB LTDA");
		assertTrue(nf.getImpostos() == 35.00);
		assertTrue(nf.getValorBruto() == 700.00);
		assertTrue(nf.getItens().size() == 2);
		assertTrue(nf.getItens().get(0).getValor() == 300.00);
	}

}
