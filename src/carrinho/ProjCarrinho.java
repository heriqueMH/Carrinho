package carrinho;

/*
S.I 3H11
Matheus Henrique de Oliveira Santos - 42208149
Gabriel Sanches Tofanelo - 42251631
Rodrigo Pampolin Mendes - 42230403
*/

import java.util.*;
import java.io.*;

public class ProjCarrinho {

    public static void main(String[] args) throws Exception {
        int g_opcao;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();
        
        try {
            System.out.println("Arquivo foi carregado com sucesso\n");

            FileReader arq = new FileReader("ListaProdutos.txt");
            BufferedReader linha = new BufferedReader(arq);

            String aux = linha.readLine();

            while (aux != null) {
                String[] dados = aux.split(";");
                //0 = codigo
                //1 = descricao
                //2 = preço unitario
                //? = qtde estoque

                Produto p1 = new Produto(Integer.parseInt(dados[0]), dados[1], Float.parseFloat(dados[2]));

                estoque.add(p1);
                aux = linha.readLine();
            }
            linha.close();
            System.out.println("Qtde de itens no carrinho: " + estoque.size());

//            for (int i = 0; i < estoque.size(); i++) {        //exibe a lista de produtos
//               estoque.get(i).mostraProduto();
//            }
            
            do {
                System.out.println("-: MENU DE OPÇÕES :-");
                System.out.println("1. Adicionar um novo produto");
                System.out.println("2. Pesquisar por um produto");
                System.out.println("3. Remover um produto");
                System.out.println("9999. Sair");
                System.out.print("Opção: ");
                g_opcao = entrada.nextInt();
                switch (g_opcao) {
                    case 1:
                        System.out.println("Adicionar");
                        break;
                    case 2:
                        System.out.println("Pesquisar");
                        break;
                    case 3:
                        System.out.println("Remover");
                        break;
                    case 9999:
                        break;
                    default:
                        System.out.println("\nOpção inválida.\n");
                        break;
                }
            } while (g_opcao != 9999);
            entrada.close(); 

        } catch (FileNotFoundException arq) {
            System.out.println("Arquivo nao foi carregado");
        }
    }
}
