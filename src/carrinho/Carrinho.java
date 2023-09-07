package carrinho;

import java.util.*;

public class Carrinho {
    double totalCompra;
    double porcDesconto;
    double valorPagar;
    ArrayList<ItemCompra> listaItens;

    public Carrinho(double totalCompra, double porcDesconto, double valorPagar, ArrayList<ItemCompra> listaItens) {
        this.totalCompra = totalCompra;
        this.porcDesconto = porcDesconto;
        this.valorPagar = valorPagar;
        this.listaItens = listaItens;
    }
    
    public void mostraCarrinho(){
        
    }
    
    public double somaValores(){
        double totalDaCompra = 0.0;
        
        return totalDaCompra;
    }
    
    public double calcDesconto(double totalDaCompra){
        double valorDesconto = 0.0;
        
        return valorDesconto;
    }
 
}
