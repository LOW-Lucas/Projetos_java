import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1;
		int valor2;
		int valor3;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        valor1 = input.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = input.nextInt();
        System.out.println("Digite o terceiro valor");
        valor3 = input.nextInt();
        if(valor1>valor2 && valor2>valor3 && valor1>valor3) {
            System.out.println("Primeiro "+valor1);
            System.out.println("Segundo "+valor2);
            System.out.println("Terceiro "+valor3);
        }else if(valor1<valor2 && valor2>valor3 && valor1>valor3) {
            System.out.println("Primeiro "+valor2);
            System.out.println("Segundo "+valor1);
            System.out.println("Terceiro "+valor3);
        }else if(valor1<valor2 && valor2<valor3 && valor1<valor3) {
            System.out.println("Primeiro "+valor3);
            System.out.println("Segundo "+valor2);
            System.out.println("Terceiro "+valor1);
        }else if(valor1<valor2 && valor2>valor3 && valor1<valor3) {
            System.out.println("Primeiro "+valor2);
            System.out.println("Segundo "+valor3);
            System.out.println("Terceiro "+valor1);
        }else if(valor1>valor2 && valor2<valor3 && valor1<valor3) {
            System.out.println("Primeiro "+valor1);
            System.out.println("Segundo "+valor2);
            System.out.println("Terceiro "+valor3);
        }else if(valor1>valor2 && valor2<valor3 && valor1>valor3) {
            System.out.println("Primeiro "+valor1);
            System.out.println("Segundo "+valor3);
            System.out.println("Terceiro "+valor2);
        }else {
        	System.out.println("Erro");
        
        		
        
        		
        
        
	}
	}
}
