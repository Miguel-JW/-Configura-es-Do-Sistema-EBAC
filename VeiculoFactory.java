// Factory: cria o veículo certo sem expor a lógica de instanciação
public class VeiculoFactory {

    public static Veiculo criar(String tipo) {
        switch (tipo.toLowerCase()) {
            case "carro":    return new Carro();
            case "moto":     return new Moto();
            case "caminhao": return new Caminhao();
            default: throw new IllegalArgumentException("⚠  Tipo de veículo desconhecido: " + tipo);
        }
    }
}
