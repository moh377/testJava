package mohamed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class livresDao {
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
		PreparedStatement ps=conn.prepareStatement("INSERT INTO `livrer`.`livres` (`id`, `titre`, `etiteur`, `auteur`, `categorie`,`qte_stock`) VALUES (?,?,?,?,?)");
		ps.setString(1,s.getNom());
		ps.setString(1,s.getPrenom());
		ps.setString(1,s.getLog());
		ps.setString(1,s.getPassword());
		return status;
	}
	
	
	public static int update(Etudiant s) throws SQLException {
		int status=0;
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("UPDATE `livrer`.`livres` SET `titre` = ?, `etiteur` = ?, `auteur` =?, `categorie` = ?, `qte_stock` = ? WHERE (`id` = ?)");
		ps.setString(1,s.getNom());
		ps.setString(1,s.getPrenom());
		ps.setString(1,s.getLog());
		ps.setString(1,s.getPassword());
		ps.setInt(6,s.getId());
		return status ;
		
	}
	
	public static int delet(Etudiant s) throws SQLException  {
		int status=0;
		Connection conn=getConnection();
		PreparedStatement ps=conn.prepareStatement("DELETE FROM `livrer`.`livres` WHERE (`id` = '6')");
		ps.setInt(1,s.getId());
		status=ps.executeUpdate();
		return status;
		
		
	}
	

}
