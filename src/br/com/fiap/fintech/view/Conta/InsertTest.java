package br.com.fiap.fintech.view.Conta;

import br.com.fiap.fintech.DAO.ContaDAO;
import br.com.fiap.fintech.entity.Conta;

public class InsertTest {
    public static void main(String[] args) {

        ContaDAO dao = new ContaDAO();

        Conta conta1 = new Conta("conta1","55","1324","123456789",0d,1);
        Conta conta2 = new Conta("conta2","55","1144","123654789",550.0,1);
        Conta conta3 = new Conta("conta3","11","1434","433256733",600.0,2);
        Conta conta4 = new Conta("conta4","22","4321","753456722",1505.0,3);
        Conta conta5 = new Conta("conta5","33","1424","323456711",1.0,4);

        dao.insert(conta1);
        dao.insert(conta2);
        dao.insert(conta3);
        dao.insert(conta4);
        dao.insert(conta5);
    }
}
