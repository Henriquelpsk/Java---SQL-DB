package br.com.fiap.fintech.view.Conta;

import br.com.fiap.fintech.DAO.ContaDAO;
import br.com.fiap.fintech.entity.Conta;

public class GetByIdTest {
    public static void main(String[] args) {
        ContaDAO dao = new ContaDAO();
        ;
        Conta conta = dao.getById(1);

        System.out.println(conta.getCodigo() + " " + conta.getNome() + " " + conta.getBanco() + " " + conta.getAgencia() + " " +
                conta.getConta() + " " + conta.getSaldo()+"R$" + " " + conta.getCodigoUsuario());
    }
}
