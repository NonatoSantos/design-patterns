package com.nonatosantos.design.model;

public class OrcamentoReprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcaçamento Reprovado não recebe desconto extra");

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Operação não permitida, Orçamento já reprovado não permite ser aprovado");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Operação não permitida, Orçamento já reprovado");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new OrcamentoFinalizado();

	}

}
