import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Boolean menu = true;
        int opcao;
        double a, b;
        double conta;

        System.out.print("\033[H\033[2J");

        while (menu) {
            System.out.println(
                    "\nEscolha uma das Seguintes Opções Abaixo: \n" +
                            "1 - Soma \n" +
                            "2 - Subtração \n" +
                            "3 - Divisão \n" +
                            "4 - Multiplicação \n" +
                            "5 - Potenciação \n" +
                            "6 - Fatoração \n" +
                            "0 - Sair");

            opcao = in.nextInt();

            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.println("Digite o 1º Valor:");
                    a = in.nextDouble();
                    if (a < 0 || a > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    System.out.println("Digite o 2º Valor:");
                    b = in.nextDouble();
                    if (b < 0 || b > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    conta = a + b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("O Resultado da Soma é: " + conta);
                    break;
                case 2:
                    System.out.println("Digite o 1º Valor:");
                    a = in.nextDouble();
                    if (a < 0 || a > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    System.out.println("Digite o 2º Valor:");
                    b = in.nextDouble();
                    if (b < 0 || b > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    conta = a - b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("O Resultado da Subtração é: " + conta);
                    break;
                case 3:
                    System.out.println("Digite o 1º Valor:");
                    a = in.nextDouble();
                    if (a < 0 || a > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    System.out.println("Digite o 2º Valor:");
                    b = in.nextDouble();
                    if (b < 0 || b > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    conta = a / b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("O Resultado da Divisão é: " + conta);
                    break;
                case 4:
                    System.out.println("Digite o 1º Valor:");
                    a = in.nextDouble();
                    if (a < 0 || a > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    System.out.println("Digite o 2º Valor:");
                    b = in.nextDouble();
                    if (b < 0 || b > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    conta = a * b;
                    conta = Math.floor(conta * 100) / 100;
                    System.out.print("\033[H\033[2J");
                    System.out.println("O Resultado da Multiplicação é: " + conta);
                    break;
                case 5:
                    System.out.println("Digite o 1º Valor:");
                    a = in.nextDouble();
                    if (a < 0 || a > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    System.out.println("Digite o 2º Valor:");
                    b = in.nextDouble();
                    if (b < 0 || b > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    conta = Math.pow(a, b);
                    System.out.print("\033[H\033[2J");
                    System.out.println("O Resultado da Potenciação é: " + conta);
                    break;
                case 6:
                    System.out.println("Digite o Valor Desejado:");
                    a = in.nextDouble();
                    if (a < 0 || a > 50) {
                        System.out.println("Apenas Números Entre 0 e 50 São Permitidos!");
                        break;
                    }
                    System.out.print("\033[H\033[2J");
                    for (int i = 2; i <= a; i++) {
                        while (a % i == 0) {
                            System.out.print(i);
                            a /= i;
                            if (a != 1) {
                                System.out.print(" * ");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.print("\033[H\033[2J");
                    menu = false;
                    break;
            }

        }
    }

}
