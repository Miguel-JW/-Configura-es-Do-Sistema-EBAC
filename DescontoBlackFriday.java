public class DescontoBlackFriday implements DescontoStrategy {
    @Override
    public double calcular(double preco) { return preco * 0.50; }

    @Override
    public String descricao() { return "Desconto Black Friday (50%)"; }
}
