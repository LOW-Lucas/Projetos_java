import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers1;
int numbers2;
int resu;

 Scanner input = new Scanner(System.in);
 System.out.println("Digite o primeiro valor");
 numbers1 = input.nextInt();
 System.out.println("Digite o segundo valor");
 numbers2 = input.nextInt();
 resu = numbers1 + numbers2;
 System.out.println("A soma é "+ resu);
	}

}
