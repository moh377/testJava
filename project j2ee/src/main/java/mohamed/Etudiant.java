package mohamed;

public class Etudiant {
	private int id;
	private String nom , prenom , log , password ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Etudiant(String nom, String prenom, String log, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.log = log;
		this.password = password;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
}
