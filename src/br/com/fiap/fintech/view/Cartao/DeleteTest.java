package br.com.fiap.fintech.view.Cartao;

import br.com.fiap.fintech.DAO.CartaoDAO;

public class DeleteTest {
    public static void main(String[] args) {
        CartaoDAO dao = new CartaoDAO();

        dao.delete(5);
    }
}
