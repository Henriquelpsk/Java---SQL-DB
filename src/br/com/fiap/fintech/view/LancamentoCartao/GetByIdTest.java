package br.com.fiap.fintech.view.LancamentoCartao;

import br.com.fiap.fintech.DAO.LancamentoCartaoDAO;
import br.com.fiap.fintech.entity.LancamentoCartao;

public class GetByIdTest {
    public static void main(String[] args) {
        LancamentoCartaoDAO dao = new LancamentoCartaoDAO();
        LancamentoCartao lancamentoCartao = dao.getById(1);

        System.out.println(lancamentoCartao.getCodigo() + " " + lancamentoCartao.getTipo() + " " + lancamentoCartao.getValor()+"R$ " +
                lancamentoCartao.getDescricao() + " " + lancamentoCartao.getData().getTime() + " " + lancamentoCartao.getCategoria() + " " +
                lancamentoCartao.getCodigoCartao());


    }
}
