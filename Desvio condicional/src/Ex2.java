import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int idade;
        Scanner input = new Scanner(System.in);
        boolean amigoDoDono = true;
        System.out.println("Digite a idade: ");
        idade = input.nextInt();
        if(idade>18 && amigoDoDono==true){
        System.out.println("Pode entrar");
	}else{
		System.out.println("Não pode entrar");
	}
  }
}
