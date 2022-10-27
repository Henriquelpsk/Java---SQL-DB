package br.com.fiap.fintech.view.Usuario;

import br.com.fiap.fintech.DAO.UsuarioDAO;
import br.com.fiap.fintech.entity.Usuario;

import java.util.List;

public class GetAllTest {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        List<Usuario> lista = dao.getAll();

        for(Usuario usuario : lista){
            System.out.println(usuario.getCodigo() + " " + usuario.getEmail() + " " + usuario.getSenha() + " " +
                    usuario.getNome() + " " + usuario.getTelefone() + " " + usuario.getDtNascimento().getTime());
        }
    }
}
