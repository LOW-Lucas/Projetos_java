import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int idade;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = input.nextInt();
        if(idade<18) {
        	  System.out.println("Não pode entrar");
        }else {
        	System.out.println("Pode entrar");
        }
	}

}