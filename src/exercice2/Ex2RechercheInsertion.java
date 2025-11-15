package exercice2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2RechercheInsertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la taille du tableau");
		int n=sc.nextInt();
		int[] t=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("donner element "+i);
			t[i]=sc.nextInt();
			
		} 
        System.out.println("Tableau intial : " + Arrays.toString(t));
		Arrays.sort(t);
        System.out.println("Tableau trié t : " + Arrays.toString(t));
        
        int[] temp=new int[n];
        int compteur=0;
        
        //temp[compteur]=t[0];
        //compteur++;
        temp[compteur++]=t[0];//méme chose
        for(int i=1;i<n;i++) {
        	if(t[i]!=t[i-1]) {
        		temp[compteur]=t[i];
        		compteur++;
        		//temp[compteur++]=t[i]; meme chose
        	}
        }
        
        System.out.println("Tableau tomporaire : " + Arrays.toString(temp));
        int[] u=Arrays.copyOf(temp, compteur);
        System.out.println("Tableau copie : " + Arrays.toString(u));
        System.out.println("donner la valeur v");
        int v=sc.nextInt();
        int position=Arrays.binarySearch(u, v);
        if(position>=0) {
        	System.out.println("la valeur "+v+" existe dans la position "+position);
        }
        else {
        	int insertion=-position-1;
        	System.out.println("la valeur "+v+" est absente elle doit etre existé dans la postion "+insertion);

        }
        int[] w;
        if (position >= 0) {
            w = Arrays.copyOf(u, u.length); // déjà présente
        } else {
            int insertion = -position - 1;
            w = new int[u.length + 1];
            // copier les éléments avant l'insertion
            for (int i = 0; i < insertion; i++) {
                w[i] = u[i];
            }
            // insérer v
            w[insertion] = v;
            // copier le reste
            for (int i = insertion; i < u.length; i++) {
                w[i + 1] = u[i];
            }
        }
        System.out.println("w :"+ Arrays.toString(w));

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


        
        
        
        
        
        
        

		
		
		
		
		
		
		
		
		
		sc.close();



	}

}
