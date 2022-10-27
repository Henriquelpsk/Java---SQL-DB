package br.com.fiap.fintech.DAO;

import br.com.fiap.fintech.entity.Usuario;
import br.com.fiap.fintech.jdbc.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UsuarioDAO implements UsuarioInterface {

    private Connection conexao;

    public void insert(Usuario usuario){

        PreparedStatement stmt = null;

        try{
            conexao = DBManager.obterConexao();
            conexao.setAutoCommit(false);

            String sql = "INSERT INTO T_USUARIO(CD_USUARIO, NM_EMAIL, NR_SENHA, NM_NOME, NR_TELEFONE, DT_NASCIMENTO) " +
                    "VALUES (SEQ_USUARIO.NEXTVAL, ?, ?, ?, ? , TO_DATE(?))";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1,usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getTelefone());
            java.sql.Date data = new java.sql.Date(usuario.getDtNascimento().getTimeInMillis());
            stmt.setDate(5, data);

            stmt.executeUpdate();
            conexao.commit();

            System.out.println("Usuario " + usuario.getNome() + " criado com sucesso!");

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                conexao.rollback();
                stmt.close();
                conexao.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void update(Usuario usuario){
        PreparedStatement stmt = null;

        try{
            conexao = DBManager.obterConexao();
            conexao.setAutoCommit(false);

            String sql = "UPDATE T_USUARIO SET NM_EMAIL=?, NR_SENHA=?, NM_NOME=?, NR_TELEFONE=?, DT_NASCIMENTO=? WHERE CD_USUARIO = ?";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getTelefone());
            java.sql.Date data = new java.sql.Date(usuario.getDtNascimento().getTimeInMillis());
            stmt.setDate(5, data);
            stmt.setInt(6, usuario.getCodigo());

            stmt.executeUpdate();
            conexao.commit();

            System.out.println("Usuario " + usuario.getNome() + " alterado com sucesso!");


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                conexao.rollback();
                stmt.close();
                conexao.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void delete(int codigo){

        PreparedStatement stmt = null;

        try {
            conexao = DBManager.obterConexao();

            String sql = "DELETE FROM T_USUARIO WHERE CD_USUARIO = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, codigo);

            stmt.executeUpdate();

            System.out.println("Usuario removido com sucesso!");

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public Usuario getById(int codigoBusca){

        Usuario usuario = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = DBManager.obterConexao();
            stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO WHERE CD_USUARIO = ?");

            stmt.setInt(1, codigoBusca);
            rs = stmt.executeQuery();

            if (rs.next()){
                int codigo = rs.getInt("CD_USUARIO");
                String email = rs.getString("NM_EMAIL");
                String senha = rs.getString("NR_SENHA");
                String nome = rs.getString("NM_NOME");
                String telefone = rs.getString("NR_TELEFONE");
                java.sql.Date data = rs.getDate("DT_NASCIMENTO");
                Calendar dtNascimento = Calendar.getInstance();
                dtNascimento.setTimeInMillis(data.getTime());
                usuario = new Usuario(codigo, email, senha, nome, telefone, dtNascimento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuario;
    }

    public List<Usuario> getAll(){

        List<Usuario> lista = new ArrayList<Usuario>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = DBManager.obterConexao();
            stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO ORDER BY CD_USUARIO");
            rs = stmt.executeQuery();

            while(rs.next()){
                int codigo = rs.getInt("CD_USUARIO");
                String email = rs.getString("NM_EMAIL");
                String senha = rs.getString("NR_SENHA");
                String nome = rs.getString("NM_NOME");
                String telefone = rs.getString("NR_TELEFONE");
                java.sql.Date data = rs.getDate("DT_NASCIMENTO");
                Calendar dataNascimento = Calendar.getInstance();
                dataNascimento.setTimeInMillis(data.getTime());

                Usuario usuario = new Usuario(codigo, email, senha, nome, telefone, dataNascimento);
                lista.add(usuario);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return lista;
    }

}

