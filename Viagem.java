import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        double velocidade, tempo, distancia, kmlitro;
        double consumo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a velocidade:");
        velocidade = ler.nextDouble();
        System.out.println("Digite o tempo gasto:");
        tempo = ler.nextDouble();
        System.out.println("Digite km/litro:");
        kmlitro = ler.nextDouble();
        distancia = velocidade * tempo;
        consumo = distancia /kmlitro;
        System.out.println("Consumo médio: "+ consumo);
    }
}