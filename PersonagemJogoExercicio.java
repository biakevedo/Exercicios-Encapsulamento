public class PersonagemJogoExercicio {


    private String nome;
    private int nivel;
    private int pontosDeVida;


    public PersonagemJogoExercicio(String nome, int nivel, int pontosDeVida) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
}

    // Método
    public void receberDano(int dano) {
     this.pontosDeVida -= dano;
        if (this.pontosDeVida < 0) {
          this.pontosDeVida = 0; // O personagem não pode ter pontos de vida negativos
    }
}

    // Método
    public void subirDeNivel() {
         this.nivel++;
}

    // Métodos getters e setters (encapsulamento)
    public String getNome() {
     return nome;
}

    public void setNome(String nome) {
     this.nome = nome;
}

    public int getNivel() {
     return nivel;
}

    public void setNivel(int nivel) {
     this.nivel = nivel;
}

    public int getPontosDeVida() {
     return pontosDeVida;
}

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
}

    // Método para exibir o status do personagem
    public void exibirStatus() {
         System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Pontos de Vida: " + pontosDeVida);
}





}


