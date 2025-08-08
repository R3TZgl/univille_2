package br.edu.univille.poo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App
{
    public static void main( String[] args )
    {
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.deletarPeloId(1);
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setCpf("1234");
        pessoaDAO.inserir(p1);
    }
}
