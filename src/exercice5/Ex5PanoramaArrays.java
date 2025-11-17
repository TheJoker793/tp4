package exercice5;

import java.util.Arrays;

public class Ex5PanoramaArrays {

	public static void main(String[] args) {
		int[]a= {3,1,4,1,5,9};
		int[]b=Arrays.copyOfRange(a,2,a.length);
		Arrays.sort(b);
		int[]c=Arrays.copyOf(b, b.length);
		if(c.length>2) {
			Arrays.fill(c, 1, c.length - 1, 42);
			/* Methodes classique		
			for(int i=1;i<c.length-1;i++) {
				c[i]=42;
			}
		
              */
		}
		 
		System.out.println("tableau a: "+Arrays.toString(a));
		System.out.println("tableau b: "+Arrays.toString(b));
		System.out.println("tableau c: "+Arrays.toString(c));
		System.out.println("b et c identiques =>" +Arrays.equals(b, c));
		boolean identique=Arrays.equals(b, c);
		System.out.println(identique?"ils sont identique":"ne sont pas identiques");
		int mm=Arrays.mismatch(b, c);
		if (mm>=0) {
			System.out.println("le desaccord est à la position "+mm);
		}
		else {
			System.out.println("ideentique ( "+mm+")");

		}
		
		String[][] noms = {{"Ben Salah","Mohamed"}, {"Ben Ammar","Ali"},
				 {"Ben Farhat","Sami"}};
		System.out.println(Arrays.deepToString(noms));
		//deepToString affiche tableau avec 2 dimensions 
		
		
	
	
		

		

	}

}
