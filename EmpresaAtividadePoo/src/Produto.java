public class Produto {
    private String nome;
    private float tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    public Produto(String nome, float tamanho, String tipo, String cor, String especificacao) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    public String getNome() {
        return this.nome;
    }

    public float getTamanho() {
        return this.tamanho;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getCor() {
        return this.cor;
    }

    public String getEspecificacao() {
        return this.especificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho ;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}