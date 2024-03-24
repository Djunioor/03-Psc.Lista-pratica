/*Escreva um programa em Java para ler o número de votos brancos, nulos e válidos.
 Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */
import java.util.Scanner;

public class ExercicioN3Votos {

    public static void main(String[] args) {
        double validos;
        double nulos;
        double branco;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de votos Validos: ");
        validos = input.nextDouble();
        System.out.println("Digite o numero de votos Nulos: ");
        nulos = input.nextDouble();
        System.out.println("Digite o numero de votos em Branco: ");
        branco = input.nextDouble(); 

        double totalEleitores = validos + nulos + branco;
        double perBrancos = branco / totalEleitores * 100;
        double perNulos = nulos / totalEleitores * 100;
        double perValidos = validos / totalEleitores * 100;
        System.out.println("A porcentagem de eleitores que votaram nulo é: " + perNulos + " % ");
        System.out.println("A porcentagem de eleitores que votaram em branco é: " + perBrancos + " % ");
        System.out.println("A porcentagem de eleitores com votos validos é: " + perValidos + " % ");

        input.close();
    }
}