import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
	    int pá;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor");
        valor = input.nextInt();
        pá=valor%2;
        if(pá==0 && valor>0) {
            System.out.println("O numero "+ valor +" é par");
        }else if(pá!=0 && valor>0 ) {
            System.out.println("O numero "+ valor +" é impar");
        }else if(valor<0) {
            System.out.println("O numero "+ valor +" é negativo");
        }else {
        	System.out.println("ERRO");
        }
	}   

}
