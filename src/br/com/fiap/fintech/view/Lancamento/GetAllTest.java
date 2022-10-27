package br.com.fiap.fintech.view.Lancamento;

import br.com.fiap.fintech.DAO.LancamentoDAO;
import br.com.fiap.fintech.entity.Lancamento;

import java.util.List;

public class GetAllTest {
    public static void main(String[] args) {
        LancamentoDAO dao = new LancamentoDAO();

        List<Lancamento> lista = dao.getAll();

        for(Lancamento lancamento : lista){
            System.out.println(lancamento.getCodigo() + " " + lancamento.getTipo() + " " + lancamento.getValor()+"R$ " +
                    lancamento.getDescricao() + " " + lancamento.getData().getTime() + " " + lancamento.getCategoria() + " " +
                    lancamento.getCodigoConta());
        }
    }
}
