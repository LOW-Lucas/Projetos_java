import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
        String amigoDoDono;
        Scanner input = new Scanner(System.in);
        System.out.println(" Digite a idade: ");
        idade = input.nextInt();
        System.out.println("Voce é amigom do dono?");
        amigoDoDono = input.next();
        if(idade>18 && amigoDoDono.toUpperCase().equals ("SIM")) {
        	System.out.println("POde entrar");
	}else {
		System.out.println(" Não pode entrar");	
	}
  }
}
