package br.edu.univille.poo;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseDAO {
    protected Connection con() throws SQLException {
        /*protegido
          todas as classes estão no mesmo pacote
          ou que fazem herança pode acessar
        */
        return ConnectionFactory.getInstance().get();
    }
}
