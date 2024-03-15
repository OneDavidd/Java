public class Evento {
    private String nome;
    private String data;
    private float preco;
    private int qtdIngressos;
    private int qtdIngressosVendidos;

    public Evento(String nome, String data, float preco, int qtdIngressos) {
        this.nome = nome;
        this.data = data;
        this.preco = preco;
        this.qtdIngressos = qtdIngressos;
        this.qtdIngressosVendidos = 0;
    }

    public void venderIngresso(int quantidade) {
        if (quantidade > 0 && quantidade <= (qtdIngressos - qtdIngressosVendidos)) {
            qtdIngressosVendidos += quantidade;
            System.out.println(quantidade + " Ingresso(s) Foram Vendido(s) para o Show do '" + nome + "'.");
        } else {
            System.out.println("Esta Quantidade de Ingressos Está Indisponível para Venda.");
        }
    }
}
