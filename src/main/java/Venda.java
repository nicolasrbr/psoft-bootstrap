
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens;
    private Cliente cliente;
    private Pagamento pagamento;
    private String data;

    public Venda(Cliente c, String data) {
        this.cliente = c;
        this.data = data;
        this.itens = new ArrayList<>();
        this.pagamento = null;
    }

    public int addItem(Produto p, int qtd) {
        ItemVenda item = new ItemVenda(p, qtd);
        this.itens.add(item);

        return this.itens.size() - 1;
    }

    public boolean removeItem(int i) {
        if (i < 0 || i >= itens.size()) {
            return false;
        }

        itens.remove(i);
        return true;
    }

    public boolean addPagamento() {

        double valor = 0;

        for (ItemVenda item : itens) {
            valor += item.subtotal();
        }

        this.pagamento = new Pagamento(valor);

        return true;
    }

    public boolean verificaPagamento() {
        return pagamento.isRealizado();
    }
}
