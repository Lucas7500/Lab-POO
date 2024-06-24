package atvPooProdutosExercicio2;

public class Produto {
	private static int id = 0;
	
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private float valor;

    public Produto() {
    	Produto.id++;
        this.setCodigo(id);
    }

    public Produto(String nome) {
    	Produto.id++;
    	this.setCodigo(id);
        this.nome = nome;
    }

    public Produto(String nome, int quantidade) {
    	Produto.id++;
    	this.setCodigo(id);
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String nome, int quantidade, String tipo, float valor) {
    	Produto.id++;
    	this.setCodigo(id);
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getTipo() {
        return this.tipo;
    }

    public float getValor() {
        return this.valor;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void Vender(int quantidade) {
        if (this.quantidade < quantidade) {
            System.out.println("Não há estoque do produto " + getNome());
        }
        else {
            this.setQuantidade(getQuantidade() - quantidade);
            System.out.println("O valor total da venda foi R$" + getValor() + " reais.");
        }
    }

    public void Comprar(int quantidade) {
        this.setQuantidade(getQuantidade() + quantidade);
    }

    public void Comprar(int quantidade, float valor) {
        this.setQuantidade(getQuantidade() + quantidade);
        this.setValor(valor);
    }

    public void Consultar() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Valor: " + getValor());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println();
    }

    public void Inserir(String nome, int quantidade, String tipo, float valor) {
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setTipo(tipo);
        this.setValor(valor);
    }

    public boolean Igual(Produto produto) {
    	if (produto.tipo == null || produto.nome == null || this.getNome() == null || this.getTipo() == null) {
    		return false;
    	}
    	
        return produto.nome.equals(this.getNome()) && produto.tipo.equals(this.getTipo());
    }
}