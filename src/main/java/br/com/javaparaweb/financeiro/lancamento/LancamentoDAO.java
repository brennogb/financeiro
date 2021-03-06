package br.com.javaparaweb.financeiro.lancamento;

import java.util.Date;
import java.util.List;

import br.com.javaparaweb.financeiro.conta.Conta;

public interface LancamentoDAO {
	void salvar(Lancamento lancamento);

	void excluir(Lancamento lancamento);

	Lancamento carregar(Integer lancamento);

	List<Lancamento> listar(Conta conta, Date dataInicio, Date dataFim);
	
	float saldo(Conta conta, Date data);
}
