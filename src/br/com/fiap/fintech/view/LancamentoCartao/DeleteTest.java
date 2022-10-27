package br.com.fiap.fintech.view.LancamentoCartao;

import br.com.fiap.fintech.DAO.LancamentoCartaoDAO;

public class DeleteTest {
    public static void main(String[] args) {
        LancamentoCartaoDAO dao = new LancamentoCartaoDAO();

        dao.delete(1);
    }
}
