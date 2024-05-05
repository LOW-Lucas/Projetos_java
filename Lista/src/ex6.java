import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sexo;
		double altura;
		double ideal;
		double ideall;
	       Scanner input = new Scanner(System.in);
	       System.out.println(" Digite 1 para masculino, e 2 para feminino");
	       sexo = input.nextInt();
	       System.out.println(" Digite a sua altura ");
	       altura = input.nextDouble();
	       if(sexo==1) {
	    	   ideal = 72.7*altura;
	    	   ideall= ideal-58;
	       System.out.printf("O seu peso ideal é: %.2f %n\"",ideall);
	       }else if(sexo==2) {
	    	   ideal = 62.1*altura;
	    	   ideall= ideal-44.7;
		       System.out.printf("O seu peso ideal é: %.2f %n\"",ideall);
	       }else {
	    	   System.out.println("ERRO");
	       }
	}

}
