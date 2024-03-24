import java.util.Scanner;

public class ExercicioN1Diivisão {
    public static void main(String[] args) throws Exception {
        double num1;
        double num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextDouble();

        double total = num1 / num2;

        System.out.println(" A divisão dos dois numero é igual: " + total);

        input.close(); 
    }
}
