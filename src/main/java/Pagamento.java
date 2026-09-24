
public class Pagamento {

    private double valor;
    private boolean realizado;

    public Pagamento(double valor) {
        this.valor = valor;
        this.realizado = false;
    }

    public boolean realizarPagamento() {
        this.realizado = true;
        return true;
    }

	public double getValor() {
		return valor;
	}

	public boolean isRealizado() {
		return realizado;
	}
}
