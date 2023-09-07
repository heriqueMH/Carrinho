
package carrinho;

public class Produto {
    int codigo;
    String descricao;
    float precoUnit;
   

    public Produto(int codigo, String descricao, float precoUnit) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnit = precoUnit;   
    }
    
//     public void mostraProduto(){;
//         System.out.println("");
//         System.out.println("Codigo........ : " + codigo);
//         System.out.println("Descricao..... : " + descricao);
//         System.out.println("Preço unitário : " + precoUnit);
//    }
}