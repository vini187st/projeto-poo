import java.util.Scanner;
public class Frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase(); // Converter para minúsculas para comparar vogais

        int contadorVogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na frase: " + contadorVogais);

        scanner.close();
    }
}