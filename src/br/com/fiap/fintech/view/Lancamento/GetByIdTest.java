package br.com.fiap.fintech.view.Lancamento;

import br.com.fiap.fintech.DAO.LancamentoDAO;
import br.com.fiap.fintech.entity.Lancamento;
import br.com.fiap.fintech.entity.LancamentoCartao;

public class GetByIdTest {
    public static void main(String[] args) {
        LancamentoDAO dao = new LancamentoDAO();
        Lancamento lancamento = dao.getById(6);

        System.out.println(lancamento.getCodigo() + " " + lancamento.getTipo() + " " + lancamento.getValor()+"R$ " +
                lancamento.getDescricao() + " " + lancamento.getData().getTime() + " " + lancamento.getCategoria() + " " +
                lancamento.getCodigoConta());

    }
}
