import java.util.Scanner;

public class ExercicioN6Estação {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);

        System.out.println(" Digite um numero de 1 a 4: ");
        num1 = input.nextInt();
        
        switch (num1) {
            case 1:
              System.out.println("Primavera o tempo das flores ");
                break;
            case 2:
            System.out.println("Outono tempo de folhas caindo ");
                break;
            case 3:
            System.out.println("Verão tempo de Sol ");
                 break;
            case 4:
            System.out.println("Inverno tempo de agasalhos ");
                 break;
            default:
            System.out.println(" Numaero invalido tente novamente ");
            }
            input.close();
        }
}
