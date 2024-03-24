import java.util.Scanner;

public class ExercicioN7Preço {
    public static void main(String[] args) {
        float preçoUni, quantidadeP, total, desconto = 0;
        String nome;
        Scanner input = new Scanner(System.in);
            
            System.out.println(" Digite nome do produto: ");
            nome = input.next();
            System.out.println(" Digite o preço do produto: ");
            preçoUni = input.nextFloat();
            System.out.println(" Digite a quantidade a ser adquirida do produto: ");
            quantidadeP = input.nextFloat();
            total = quantidadeP * preçoUni;

            if(quantidadeP <= 5){ 
                desconto = 0.02f * total; 
                System.out.println("Ganhou 2% de desconto: ");
             }
             else if (quantidadeP > 5 && quantidadeP <=10) {
                desconto = 0.03f * total;
                System.out.println("Ganhou 3% de desconto: ");
             }
             else if (quantidadeP > 10 && quantidadeP < 30) { 
                desconto = 0.05f * total;
                System.out.println("Ganhou 5% de desconto: " );
             }
             else if (quantidadeP >= 30) { 
                desconto = 0.1f * total;
                System.out.println("Ganhou 10% de desconto: ");
             }
             
             total -= desconto;
             
                System.out.println("O valor total mais desconto é: " + total);
                input.close();
        }
     }
    
 