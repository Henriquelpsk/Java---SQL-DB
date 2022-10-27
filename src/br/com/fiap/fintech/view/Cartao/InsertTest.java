package br.com.fiap.fintech.view.Cartao;

import br.com.fiap.fintech.DAO.CartaoDAO;
import br.com.fiap.fintech.entity.CartaoDeCredito;

import java.util.Calendar;

public class InsertTest {
    public static void main(String[] args) {
        CartaoDAO dao = new CartaoDAO();

        Calendar dataFechamento = Calendar.getInstance();
        dataFechamento.set(2000,10,10);
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.set(2000,9,9);

        CartaoDeCredito cartao1 = new CartaoDeCredito("cartao1","1234567891234567","bandeira",dataFechamento,500.0,100.0, dataVencimento,1,1);
        CartaoDeCredito cartao2 = new CartaoDeCredito("cartao2","1234567891234567","bandeira",dataFechamento,500.0,100.0, dataVencimento,1,2);
        CartaoDeCredito cartao3 = new CartaoDeCredito("cartao3","1234567891234567","bandeira",dataFechamento,500.0,100.0, dataVencimento,2,1);
        CartaoDeCredito cartao4 = new CartaoDeCredito("cartao4","1234567891234567","bandeira",dataFechamento,500.0,100.0, dataVencimento,3,1);
        CartaoDeCredito cartao5 = new CartaoDeCredito("cartao5","1234567891234567","bandeira",dataFechamento,500.0,100.0, dataVencimento,4,1);
        dao.insert(cartao1);
        dao.insert(cartao2);
        dao.insert(cartao3);
        dao.insert(cartao4);
        dao.insert(cartao5);
    }
}
