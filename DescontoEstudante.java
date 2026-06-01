public class DescontoEstudante implements DescontoStrategy {
    @Override
    public double calcular(double preco) { return preco * 0.15; }

    @Override
    public String descricao() { return "Desconto Estudante (15%)"; }
}
