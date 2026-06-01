// Singleton: garante que só exista uma instância do gerenciador
public class GerenciadorSistema {

    private static GerenciadorSistema instancia;
    private String  nomeDoSistema;
    private int     totalAcessos;

    private GerenciadorSistema() {
        this.nomeDoSistema = "Sistema de Gestão v1.0";
        this.totalAcessos  = 0;
    }

    public static GerenciadorSistema getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorSistema();
        }
        return instancia;
    }

    public void registrarAcesso(String usuario) {
        totalAcessos++;
        System.out.println("  [" + nomeDoSistema + "] Acesso #" + totalAcessos + " por: " + usuario);
    }

    public int    getTotalAcessos()  { return totalAcessos; }
    public String getNomeDoSistema() { return nomeDoSistema; }
}
