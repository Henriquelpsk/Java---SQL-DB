package br.com.fiap.fintech.view.Lancamento;

import br.com.fiap.fintech.DAO.LancamentoCartaoDAO;
import br.com.fiap.fintech.DAO.LancamentoDAO;
import br.com.fiap.fintech.entity.Lancamento;
import br.com.fiap.fintech.entity.LancamentoCartao;

import java.util.Calendar;

public class UpdateTest {
    public static void main(String[] args) {
        LancamentoDAO dao = new LancamentoDAO();
        Lancamento lancamento = dao.getById(6);

        Calendar data = Calendar.getInstance();
        data.set(2020,Calendar.JANUARY,22);

        lancamento.setTipo("Débito");
        lancamento.setDescricao("Compras Online");
        lancamento.setData(data);
        lancamento.setCategoria("Compras");

        dao.update(lancamento);
    }
}
