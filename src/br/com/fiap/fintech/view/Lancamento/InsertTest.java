package br.com.fiap.fintech.view.Lancamento;

import br.com.fiap.fintech.DAO.LancamentoDAO;
import br.com.fiap.fintech.entity.Lancamento;
import br.com.fiap.fintech.entity.LancamentoCartao;

import java.util.Calendar;

public class InsertTest {
    public static void main(String[] args) {
        LancamentoDAO dao = new LancamentoDAO();

        Calendar data = Calendar.getInstance();
        data.set(2022,Calendar.OCTOBER, 27);

        Lancamento lancamento1 = new Lancamento("Debito",1500.00,"Shopping",data,"Mercado",1);
        Lancamento lancamento2 = new Lancamento("Credito",2500.00,"Shopping",data,"Mercado",1);
        Lancamento lancamento3 = new Lancamento("Debito",100.00,"Shopping",data,"Mercado",2);
        Lancamento lancamento4 = new Lancamento("Credito",800.00,"Shopping",data,"Mercado",3);
        Lancamento lancamento5 = new Lancamento("Debito",100.55,"Shopping",data,"Mercado",5);

        dao.insert(lancamento1);
        dao.insert(lancamento2);
        dao.insert(lancamento3);
        dao.insert(lancamento4);
        dao.insert(lancamento5);
    }
}
