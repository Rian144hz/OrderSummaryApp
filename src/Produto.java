public class Produto {
    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto(){
    }
    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void mostrarInfo(){
        System.out.println("Produto: "+nome);
        System.out.printf("Preço: %.2f%n ",preco);
        System.out.println("Categoria: "+categoria);
        System.out.println("-----------------------------");
    }
}
