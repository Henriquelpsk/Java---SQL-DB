package br.com.fiap.fintech.view.Conta;

import br.com.fiap.fintech.DAO.ContaDAO;

public class DeleteTest {
    public static void main(String[] args) {
        ContaDAO dao = new ContaDAO();

        dao.delete(1);
    }
}
