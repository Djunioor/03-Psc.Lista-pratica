import java.util.Scanner;

public class ExercicioN8Triagulo {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        lado1 = input.nextDouble();
        System.out.println("Digite o segundo lado: ");
        lado2 = input.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        lado3 = input.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) { 
          if (lado1 == lado2 + lado3) { 
            System.out.println("o tringulo é equilatero ");
          }
          else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triangulo e isoceles ");
          }
          else { 
            System.out.println("O triângulo é escaleno.");
         }
         input.close();;
        
       }
    }
 }