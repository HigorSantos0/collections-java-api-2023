package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    List<Item> compra;

    public CarrinhoDeCompra(){
        this.compra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        compra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> remover = new ArrayList<>();
        for(Item i: compra){
            if(i.getNome().equalsIgnoreCase(nome)){
                remover.add(i);
            }
        }
        compra.removeAll(remover);
    }

    public double calcularValorTotal(){
        List<Item> calcular = new ArrayList<>();
        double precoTotal = 0;
        for(Item c: compra) {
            int quant = c.getQuantidade();
            double p = c.getPreco();

            precoTotal += quant * p;
        }
        return precoTotal;
    }

    public void exibiritens(){
        System.out.println(compra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarItem("Leite", 5.0, 2);
        carrinho.adicionarItem("Biscoito", 3.0, 2);
        carrinho.adicionarItem("Carne", 4.0, 2);
        carrinho.removerItem("Carne");
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibiritens();
    }


}
