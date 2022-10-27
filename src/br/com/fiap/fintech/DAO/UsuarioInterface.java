package br.com.fiap.fintech.DAO;

import br.com.fiap.fintech.entity.Usuario;

import java.util.List;

public interface UsuarioInterface {

    void insert(Usuario usuario);

    void update(Usuario usuario);

    void delete(int codigoBusca);

    Usuario getById(int codigo);

    List<Usuario> getAll();
}
