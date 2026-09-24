
public class ItemVenda {

    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double subtotal() {
    	double subtotal = produto.getPreco() * quantidade;
    	if (this.verificaDesconto()) {
    		return subtotal * 0.9;
    	}
        return subtotal;
    }

    private boolean verificaDesconto() {
        return quantidade >= 20;
    }
}
