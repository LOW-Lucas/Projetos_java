
	import java.util.Scanner;

	public class Bissexto {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       int ano;
	       int dia; 
	       Scanner input = new Scanner(System.in);
	       System.out.println("Digite o ano: ");
	       ano = input.nextInt();
	       int con1;
	       int con2;
	       int con3; 

	       dia=365*ano;
	       con1 = dia%4;
	       con2 = dia%100;
	       con3 = dia%400;
	       if((con1==0 && con2!=0) ||con3==0) {
	       System.out.println("É bissexto ");
	       }else {
	       System.out.println("Não é bissexto ");
	       }
		}

	}

