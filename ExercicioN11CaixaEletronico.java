import java.util.Scanner;

public class ExercicioN11CaixaEletronico {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao Caixa Eletronico ");
        System.out.println("Escolha uma opção: ");
        System.out.println("1.(Exibir Saldo), 2.(Exibir Extrato), 3.(Depositar), 4.(Sacar), 5.(Sair). ");
        num1 = input.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Exibindo Saldo... ");
                break;
            case 2:
                System.out.println("Exibindo Extrato... ");
                break; 
            case 3:
                System.out.println("Depositando... ");
                break;
            case 4:
                System.out.println("Sacando... ");
                break;
            case 5:
                System.out.println("Saindo... ");
                break;
            default: 
                System.out.println("Erro opção invalida ");
            }
            input.close();
    }
}
