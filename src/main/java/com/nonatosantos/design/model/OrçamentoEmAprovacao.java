package com.nonatosantos.design.model;

public class OrçamentoEmAprovacao implements EstadoOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Operação não pertimida, Orçamento já foi aprovado");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Operação não permitida, Orçamento Reprovado não pode ser aprovado");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new OrcamentoFinalizado();

	}

}
