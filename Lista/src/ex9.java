import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
	    int p�;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor");
        valor = input.nextInt();
        p�=valor%2;
        if(p�==0 && valor>0) {
            System.out.println("O numero "+ valor +" � par");
        }else if(p�!=0 && valor>0 ) {
            System.out.println("O numero "+ valor +" � impar");
        }else if(valor<0) {
            System.out.println("O numero "+ valor +" � negativo");
        }else {
        	System.out.println("ERRO");
        }
	}   

}
