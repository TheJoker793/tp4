package exercice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1StatsTableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("donner la taille du tableau");
		int n=sc.nextInt();
		int[] t=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=rand.nextInt(101);
		}
		System.out.println("tableau initial "+ Arrays.toString(t));
		int min=t[0];
		int max=t[0];
		int somme=0;
		for(int tab:t) {
			if(min<=tab)min=tab;
			if(max>=tab) max=tab;
			somme+=tab;
		}
		System.out.println("la valeur min est "+min);
		System.out.println("la valeur max est "+max);
		System.out.println("la moyenne est "+ (double) somme/n);
		Arrays.sort(t);
		System.out.println("tableau trié "+ Arrays.toString(t));
		
		int tailleTableauCopie=Math.min(10, n);
		int[] copie=Arrays.copyOf(t, tailleTableauCopie);
		if (copie.length >5) {
			for(int i=5;i<copie.length;i++) {
				copie[i]=-1;
			}
		}
		System.out.println("tableau copie "+ Arrays.toString(copie));



		
		
		
		
		

		
		sc.close();

	}

}
