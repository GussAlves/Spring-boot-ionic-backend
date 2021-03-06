package com.gussalves.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gussalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoBoleto extends Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataVencimento;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataPagamento;
	
	public PagamentoBoleto() {
	}

	public PagamentoBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
				Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
		
}
