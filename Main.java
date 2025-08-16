public class Main {
    public static void main(String[] args) {

        // Protege a Conta Bancária
        ContaBancariaExercicio minhaConta = new ContaBancariaExercicio("Pedro", 350);
        minhaConta.depositar(300);

        // Corrigido: Chamada do método getSaldo sem parâmetros
        System.out.println("Saldo atual: " + minhaConta.getSaldo()); // Forma correta

        // Produto
        ProdutoExercicio prod1 = new ProdutoExercicio("Monitor", 800, "Dell", 80);
        prod1.setNome("Monitor");
        prod1.setPreco(850.00); // Corrigido: usando setPreco
        prod1.setEstoque(80); // Atribuindo estoque via setter

        prod1.mostrarInformacoes();

        ProdutoExercicio prod2 = new ProdutoExercicio("Notebook", 5000, "Dell", 50);
        prod2.setNome("Notebook");
        prod2.setPreco(3000.00); // Corrigido: usando setPreco
        prod2.setEstoque(50); // Atribuindo estoque via setter

        // Dentro da classe Main...
        ProdutoExercicio notebook = new ProdutoExercicio("Notebook Gamer", 4500.0, "Dell", 10);
        System.out.println("Preço inicial: " + notebook.getPreco());

        notebook.setPreco(850); // Tentativa de definir um preço inválido
        notebook.setPreco(3000); // Definindo um preço válido
        System.out.println("Novo preço: " + notebook.getPreco());

        // Saída esperada no console:
        // Preço inicial: 4500.0
        // Erro: O preço deve ser um valor positivo.
        // Novo preço: 3000.0

        PersonagemJogoExercicio personagem = new PersonagemJogoExercicio("Bia", 1, 100);

        // Exibindo o status inicial
        personagem.exibirStatus();

        // O personagem recebe 30 de dano
        personagem.receberDano(30);
        personagem.exibirStatus();

        // O personagem sobe de nível
        personagem.subirDeNivel();
        personagem.exibirStatus();

        // Criando um aluno
        AlunoExercicio aluno1 = new AlunoExercicio("Carlos", 9, 101, 3, "Prof. João");

        // Mostrando as informações do aluno
        aluno1.getNome();

        // Alterando a nota do aluno
        aluno1.setNota(10);

        // Mostrando de novo
        aluno1.getNome();

        // Criando outro aluno
        AlunoExercicio aluno2 = new AlunoExercicio("Mariana", 8, 102, 2, "Prof. Maria");

        aluno2.getNome();



    }
}




