package com.nonatosantos.design.model;

public class OrcamentoAprovado implements EstadoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new OrcamentoAprovado();

	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new OrcamentoReprovado();

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException(
				"Operação não permitida. Orçamento só pode ser finalizado pela aprovação ou reprovação");

	}

}
