package tpjava;
import java.util.Scanner;
public class tpjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nombre= new Scanner(System.in);
		int nbr;
		
		System.out.println("Entre le nombre: "); 
	    nbr = nombre.nextInt();   
	       

		int nbrsecret = 20;
		while(nbr!=nbrsecret) {
		if(nbr > nbrsecret) {
			System.out.print("le numéro que vous avez saisie est supérier au numero secret");
			System.out.print("\r");
			System.out.println("Entre le nombre: "); 
		    nbr = nombre.nextInt();   
		}
		else{
			System.out.print("le numéro que vous avez saisie est inférieur au numéro secret");
			System.out.print("\r");
			System.out.println("Entre le nombre: "); 
		    nbr = nombre.nextInt();   
		}
		}
		
		
		System.out.print("bravo , vous avez gagné le jeux");

	}

}
