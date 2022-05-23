import java.util.*;

public class Main
{
	public static void main(String[] args) {
        System.out.println("Qual a variavel vc deseja buscar? :( a , b , c )");
        Scanner pita = new Scanner(System.in);
        String variavel = pita.next();
        
        if (variavel.equals("a")){
            System.out.println("Digite o valor do cateto_adjacente :");
        double c = pita.nextDouble(); 
        System.out.println("Digite o valor do cateto_oposto :");
        double b = pita.nextDouble();
            	double a = Math.sqrt((b*b)+(c*c));
        	System.out.println("O valor da variavel a é "+a);
        } 
       else if (variavel.equals("b")){
            
            System.out.println("Digite o valor da hipotenusa :");
            double a = pita.nextDouble();
            System.out.println("Digite o valor do cateto_adjacente :");
            double c = pita.nextDouble();
            while (c>a){
                 System.out.println("O cateto_adjacente não pode ser maior que a hipotenusa! tente novamente:");
                 c = pita.nextDouble();
            }
           double b = Math.sqrt((a*a)-(c*c)); 
           System.out.println("O valor da variavel b é "+b);
        }
        else if (variavel.equals("c")){
            System.out.println("Digite o valor do cateto_oposto :");
        double b = pita.nextDouble();
            System.out.println("Digite o valor da hipotenusa :");
            double a = pita.nextDouble();while (b>a){
                 System.out.println("O cateto_oposto não pode ser maior que a hipotenusa! tente novamente:");
                 b = pita.nextDouble();
            }
            double c = Math.sqrt((b*b)-(a*a)); 
            System.out.println("O valor da variavel c é "+c);
        }
        else{
        System.out.println("Você digitou uma variavel inválida");
        }
        
        
	   	}
}
