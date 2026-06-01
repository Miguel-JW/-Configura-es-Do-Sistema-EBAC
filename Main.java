public class Main {
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("          🏗️   Padrões de Projeto               ");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ── SINGLETON ─────────────────────────────────────
        System.out.println("\n── Padrão 1: Singleton ───────────────────────");
        GerenciadorSistema g1 = GerenciadorSistema.getInstancia();
        GerenciadorSistema g2 = GerenciadorSistema.getInstancia();

        g1.registrarAcesso("Miguel");
        g2.registrarAcesso("Ana");
        g1.registrarAcesso("Carlos");

        System.out.println("  Mesma instância? " + (g1 == g2));
        System.out.println("  Total de acessos: " + g1.getTotalAcessos());

        // ── FACTORY ───────────────────────────────────────
        System.out.println("\n── Padrão 2: Factory ─────────────────────────");
        String[] tipos = {"carro", "moto", "caminhao"};

        for (String tipo : tipos) {
            Veiculo v = VeiculoFactory.criar(tipo);
            System.out.println("  Criado: " + v.getTipo());
            v.mover();
            v.parar();
        }

        // ── STRATEGY ──────────────────────────────────────
        System.out.println("\n── Padrão 3: Strategy ────────────────────────");
        Carrinho carrinho = new Carrinho("Notebook", 4500.00);

        carrinho.setEstrategia(null);
        carrinho.exibirTotal();

        carrinho.setEstrategia(new DescontoEstudante());
        carrinho.exibirTotal();

        carrinho.setEstrategia(new DescontoVIP());
        carrinho.exibirTotal();

        carrinho.setEstrategia(new DescontoBlackFriday());
        carrinho.exibirTotal();
    }
}
