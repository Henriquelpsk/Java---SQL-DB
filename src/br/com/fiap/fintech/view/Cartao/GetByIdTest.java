package br.com.fiap.fintech.view.Cartao;

import br.com.fiap.fintech.DAO.CartaoDAO;
import br.com.fiap.fintech.entity.CartaoDeCredito;

public class GetByIdTest {
    public static void main(String[] args) {
        CartaoDAO dao = new CartaoDAO();

        CartaoDeCredito cartao = dao.getById(25);

        System.out.println(cartao.getCodigo() + " " + cartao.getNome() + " " + cartao.getNumero() + " " + cartao.getBandeira() + " " +
                cartao.getDataFechamento().getTime() + " " + cartao.getLimite()+"R$ " + cartao.getUsado()+"R$ " + cartao.getVencimento().getTime() + " " +
                cartao.getCodigoUsuario() + " " + cartao.getCodigoConta());
    }
}
