
public class Produto {

    private double preco;
    private String codigo;

    public Produto(double preco, String codigo) {
        this.preco = preco;
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

	public String getCodigo() {
		return codigo;
	}
    
}