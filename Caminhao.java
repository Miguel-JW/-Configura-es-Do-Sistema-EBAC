public class Caminhao implements Veiculo {
    @Override public void   mover()    { System.out.println("  🚚 Caminhão em movimento!"); }
    @Override public void   parar()    { System.out.println("  🚚 Caminhão parando devagar..."); }
    @Override public String getTipo()  { return "Caminhão"; }
}
