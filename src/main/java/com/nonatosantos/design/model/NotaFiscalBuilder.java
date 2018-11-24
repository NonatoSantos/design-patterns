package com.nonatosantos.design.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.nonatosantos.design.recursos.AcaoAposGerarNota;

public class NotaFiscalBuilder {
	private final double TARIFA_IMPOSTO = 0.05;

	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;

	private List<AcaoAposGerarNota> executaAcoes;

	public NotaFiscalBuilder() {
		this.executaAcoes = new ArrayList<AcaoAposGerarNota>();
	}

	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.executaAcoes.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;

	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;

	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * TARIFA_IMPOSTO;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;

	}

	public NotaFiscalBuilder dataNota() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscal emiteNf() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		for (AcaoAposGerarNota acoes : executaAcoes) {
			acoes.executa(nf);
		}

		return nf;
	}

}
