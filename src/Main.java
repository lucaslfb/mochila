import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

            String textoInfo = "Digite o peso e logo após o ponto digite o valor (ex: 4.2): ";
            System.out.println(textoInfo);
            //abaixo os 5 objetos.
            String box0 = leitor.nextLine();
            String box1 = leitor.nextLine();
            String box2 = leitor.nextLine();
            String box3 = leitor.nextLine();
            String box4 = leitor.nextLine();
            //abaixo utilizo o split.
            String[] num0 = box0.split("\\.");
            String[] num1 = box1.split("\\.");
            String[] num2 = box2.split("\\.");
            String[] num3 = box3.split("\\.");
            String[] num4 = box4.split("\\.");
            //utilizo o 'split' através da 'string' e convertendo em 'double' simultâneamente.

            //peso. primeiro valor antes do ponto.
            double peso0 = Double.parseDouble(num0[0]);
            double peso1 = Double.parseDouble(num1[0]);
            double peso2 = Double.parseDouble(num2[0]);
            double peso3 = Double.parseDouble(num3[0]);
            double peso4 = Double.parseDouble(num4[0]);

            //mesmo esquema anterior, porém para o segundo valor.
            //preço. segundo valor depois do ponto.
            double preco0 = Double.parseDouble(num0[1]);
            double preco1 = Double.parseDouble(num1[1]);
            double preco2 = Double.parseDouble(num2[1]);
            double preco3 = Double.parseDouble(num3[1]);
            double preco4 = Double.parseDouble(num4[1]);

            //variáveis responsáveis pelo peso e preço(if e else).
            boolean pode;
            //peso
            double pesoProduto = peso0+peso1+peso2+peso3+peso4;
            double pesoInteiro = Math.round(pesoProduto);
            //preço
            double precoProduto = preco0 + preco1 + preco2 + preco3 + preco4;
            double precoInteiro = Math.round(precoProduto);

        if (pesoProduto > 15.0) {
            pode = false;
                System.out.println("Opa! calma lá amigão, isso não é um treinamento do BOPE, só carregue até 15kg."
                        + "\nMas caso queira saber, sua mochila pesa: " + pesoInteiro + "kg" + "\nE está avaliada em: " + precoInteiro + "$");
                                pesoProduto = leitor.nextDouble();
        }
        else {
            System.out.println("Ótimo, a mochila está perfeita para uso sem rasgar!\nAproveite a viagem e tome cuidado!");
        }
        System.out.println("Sua mochila está pesando: " + pesoInteiro + "kg" + "\nO valor da sua mochila é: " + precoInteiro + "$");
    }
}