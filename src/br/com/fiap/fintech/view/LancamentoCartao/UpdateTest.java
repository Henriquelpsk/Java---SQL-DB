package br.com.fiap.fintech.view.LancamentoCartao;

import br.com.fiap.fintech.DAO.LancamentoCartaoDAO;
import br.com.fiap.fintech.entity.LancamentoCartao;

import java.util.Calendar;

public class UpdateTest {
    public static void main(String[] args) {
        LancamentoCartaoDAO dao = new LancamentoCartaoDAO();
        LancamentoCartao lancamentoCartao = dao.getById(1);

        Calendar data = Calendar.getInstance();
        data.set(2020,Calendar.JANUARY,22);

        lancamentoCartao.setTipo("Débito");
        lancamentoCartao.setDescricao("Compras Online");
        lancamentoCartao.setData(data);
        lancamentoCartao.setCategoria("Compras");

        dao.update(lancamentoCartao);
    }
}
