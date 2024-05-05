import java.util.Scanner;


public class atividade1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 double ht, vl, td, tdt, sb, sl, pd, t;
 Scanner input = new Scanner(System.in);
 System.out.println("Digite as horas trabalhadas");
 ht = input.nextDouble();
 System.out.println("Digite o valor da hora");
 vl = input.nextDouble();
 System.out.println("Digite o seu porcentual de desconto");
 pd = input.nextDouble();
 sb = ht * vl;
 tdt = pd/100;
 td = tdt * sb;
 sl = sb - td;
 System.out.printf("Salario liquido é R$%.2f",  (sl)); 
	}

}
