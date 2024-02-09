package poojav;

public class Etudiant {
	private String nom;
	private String prenom;
	private int matricule;
	public Etudiant(String n, String p , int m ) {
		nom=n;
		prenom=p;
		matricule=m;
		
	}
	public void initialiser(String n) {
		System.out.print(n);
	}

}
