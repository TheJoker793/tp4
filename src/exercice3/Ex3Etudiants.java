package exercice3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Ex3Etudiants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner le nombre des étudiants");
		int m=sc.nextInt();
		Etudiant[] tab=new Etudiant[m];
		for(int i=0;i<m;i++) {
			System.out.println("donner le nom d'étudiant "+(i+1));
			String nom=sc.next();
			System.out.println("donner la note d'étudiant "+(i+1));
			double note=sc.nextDouble();
			tab[i]=new Etudiant(nom,note);
		}
		
		double sommeNotes=0;
		for(Etudiant etudiant:tab) {
			sommeNotes+=etudiant.note;
		}
		System.out.println("la moyenne des notes est "+sommeNotes/m);
		Etudiant meilleurEtudiant=tab[0];
		for(Etudiant etudiant:tab) {
			if(meilleurEtudiant.note<=etudiant.note) meilleurEtudiant=etudiant;
		}
		System.out.println("le meilleur etudiant est "+meilleurEtudiant.nom);
		Arrays.sort(tab, Comparator
		        .comparingDouble((Etudiant e) -> e.note)
		        .reversed()
		        .thenComparing(e -> e.nom));
		System.out.println("Le tri final  "+ Arrays.toString(tab));
		


		
		
		

		
		
		
		
		sc.close();

	}

}
