package main;

import com.mycompany.builder.Produto;
import com.mycompany.builder.ProdutoBuilder;

/**
 *
 * @author narizinho
 */
public class Principal {
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .id(1)
                .titulo("TV LCD")
                .descricao("Cor Preta")
                .marca("Nova")
                .modelo("Novo")
                .setCategoria("Eletrodomestico")
                .createProduto();
        System.out.println("Produto: "+produto);
    }
}
