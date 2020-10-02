package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbutil.DbUtil;
import model.Aluno;

public class AlunoDao {

	private Connection connection;
	
	public AlunoDao() {
		connection = DbUtil.getConnection();
	}
	public void createAluno(Aluno aluno) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into aluno(Id, Nome, Idade) values (?, ?, ?)");
			// colocar os dados
			preparedStatement.setInt(1,  aluno.getAluno_id());
			preparedStatement.setString(2, aluno.getAluno_nome() );
			preparedStatement.setInt(3,  aluno.getAluno_idade());
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteAluno(int aluno_id) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from aluno where Id=?");
			// deletar os dados
			preparedStatement.setInt(1, aluno_id);
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateAluno(Aluno aluno) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update aluno set Nome=?, Idade=? where Id=?");
			//update de dados
			preparedStatement.setString(1,  aluno.getAluno_nome());
			preparedStatement.setInt(2,  aluno.getAluno_idade());
			preparedStatement.setInt(3,  aluno.getAluno_id());
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Aluno> getAllAlunos(){
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from aluno");
			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setAluno_id(rs.getInt("Id"));
				aluno.setAluno_nome(rs.getString("Nome"));
				aluno.setAluno_idade(rs.getInt("Idade"));
				listaDeAlunos.add(aluno);
			}
		}catch (SQLException e) {
				e.printStackTrace();
			}
		return listaDeAlunos;
		}
	
	public Aluno getAlunoById(int aluno_id) {
		Aluno aluno = new Aluno();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from aluno where Id=?");
			preparedStatement.setInt(1, aluno_id);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				aluno.setAluno_id(rs.getInt("Id"));
				aluno.setAluno_nome(rs.getString("Nome"));
				aluno.setAluno_idade(rs.getInt("Idade"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}
}
