import java.util.Scanner;

public class ExercicioN10LojinhaAboo {
    public static void main(String[] args) {
        float valorCompra, valorVenda, lucro = 0;
        String nomeProduto;
        Scanner input = new Scanner(System.in);

        System.out.println("Lojinha do Sr. Aboo ");
        System.out.println("Informe o nome do produto a ser adquirido: ");
        nomeProduto = input.next();
        System.out.println("Informe o valor do Produto: ");
        valorCompra = input.nextFloat();
        
        if (valorCompra < 10) {
            lucro = valorCompra * 0.7f; 
            System.out.println("O valor de lucro é: 70% ");
        }  
        else if (valorCompra <= 30 && valorCompra < 30) {
            lucro = valorCompra * 0.5f; 
            System.out.println("O valor de lucro é: 50% ");
         }
         else if (valorCompra >= 30 && valorCompra < 50){
            lucro = valorCompra * 0.4f;
            System.out.println("O valor do lucro é: 40% ");
         }
         else if (valorCompra >= 50){
            lucro = valorCompra * 0.3f;
            System.out.println("O valor do lucro é: 30% ");
         }
         valorVenda = valorCompra + lucro;
         System.out.println("O item deve ser vendido à: " + valorVenda);
         
         input.close();
        }
    }
