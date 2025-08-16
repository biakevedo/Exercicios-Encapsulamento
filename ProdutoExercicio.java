public class ProdutoExercicio {

    // Atributos
    private String nome;
    private double preco;
    private int estoque;
    private String marca;


    public ProdutoExercicio(String nome, double preco, String marca, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.estoque = estoque;
    }


    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }

    // get
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getMarca() {
        return marca;
    }

    // sett
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço deve ser um valor positivo.");
        }
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Método
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque adicionado. Novo estoque: " + estoque);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    // Método venda
    public void realizarVenda(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada. Novo estoque: " + estoque);
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }
}

