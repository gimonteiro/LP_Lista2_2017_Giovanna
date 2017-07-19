import java.util.*;

class Questao6D{
	public static void minmax(int [] vec, int n, int[] resul) {
		int i=0;
		 resul[0] = vec[0];
		 resul[1] = vec[0];
	
			for (i=1; i<n; i++){
				if(vec[i] < resul[0]){
				resul[0] = vec[i];
				}
				if(vec[i] > resul[1]){
				resul[1] = vec[i];
				}
			}
	}
	
	public static void main (String [] args){
		int i=0, n=0;
		int[] resul= new int [2];
		Scanner scan = new Scanner (System.in);
		System.out.printf("Digite o Tamanho do Vetor\n");
			n = scan.nextInt();
		int[] vec = new int[n];
		for(i=0;i<n;i++){
			vec[i] = scan.nextInt();
		}
		minmax(vec,n,resul);
		System.out.printf("O mim é: %d. \n",resul[0]);
		System.out.printf("O max é: %d. \n",resul[1]);
	}
}
