import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nadador;
		int idade;
        Scanner input = new Scanner(System.in);
	       System.out.println("Digite o numero de nadadores");
	       nadador = input.nextInt();
	    for(int contador = 1; contador<nadador ;  contador ++){
		       System.out.println("Digite a idade do(s) aluno(s)");
		       idade = input.nextInt();
		       
	        if(idade>=5 && idade<=18) {
		switch(idade) {
		  case 5:
		    System.out.println("Infantil A");
		    break;
		  case 6:
		    System.out.println("Infantil A");
		    break;
		  case 7:
			  System.out.println("Infantil A");
			  break;
		  case 8:
		    System.out.println("Infantil B");
		    break;
		  case 9:
		     System.out.println("Infantil B");
			 break;
		  case 10:
			  System.out.println("Infantil B");
			  break;
		  case 11:
			    System.out.println("Infantil B");
			    break;
		  case 12:
			    System.out.println("Juvenil A");
			    break;
		  case 13:
			    System.out.println("Juvenil A");
			    break;
		  case 14:
			    System.out.println("Juvenil B");
			    break;
		  case 15:
			    System.out.println("Juvenil B");
			    break;
		  case 16:
			    System.out.println("Juvenil B");
			    break;
		  case 17:
			    System.out.println("Juvenil B");
			    break;
		}}else if(idade>=18) {
			System.out.println("Adulto");	
		} else {
			System.out.println("ERRO");
		}
			    
	}
	    
	
        }
}
