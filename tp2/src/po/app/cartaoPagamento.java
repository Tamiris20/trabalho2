package po.app;

public interface cartaoPagamento {
    public boolean pagar(double valor);
    public void creditar(double valor);
}
