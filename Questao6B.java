import java.util.*;
class Questao6B{
	
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		int N,RESTO=0;
		N = scan.nextInt();
		RESTO = (N-2) * (N/2);
		if(RESTO == 0){
			System.out.printf("O VALOR "+N+" é PAR.\n");
		} else {
			System.out.printf("O VALOR "+N+" é IMPAR.\n");
		
		}
	}

}
