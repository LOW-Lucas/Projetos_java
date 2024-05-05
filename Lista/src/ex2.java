import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano; 
		int idade;
	       Scanner input = new Scanner(System.in);
	       System.out.println(" Digite o ano do seu nascimento ");
	       ano = input.nextInt();
	       idade= 2019-ano;
	       if(ano<=12) {
		       System.out.println(" Você é criança, a sua idade é: " + idade );
	       }else if(idade>=12 && idade<16){
		       System.out.println(" Você é adolescente, a sua idade é: " + idade );
	       }else if(idade>=16 && idade<18){
	    	   System.out.println(" Você é jovem, a sua idade é: " + idade );
	       }else if(idade>=18 && idade<=56){
	    	   System.out.println(" Você é adulto, a sua idade é: " + idade );
	       }else if(idade>56){
		       System.out.println(" Você é velho, a sua idade é: " + idade );
	      

	       }
	}
}
