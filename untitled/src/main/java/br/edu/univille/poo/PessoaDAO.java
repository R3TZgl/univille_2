package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO extends BaseDAO{

    public void deletarPeloId(long id){
        String sql = "DELETE FROM pessoa WHERE id = ?;";
        try(Connection con = con();
            PreparedStatement pre = con().prepareStatement(sql)){
            pre.setLong(1, id);
            pre.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar pelo id: " + id);
            System.out.println("Erro: "+ e.getMessage());
        }
    }

    public void inserir(Pessoa p){
        String sql = "INSERT INTO pessoa(nome,cpf) VALUES(?,?);";
        try(var con = con();
            var pre = con().prepareStatement(sql)){
            pre.setString(1, p.getNome());
            pre.setString(2, p.getCpf());
            pre.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir.");
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
