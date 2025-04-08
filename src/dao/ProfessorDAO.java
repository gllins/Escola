package dao;

import java.sql.*;
import model.Professor;
import conexao.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    public void save(Professor professor) {
        String sql = "INSERT INTO professor(id, nome, idade, disciplina, turno) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, professor.getId());
            pstmt.setString(2, professor.getNome());
            pstmt.setInt(3, professor.getIdade());
            pstmt.setString(4, professor.getDisciplina());
            pstmt.setString(5, professor.getTurno());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Professor> read() {
        List<Professor> professores= new ArrayList<>();
        String sql = "SELECT * FROM professor";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Professor professor = new Professor();
                professor.setId(rs.getInt("id"));
                professor.setNome(rs.getString("nome"));
                professor.setIdade(rs.getInt("idade"));
                professor.setDisciplina(rs.getString("disciplina"));
                professor.setTurno(rs.getString("turno"));
                professores.add(professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professores;
    }

    public void update(Professor professor) {
        String sql = "UPDATE professor SET nome = ?, idade = ?, disciplina = ?, turno = ?, WHERE id = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

        	  pstmt.setInt(1, professor.getId());
              pstmt.setString(2, professor.getNome());
              pstmt.setInt(3, professor.getIdade());
              pstmt.setString(4, professor.getDisciplina());
              pstmt.setString(5, professor.getTurno());


            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Professor professor) {
        String sql = "DELETE FROM professor WHERE id = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, professor.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  

}