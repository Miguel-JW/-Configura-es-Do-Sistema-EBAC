public class DescontoVIP implements DescontoStrategy {
    @Override
    public double calcular(double preco) { return preco * 0.30; }

    @Override
    public String descricao() { return "Desconto VIP (30%)"; }
}
