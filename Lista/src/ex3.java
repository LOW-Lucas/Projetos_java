import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int senha;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha");
        senha = input.nextInt();
        if(senha==1234) {
        	System.out.println("ACESSO PERMITIDO");
        }else {
        	System.out.println("ACESSO NEGADO");

        }
	}
        

}
