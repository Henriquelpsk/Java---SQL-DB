package br.com.fiap.fintech.view.Lancamento;

import br.com.fiap.fintech.DAO.LancamentoDAO;

public class DeleteTest {
    public static void main(String[] args) {
        LancamentoDAO dao = new LancamentoDAO();

        dao.delete(6);

    }
}
