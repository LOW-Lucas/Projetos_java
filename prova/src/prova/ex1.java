package prova;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int placa;
        Scanner input = new Scanner(System.in);
	       System.out.println("Digite o ultimo numero da sua placa");
	       placa = input.nextInt();
	
	      
	          if(placa==1 || placa==2) {
	    	System.out.println("Você não pode rodar na segunda-feira");
	    }else if(placa==3 || placa==4) {
	    	System.out.println("Você não pode rodar na terça-feira");
	    }else if(placa==5 || placa==6) {
	    	System.out.println("Você não pode rodar na quarta-feira");
	    }else if(placa==7 || placa==8) {
	    	System.out.println("Você não pode rodar na quinta-feira");
	    }else if(placa==9 || placa==0) {
	    	System.out.println("Você não pode rodar na sexta-feira");
	    }else {
	    	System.out.println("ERRO");
	    }


	
	}

}
