package carrinho;

public class ItemCompra {
    String descricao;
    int qtde;
    double preco;

    public ItemCompra(String descricao, int qtde, double preco) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public double calcSubTotal(){
        return 1;
    }
    
    public void mostraItem(){
        calcSubTotal();
    }
}
