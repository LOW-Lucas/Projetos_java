import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pre�o;
		int ma�a;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de ma�as compradas");
        ma�a = input.nextInt();
        if(ma�a>=12) {
         pre�o = 0.25 * ma�a;
         System.out.println("A quantidade de ma�as que voc� comprou foi "+ma�a);
         System.out.printf("O pre�o foi: R$: %.2f %n",pre�o);
        }else {
            pre�o = 0.35 * ma�a;
            System.out.println("A quantidade de ma�as que voc� comprou foi "+ma�a);
            System.out.printf("O pre�o foi: R$: %.2f %n",pre�o);
        }
        
	}

}
