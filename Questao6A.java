import java.util.*;
class Questao6A{
	
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		float N1,N2,N3,N4,MD,NOVA_MD,EX=0;
		N1 = scan.nextFloat();
		N2 = scan.nextFloat();
		N3 = scan.nextFloat();
		N4 = scan.nextFloat();
		MD = (N1+N2+N3+N4)/4;
		if(MD>=7){
			System.out.printf("Aluno Aprovado %f\n",MD);
		} else {
			EX = scan.nextFloat();
			NOVA_MD = (MD + EX) /2;
			if (NOVA_MD >= 5) {
				System.out.printf("Aluno Aprovado em Exame %f\n",NOVA_MD);
				} else {
				System.out.printf("Aluno Reprovado %f\n",NOVA_MD);
				}
		
		}
	}

}
