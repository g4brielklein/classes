package dao;

import com.mycompany.telalogin.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome, senha) VALUES ('" + usuario.getUsuario() + "', '"+ usuario.getSenha() +"')";
        
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        
        prepareStatement.execute();
    }
    
    public boolean autenticar(Usuario usuario) throws SQLException {
        String sql = "SELECT nome, senha FROM usuario WHERE nome = '" + usuario.getUsuario() + "' AND senha = '"+ usuario.getSenha() +"' ";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.execute();
        
        ResultSet resultSet = prepareStatement.getResultSet();
        
        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }
}
