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
	    	   System.out.println("O numero � positivo");  
	       }else if(valor<0) {
	    	   System.out.println("O numero � negativo");
	       }else if(valor==0) {
	    	   System.out.println("O numero � zero");
	       }else {
	    	   System.out.println("ERRO");
	       }
 }
}
