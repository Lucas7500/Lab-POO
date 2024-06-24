import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private Responsavel responsavel;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Empresa(String nome, String cnpj, Responsavel responsavel) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public Responsavel getResponsavel() {
        return this.responsavel;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.nome = cnpj;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @Override public String toString() {
    	var qtdProdutos = this.getProdutos().size();
    	String stringProdutos = "";
    	
    	if (qtdProdutos > 0) {
    		for (Produto produto : this.getProdutos()) {
    			stringProdutos += String.format("\nNome: %s, Tamanho: %f, Tipo: %s, Especificação: %s, Cor: %s ", 
    					produto.getNome(), produto.getTamanho(), produto.getTipo(), produto.getEspecificacao(), produto.getCor());
    		}
    	}
    	
        return String.format("Nome: %s\nCnpj: %s\nResponsavel: %s\nProdutos: %s\n",
                this.getNome(), this.getCnpj(), this.getResponsavel().toString(), stringProdutos);
    }
}