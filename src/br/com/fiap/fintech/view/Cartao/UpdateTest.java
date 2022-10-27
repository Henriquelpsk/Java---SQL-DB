package br.com.fiap.fintech.view.Cartao;

import br.com.fiap.fintech.DAO.CartaoDAO;
import br.com.fiap.fintech.entity.CartaoDeCredito;

import java.util.Calendar;

public class UpdateTest {
    public static void main(String[] args) {
        CartaoDAO dao = new CartaoDAO();

        CartaoDeCredito cartao = dao.getById(21);
        Calendar dataFechamento = Calendar.getInstance();
        dataFechamento.set(2005,10,1);
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.set(2005,9,10);

        cartao.setNome("nomeCartao");
        cartao.setNumero("1232456578984565");
        cartao.setBandeira("visa");
        cartao.setDataFechamento(dataFechamento);
        cartao.setLimite(1000.50);
        cartao.setUsado(500.10);
        cartao.setVencimento(dataVencimento);

        dao.update(cartao);
    }
}
