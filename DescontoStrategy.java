// Strategy: define o contrato de cálculo de desconto
public interface DescontoStrategy {
    double calcular(double preco);
    String descricao();
}
