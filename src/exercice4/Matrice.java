package exercice4;

import java.util.Arrays;

public class Matrice {
	
	
	static int[] sommeLignes(int [][] A) {
		int[] resultat=new int[A.length];
		for(int i=0;i<A.length;i++) {
			int sommeLigne =0;
			for(int x:A[i]) sommeLigne+=x;
			resultat[i]=sommeLigne;		
		}
		
		return resultat;
	}
	static int[][] transpose(int [][] A){
		int lignes=A.length;
		int colonnes=A[0].length;
		int[][] Transpose=new int[colonnes][lignes];
		for (int i=0;i<lignes;i++) {
			for (int j=0;j<colonnes;j++) {
				Transpose[j][i]=A[i][j];
			}
		}
		
		return Transpose;
	}
	static int[][] produit(int [][]matriceA, int[][] matriceB){
		int nbrLignesA=matriceA.length;
		int nbrColonnesA=matriceA[0].length;
		int nbrLignesB=matriceB.length;
		if(nbrColonnesA!=nbrColonnesA) {
			System.out.println("dimensons incompatibles");
		}
		int nbrColonnesB=matriceB[0].length;
		
		int[][] matriceProduit=new int[nbrLignesA][nbrColonnesB];
		for (int i=0; i<nbrLignesA;i++) {
			for(int j=0;j<nbrColonnesB;j++) {
				int somme=0;
				for(int k=0;k<nbrColonnesA;k++) {
					somme+=matriceA[i][k]*matriceB[k][j];
				}
				matriceProduit[i][j]=somme;
			}
		}
		return matriceProduit;
			}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]A= {{1,2,3},{4,5,6}};
		int [][]B= {{7,8},{9,10},{11,12}};
		System.out.println( Arrays.toString(sommeLignes(A)));
		System.out.println(" A est "+ Arrays.deepToString( A));

		System.out.println("Transpose de A est "+ Arrays.deepToString(transpose( A)));
		int[][] matriceProduit=produit(A,B);
		if(matriceProduit!=null) {
			System.out.println("le matrice produit est "+Arrays.deepToString(matriceProduit));
		}	
		boolean ok = Arrays.deepEquals(A, transpose(transpose(A)));
		System.out.println(ok?"c la meme ":"c pas la meme");		
		

	}

}
