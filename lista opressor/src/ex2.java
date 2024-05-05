import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		int x=0;
		String nome;
		int jog;
        Scanner input = new Scanner(System.in);      
        System.out.println(" Digite a quantidade de jogadores");
	       jog = input.nextInt();
	       while( x<jog ){
		       System.out.println("Digite o nome do seu time");
		       System.out.println(" 1- Corinthians");
		       System.out.println(" 2- Tricolor");
		       System.out.println(" 3- Palmeiras");
		       time = input.nextInt();
	    	   x++;
           if(time==3) {
		       System.out.println("Digite o seu nome");
		       nome = input.next();
	          System.out.println("Corinthians");
	          System.out.println(nome);
	       }else if(time==2) {
		       System.out.println("Digite o seu nome");
		       nome = input.next();
		          System.out.println("Tricolor");
		          System.out.println(nome);
	       }else if(time==3) {
		       System.out.println("Digite o seu nome");
		       nome = input.next();
		          System.out.println("Palmeiras");
		          System.out.println(nome);
	}
 }
	}
}
