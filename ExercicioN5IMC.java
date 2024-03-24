import java.util.Scanner;

public class ExercicioN5IMC {
    public static void main(String[] args) {
        float altura, peso;
        double imc;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a altura em centimetros: ");
        altura = input.nextFloat();

        System.out.println("Informe seu peso em KG: ");
        peso = input.nextFloat();

        altura = altura / 100;
        imc = peso / (altura * altura);
        System.out.println("O valor do imc é: " + imc);

        if (imc < 20){ 
            System.out.println("Abaixo do peso!");
         }
         else if (imc >= 20 && imc < 25) { 
            System.out.println("Peso normal");
         }
         else if (imc >= 25 && imc < 30) { 
            System.out.println("Sobrepeso ");
         }
        else if (imc >= 30 && imc < 40) { 
            System.out.println("Obeso ");
         }
        else if (imc >= 40) { 
                System.out.println("Obeso Morbido ");
         }

        input.close();
    }
    
}