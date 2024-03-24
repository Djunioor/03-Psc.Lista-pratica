import java.util.Scanner;

public class ExercicioN9Voto {
    public static void main(String[] args) {
        int idade;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Informe dua idade: "); 
        idade = input.nextInt();

        if (idade < 16){ 
            System.out.println("Não é eleitor ");
        }
        else if (idade >= 16 && idade <= 17) { 
           System.out.println("Eleitor facultativo "); 
        }
        else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatorio ");
        }
        else if (idade > 65) { 
            System.out.println("Eleitor facultativo ");
        }
        input.close();
    }
}   
