package br.com.fiap.fintech.view.Cartao;

import br.com.fiap.fintech.DAO.CartaoDAO;
import br.com.fiap.fintech.entity.CartaoDeCredito;

import java.util.List;

public class GetAllTest {
    public static void main(String[] args) {
        CartaoDAO dao = new CartaoDAO();

        List<CartaoDeCredito> lista = dao.getAll();

        for(CartaoDeCredito cartao : lista){
            System.out.println(cartao.getCodigo() + " " + cartao.getNome() + " " + cartao.getNumero() + " " + cartao.getBandeira() + " " +
                    cartao.getDataFechamento().getTime() + " " + cartao.getLimite()+"R$ " + cartao.getUsado()+"R$ " + cartao.getVencimento().getTime() + " " +
                    cartao.getCodigoUsuario() + " " + cartao.getCodigoConta());
        }
    }
}
