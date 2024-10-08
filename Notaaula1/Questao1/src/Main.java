import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite a primeira nota: ");
        double nota = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        //calcula a media
        double media = (nota + nota2 + nota3) / 3;
        //verifica se está aprovado
        if (media >= 70) {
            System.out.println("aprovado");
        } else if (media < 40) {
            System.out.println("Reprovado");

        } else {
            System.out.println("Na final");
        }
    }
}
