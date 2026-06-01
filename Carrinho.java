// Contexto do Strategy: aplica qualquer estratégia de desconto
public class Carrinho {

    private String           produto;
    private double           preco;
    private DescontoStrategy estrategia;

    public Carrinho(String produto, double preco) {
        this.produto = produto;
        this.preco   = preco;
    }

    public void setEstrategia(DescontoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void exibirTotal() {
        if (estrategia == null) {
            System.out.printf("  %-20s | Sem desconto     | Total: R$ %.2f%n", produto, preco);
            return;
        }
        double desconto = estrategia.calcular(preco);
        double total    = preco - desconto;
        System.out.printf("  %-20s | %-25s | Desconto: R$ %.2f | Total: R$ %.2f%n",
            produto, estrategia.descricao(), desconto, total);
    }
}
