package br.com.fiap.fintech.view.Usuario;

import br.com.fiap.fintech.DAO.UsuarioDAO;

public class DeleteTest {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        dao.delete(1);
    }
}
