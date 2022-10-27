package br.com.fiap.fintech.view.Usuario;

import br.com.fiap.fintech.DAO.UsuarioDAO;
import br.com.fiap.fintech.entity.Usuario;

import java.util.Calendar;

public class InsertTest {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        Calendar data = Calendar.getInstance();
        data.set(2000,Calendar.JANUARY,1);

        Usuario user1 = new Usuario("emailGenerico1@gmail.com","123456789","Henrique","11999999999", data);
        Usuario user2 = new Usuario("emailGenerico2@gmail.com","987654321","Pedro","11988888888", data);
        Usuario user3 = new Usuario("emailGenerico3@gmail.com","123789456","Jose","11977777777",data);
        Usuario user4 = new Usuario("emailGenerico4@gmail.com","789123456","Caique","1166666666",data);
        Usuario user5 = new Usuario("emailGenerico5@gmail.com","132456879","Ana","11955555555",data);

        dao.insert(user1);
        dao.insert(user2);
        dao.insert(user3);
        dao.insert(user4);
        dao.insert(user5);
    }
}
