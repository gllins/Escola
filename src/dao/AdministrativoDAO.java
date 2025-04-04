package dao;

import java.sql.*;
import model.Administrativo;
import conexao.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

public class AdministrativoDAO {

    public void save (Administrativo administrativo) {
        String sql = "INSERT INTO administrativo (id, nome, idade, cargo, endereco) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, administrativo.getId());
            pstmt.setString(2, administrativo.getNome());
            pstmt.setInt(3, administrativo.getIdade());
            pstmt.setString(4, administrativo.getCargo());
            pstmt.setString(5, administrativo.getEndereço());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Administrativo> read() {
        List<Administrativo> administrativos = new ArrayList<>();
        String sql = "SELECT * FROM administrativo";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
            	Administrativo administrativo = new Administrativo(0, sql, 0);
                administrativo.setId(rs.getInt("id"));
                administrativo.setNome(rs.getString("nome"));
                administrativo.setIdade(rs.getInt("idade"));
                administrativo.setCargo(rs.getString("cargo"));
                administrativo.setEndereço(rs.getString("endereço"));
                administrativos.add(administrativo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return administrativos;
    }

    public void update(Administrativo administrativo) {
        String sql = "UPDATE administrativo SET nome = ?, idade = ?, cargo = ?, endereco = ?, WHERE id = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

        	  pstmt.setInt(1, administrativo.getId());
              pstmt.setString(2, administrativo.getNome());
              pstmt.setInt(3, administrativo.getIdade());
              pstmt.setString(4,administrativo.getCargo());
              pstmt.setString(5, administrativo.getEndereço());


            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Administrativo administrativo) {
        String sql = "DELETE FROM administrativo WHERE id = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, administrativo.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  

}