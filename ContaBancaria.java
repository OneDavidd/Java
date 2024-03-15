public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " Realizado com Sucesso.");
        } else {
            System.out.println("Valor do Depósito Deve ser Maior que Zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " Realizado com Sucesso.");
        } else {
            System.out.println("Valor Inválido para Saque ou Saldo Insuficiente.");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(221288, "Davizera", 1000.0);

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Nome do Titular: " + conta.getNomeTitular());
        System.out.println("Saldo= R$ " + conta.getSaldo());

        conta.depositar(500.0);
        conta.sacar(200.0);

        System.out.println("Saldo Atualizado= R$ " + conta.getSaldo());
    }
}