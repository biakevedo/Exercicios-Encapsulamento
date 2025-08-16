public class AlunoExercicio {

    private String nome;
    private int nota;
    private int sala;
    private int turma;
    private String professor;

    public AlunoExercicio(String nome, int nota, int sala, int turma, String professor, int nota1, String professor1, int sala1, int turma1) {
        this.nome = nome;
        this.nota = nota;
        this.sala = sala;
        this.turma = turma;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    {

        // Método para exibir informações
        public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Sala: " + sala);
        System.out.println("Turma: " + turma);
        System.out.println("Professor: " + professor);
    }
    }
}
