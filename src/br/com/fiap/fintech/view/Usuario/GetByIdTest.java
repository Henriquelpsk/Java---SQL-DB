package br.com.fiap.fintech.view.Usuario;

import br.com.fiap.fintech.DAO.UsuarioDAO;
import br.com.fiap.fintech.entity.Usuario;

public class GetByIdTest {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario = dao.getById(1);

        System.out.println(usuario.getCodigo() + " " + usuario.getEmail() + " " + usuario.getSenha() + " " +
                usuario.getNome() + " " + usuario.getTelefone() + " " + usuario.getDtNascimento().getTime());
    }
}
