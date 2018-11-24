package com.nonatosantos.design.recursos;

import com.nonatosantos.design.model.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf){
		System.out.println("Email enviado");
		
	}

}
