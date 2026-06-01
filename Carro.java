public class Carro implements Veiculo {
    @Override public void   mover()    { System.out.println("  🚗 Carro acelerando na estrada!"); }
    @Override public void   parar()    { System.out.println("  🚗 Carro freando..."); }
    @Override public String getTipo()  { return "Carro"; }
}
