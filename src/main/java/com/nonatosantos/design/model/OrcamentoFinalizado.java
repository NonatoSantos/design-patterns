package com.nonatosantos.design.model;

public class OrcamentoFinalizado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Estado Finalizado não pode receber desconto");

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Operação não permitida, Orçamento já finalizado");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Operação não permitida, Orçamento já finalizado");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Operação não permitida, Orçamento já finalizado");

	}

}
