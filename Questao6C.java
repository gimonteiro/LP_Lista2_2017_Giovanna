import java.util.*;
class Questao6C{
	
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		int n,i,j=0;
			System.out.printf("Digite o Tamanho do Vetor\n");
			n = scan.nextInt();
		int[] A= new int[n];
		for(i=0;i<n;i++){
			A[i] = scan.nextInt();
		}
		for (i=0;i<n;i++){
		 j=i;
			while((j>0)&&(A[j-1]>A[j])){
				int aux=0;
				aux = A[j-1];
				A[j-1] = A[j];
				A[j] = aux;
				j= j-1;
			}
		}
		for(i=0;i<n;i++){
			if(i != n-1){
				System.out.printf("%d ",A[i]);
			} else{
				System.out.printf("%d\n",A[i]);
			}	
		}

	}
}
