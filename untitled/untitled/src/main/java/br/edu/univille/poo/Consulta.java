package br.edu.univille.poo;


import java.sql.*;


public class Consulta
{
    public static void main( String[] args )
    {
        String password = "univille";
        String url = "jdbc:mysql://localhost:3306/poo_2";
        String user = "root";

        try{
            Connection con = DriverManager.getConnection(url,user,password);
            String select = "SELECT id, nome, cpf FROM pessoa WHERE Ativo = ?;";
            PreparedStatement pre = con.prepareStatement(select);
            pre.setBoolean(1, true);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                long id = rs.getLong(1);
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                System.out.println(id+", "+nome+" "+cpf);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
