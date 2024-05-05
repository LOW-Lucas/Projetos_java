package prova;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor;
        Scanner input = new Scanner(System.in);
	       System.out.println("Digite qualquer valor inteiro");
	       valor = input.nextInt();
	       if(valor>0) {
	    	   System.out.println("O numero é positivo");  
	       }else if(valor<0) {
	    	   System.out.println("O numero é negativo");
	       }else if(valor==0) {
	    	   System.out.println("O numero é zero");
	       }else {
	    	   System.out.println("ERRO");
	       }
 }
}
