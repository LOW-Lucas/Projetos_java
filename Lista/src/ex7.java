import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lado;
		 double medida;
		 double poli;
	       Scanner input = new Scanner(System.in);
	       System.out.println("Digite o numero de lados do poligono");
	       lado = input.nextInt();

	     if(lado==3) {
	       System.out.println("Digite a medida de qualquer ");
	       medida = input.nextDouble();   	
	       poli= (medida*medida)/2;      
	       System.out.println("TRIÂNGULO e o valor da área é: "+poli);
	     }else if(lado==4) {
		   System.out.println("Digite a medida de qualquer lado ");
		   medida = input.nextDouble();   	
		   poli= (medida*medida);      
		   System.out.println("QUADRADO e o valor da área é: "+poli);   
	     }else if(lado==5) {      
		   System.out.println("PENTÁGONO");
	}
	}
}
