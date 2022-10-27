package br.com.fiap.fintech.view.LancamentoCartao;

import br.com.fiap.fintech.DAO.LancamentoCartaoDAO;
import br.com.fiap.fintech.entity.LancamentoCartao;

import java.util.Calendar;

public class InsertTest {
    public static void main(String[] args) {
        LancamentoCartaoDAO dao = new LancamentoCartaoDAO();

        Calendar data = Calendar.getInstance();
        data.set(2022,Calendar.OCTOBER, 27);

        LancamentoCartao lancamentoCartao1 = new LancamentoCartao("Debito",1500.00,"Shopping",data,"Mercado",1);
        LancamentoCartao lancamentoCartao2 = new LancamentoCartao("Credito",2500.00,"Shopping",data,"Mercado",1);
        LancamentoCartao lancamentoCartao3 = new LancamentoCartao("Debito",100.00,"Shopping",data,"Mercado",2);
        LancamentoCartao lancamentoCartao4 = new LancamentoCartao("Credito",800.00,"Shopping",data,"Mercado",3);
        LancamentoCartao lancamentoCartao5 = new LancamentoCartao("Debito",100.55,"Shopping",data,"Mercado",5);

        dao.insert(lancamentoCartao1);
        dao.insert(lancamentoCartao2);
        dao.insert(lancamentoCartao3);
        dao.insert(lancamentoCartao4);
        dao.insert(lancamentoCartao5);
    }
}
