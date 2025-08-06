package br.edu.univille.poo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App
{
    public static void main( String[] args )
    {
      /*  String password = "univille";

        try{
            DriverManager.getConnection(" jdbc : mysql :// localhost :3306/ meu_banco ", " root ", " root1234 ");
        }catch(SQLException e) {
            e.printStackTrace();
        }


        try{
            Connection con = DriverManager.getConnection(url,user.password);
            String select = "SELECT id_pessoa, nome, cpf FROM pessoa;";
            PreparedStatement pre = con.prepareStatement(insert);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                long id = rs.getLong(1);
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                System.out.println(id+", "+nome+" "+cpf);
            }
        }catch (Exeception e){
            eprintStackTrace();
        }*/
    }
}
