package br.com.fiap.fintech.view.Conta;

import br.com.fiap.fintech.DAO.ContaDAO;
import br.com.fiap.fintech.entity.Conta;

import java.util.List;

public class GetAllTest {
    public static void main(String[] args) {
        ContaDAO dao = new ContaDAO();

        List<Conta> lista = dao.getAll();

        for(Conta conta : lista){
            System.out.println(conta.getCodigo() + " " + conta.getNome() + " " + conta.getBanco() + " " + conta.getAgencia() + " " +
                    conta.getConta() + " " + conta.getSaldo()+"R$" + " " + conta.getCodigoUsuario());
        }
    }
}
