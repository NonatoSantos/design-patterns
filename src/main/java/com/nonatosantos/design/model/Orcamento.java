package com.nonatosantos.design.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	protected EstadoOrcamento estadoAtual;

	protected double valor;
	private final List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new OrçamentoEmAprovacao();

	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public double getValor() {
		return valor;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);

	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

}
