public class Moto implements Veiculo {
    @Override public void   mover()    { System.out.println("  🏍️  Moto acelerando!"); }
    @Override public void   parar()    { System.out.println("  🏍️  Moto freando..."); }
    @Override public String getTipo()  { return "Moto"; }
}
