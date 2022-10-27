package br.com.fiap.fintech.view.Usuario;

import br.com.fiap.fintech.DAO.UsuarioDAO;
import br.com.fiap.fintech.entity.Usuario;

import java.util.Calendar;

public class UpdateTest {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario = dao.getById(1);

        usuario.setEmail("emailgenerico@gmail.com");
        usuario.setSenha("senhaGenerica");
        usuario.setNome("nomeGenerico");
        usuario.setTelefone("11999999999");
        Calendar data = Calendar.getInstance();
        data.set(2010,10,10);
        usuario.setDtNascimento(data);

        dao.update(usuario);

    }

}
