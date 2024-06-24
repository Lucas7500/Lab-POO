public class Responsavel {
    private String nome;
    private String telefone;

    public String getNome() {
        return this.nome;
    }

    public Responsavel(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override public String toString() {
        return String.format("%s | Telefone: %s", this.getNome(), this.getTelefone());
    }
}