package prova;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso;
		double altura, imc;
        Scanner input = new Scanner(System.in);
	       System.out.println("Digite o seu peso");
	       peso = input.nextInt();
	       System.out.println("Digite a sua altura");
	       altura = input.nextDouble();
	       imc = peso/ (altura*altura);
	       if(imc<18.5) {
	    	   System.out.println("Vocé está abaixo do peso ideal"); 
	       }else if(imc>=18.5 && imc<=24.9 ) {
	    	   System.out.println("Parabens -- você está em seu peso normal!");
	       }else if(imc>=25 && imc<=29.9 ) {
	    	   System.out.println("Você está acima de seu peso (sobrepeso)");
	       }else if(imc>=30 && imc<=34.9 ) {
		       System.out.println("Obesidade grau I");
	       }else if(imc>=35 && imc<=39.9 ) {
		       System.out.println("Obesidade grau II");
	       }else if(imc>=40) {
		       System.out.println("Obesidade grau III");
	       }
	       
	}

}
