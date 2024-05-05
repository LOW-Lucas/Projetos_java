import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int valor1;
	       Scanner input = new Scanner(System.in);
	       System.out.println(" Digite o primeiro valor: ");
	       valor1 = input.nextInt();
		   int valor2;
	       System.out.println(" Digite o segundo valor: ");
	       valor2 = input.nextInt();
	       if(valor1>valor2) {
		       System.out.println("o valor: "+valor1);
	       }else {
	    	   System.out.println("o valor: "+valor2) ;
	       }
	}

}
