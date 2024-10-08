import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);
    Produto p = new Produto();
        System.out.println("Digite o nome do produto: ");
        p.setNome(sc.nextLine());
        System.out.println("Digite o quantidade do produto: ");
        p.setQuantidadeestoque(sc2.nextInt());
        System.out.println("Digite a cor do produto: ");
        p.setCor(sc3.nextLine());
        System.out.println("Digite o codigo do produto: ");
        p.setCodigo(sc2.nextInt());
        System.out.println("Digite o tamanhoPeso do produto: ");
        p.setTamanhoPeso(sc2.nextDouble());
        System.out.println("Digite o preco do produto: ");
        p.setPreco(sc2.nextDouble());

        System.out.println("Escolha seu metodo de pagamento (Pix, Espécie, Transferência, Débito ou crédito");
        String formadepagamento = sc.next();

        if (formadepagamento.equalsIgnoreCase("Pix")||
            formadepagamento.equalsIgnoreCase("Transferencia")||
            formadepagamento.equalsIgnoreCase("Debito")) {

        double valor = p.getPreco() * 0.95;
            System.out.println("O preço com desconto é: %.2f%n"+ valor);
        }  else if (formadepagamento.equalsIgnoreCase("Crédito")){
            System.out.printf("O valor parcelado em 3x sem juros é: %.2f%n", p.getPreco()/3);
        } else if (formadepagamento.equalsIgnoreCase("Espécie")){
            System.out.println("Digite o valor que você ira dar:");
            double valor1 = sc4.nextDouble();
            double valor2 = p.getPreco() * 0.95;
            double troco = valor1 - valor2;
            if (troco >= 0) {

                double valor = p.getPreco() * 0.95;
                System.out.printf("O preço já com desconto é: %.2f%n", valor);
                System.out.printf("O troco é: %.2f%n", troco);

            }
        } else {
            System.out.println("Forma de pagamento inválido");
        }

    }
}

