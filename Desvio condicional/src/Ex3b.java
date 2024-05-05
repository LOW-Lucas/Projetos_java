import java.util.Scanner;
public class Ex3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
        String resposta;
        Scanner input = new Scanner(System.in);
        System.out.println("Voce é amigom do dono?");
        resposta = input.next();
        resposta = resposta.toUpperCase();
        System.out.println(" Digite a idade: ");
        idade = input.nextInt();
        if(resposta.equals ("SIM") || idade >18) {
        	System.out.println("POde entrar");
	}else {
		System.out.println(" Não pode entrar");	
	}
  }
}
