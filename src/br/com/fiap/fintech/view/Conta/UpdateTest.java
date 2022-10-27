package br.com.fiap.fintech.view.Conta;

import br.com.fiap.fintech.DAO.ContaDAO;
import br.com.fiap.fintech.entity.Conta;

public class UpdateTest {
    public static void main(String[] args) {
        ContaDAO dao = new ContaDAO();

        Conta conta = dao.getById(1);

        conta.setNome("contaAlterada1");
        conta.setBanco("12");
        conta.setAgencia("123");
        conta.setConta("123546789");
        conta.setSaldo(999.50);

        dao.update(conta);
    }
}
