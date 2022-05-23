import java.util.*;
public class Main{

    public static void main (String[]args){
        Scanner divide = new Scanner(System.in);
        System.out.println ("Digite a quantidade de pessoas da empresa: ");
        int pessoas = divide.nextInt();
        int rh = (pessoas * 25 / 100) / 2;
        int admin = rh;
        int fin = (pessoas - (rh*2))/3;
        int vendas = fin * 2;
        System.out.println("RH: "+rh+"\nAdmin: "+admin+"\nFinanceiro: "+fin+"\nVendas: "+vendas);
    }

}
