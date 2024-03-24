import java.util.Scanner;

public class ExercicioN2Media {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        num1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        num2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        num3 = input.nextFloat();

        float media = num1 + num2 + num3 / 3;
        System.out.println(" A soma das notas do aluno é: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado! " );
    }
        else { 
            System.out.println(" Aluno Reprovado " );
             }
             input.close();

         }
}
