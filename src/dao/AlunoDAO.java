package dao;

import java.sql.*;
import model.Aluno;
import conexao.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void save (Aluno aluno) {
        String sql = "INSERT INTO aluno (id, nome, idade, turma, turno) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, aluno.getId());
            pstmt.setString(2, aluno.getNome());
            pstmt.setInt(3, aluno.getIdade());
            pstmt.setString(4, aluno.getTurma());
            pstmt.setString(5, aluno.getTurno());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> read() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM aluno";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
            	Aluno aluno = new Aluno(0, sql, 0);
            	aluno.setId(rs.getInt("id"));
            	aluno.setNome(rs.getString("nome"));
            	aluno.setIdade(rs.getInt("idade"));
            	aluno.setTurma(rs.getString("turma"));
            	aluno.setTurno(rs.getString("turno"));
            	alunos.add(aluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public void update(Aluno aluno) {
        String sql = "UPDATE aluno SET nome = ?, idade = ?, turma = ?, turno = ?, WHERE id = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

        	  pstmt.setInt(1, aluno.getId());
              pstmt.setString(2, aluno.getNome());
              pstmt.setInt(3, aluno.getIdade());
              pstmt.setString(4,aluno.getTurma());
              pstmt.setString(5, aluno.getTurno());


            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Aluno aluno) {
        String sql = "DELETE FROM aluno WHERE id = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, aluno.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  

}