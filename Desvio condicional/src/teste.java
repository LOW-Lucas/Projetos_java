import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade ; 
        Scanner input = new Scanner(System.in);
        System.out.println(" Digite a idade: ");
        idade = input.nextInt();
		if (idade> 0) { 
		   if (idade> 16) { 
		      System.out.println ("Bem-vindo!"); 
		   } else { 
		      System.out.println ("Muito jovem"); 
		   } 
		} else { 
		   System.out.println ("Erro"); 
		} 
	}

}
