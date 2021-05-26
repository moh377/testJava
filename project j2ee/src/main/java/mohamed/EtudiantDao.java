package mohamed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;






public class EtudiantDao {
	
	
	public static Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/livresjsp","mohammed","mohamed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
		
	}
	
	public static int save(Etudiant s) throws SQLException {
		
		int status=0;
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("INSERT INTO `livrer`.`etudiant` (`id`, `nom`, `prenom`, `login`, `password`) VALUES (?,?,?,?)");
		ps.setString(1,s.getNom());
		ps.setString(1,s.getPrenom());
		ps.setString(1,s.getLog());
		ps.setString(1,s.getPassword());
		return status;
	}
	
	
	public static int update(Etudiant s) throws SQLException {
		int status=0;
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("UPDATE `livrer`.`etudiant` SET `nom` = ?, `prenom` = ?, `login` = ?, `password` = ? WHERE (`id` = ?)");
		ps.setString(1,s.getNom());
		ps.setString(1,s.getPrenom());
		ps.setString(1,s.getLog());
		ps.setString(1,s.getPassword());
		ps.setInt(6,s.getId());
		return status;
		
	}
	
	public static int delet(Etudiant s) throws SQLException  {
		int status=0;
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("DELETE FROM `livrer`.`etudiant` WHERE (`id` = '6')");
		ps.setInt(1,s.getId());
		status=ps.executeUpdate();
		return status;
		
		
	}
	
	
}
