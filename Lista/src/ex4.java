import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preço;
		int maça;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de maças compradas");
        maça = input.nextInt();
        if(maça>=12) {
         preço = 0.25 * maça;
         System.out.println("A quantidade de maças que você comprou foi "+maça);
         System.out.printf("O preço foi: R$: %.2f %n",preço);
        }else {
            preço = 0.35 * maça;
            System.out.println("A quantidade de maças que você comprou foi "+maça);
            System.out.printf("O preço foi: R$: %.2f %n",preço);
        }
        
	}

}
