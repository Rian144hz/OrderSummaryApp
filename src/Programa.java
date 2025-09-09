import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500, Categoria.ELETRONICOS));
        produtos.add(new Produto("Camisa rariorg", 130, Categoria.ROUPAS));
        produtos.add(new Produto("Combo do bk", 50, Categoria.ALIMENTOS));
        double total = 0;
        for (Produto p : produtos) {
            p.mostrarInfo();
            total += p.getPreco();
        }
        System.out.printf("Total da compra: $ %.2f%n " , total);
    }

}

