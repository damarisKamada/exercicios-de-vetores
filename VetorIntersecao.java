/**6.	Criar dois vetores A e B cada um com 10 elementos inteiros. 
 *Desenvolver um programa que realize a intersec��o  dos vetores A e B para produzir um vetor C. Interse��o de conjuntos = todos os elementos que existem em A e tamb�m existem em B.

*/

	

import java.util.Scanner;
public class VetorIntersecao {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM= 3;
			  int a[];
			  int b[];
			  int c[];
			  a = new int[TAM];
			  b = new int[TAM];
			  c = new int[TAM];
			  
			  int i, j, k;
			  boolean Check;

			  for (i=0; i<TAM; i++) {
				  System.out.println("Insira o"+(i+1)+" valor de A");
				  a[i] = in.nextInt();
			  }

			  for (i=0; i<TAM; i++) {
				  System.out.println("Insira o"+(i+1)+" valor de B");
				  b[i] = in.nextInt();
			  }

			  k = 0; 
			  for (i=0; i<TAM; i++) {
			    Check = false;
			    for (j=0; j<TAM; j++) {
			      if (a[i] == b[j])
			         Check = true;
			    }

			    if (Check == true) {
			       c[k] = a[i];
			       k = k + 1;
			    }
			  }
			  System.out.println("Intersec��o entre os vetorea:");

			  System.out.printf(" a[i]   b[i]   c[i] \n");
			  for (i=0; i<TAM; i++) {
			    System.out.printf(" %3d   %3d",  a[i], b[i]);
			    if (i < k)
			       System.out.printf("   %4d", c[i]);
			    System.out.printf("\n");
			  }
		}
	      
	    }
	      
}

	    

	