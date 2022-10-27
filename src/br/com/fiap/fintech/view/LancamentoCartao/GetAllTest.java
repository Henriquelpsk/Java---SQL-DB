package br.com.fiap.fintech.view.LancamentoCartao;

import br.com.fiap.fintech.DAO.LancamentoCartaoDAO;
import br.com.fiap.fintech.entity.LancamentoCartao;

import java.util.List;

public class GetAllTest {
    public static void main(String[] args) {
        LancamentoCartaoDAO dao = new LancamentoCartaoDAO();

        List<LancamentoCartao> lista = dao.getAll();

        for(LancamentoCartao lancamentoCartao : lista){
            System.out.println(lancamentoCartao.getCodigo() + " " + lancamentoCartao.getTipo() + " " + lancamentoCartao.getValor()+"R$ " +
                    lancamentoCartao.getDescricao() + " " + lancamentoCartao.getData().getTime() + " " + lancamentoCartao.getCategoria() + " " +
                    lancamentoCartao.getCodigoCartao());
        }
    }
}
