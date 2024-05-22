import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para contar até ele: ");
        int limite = scanner.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
