package Models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private static final Object lock = new Object();
    private static Empresa instance;

    private String nome = "EBM INCORPORACOES S/A";
    private String cnpj = "03.025.881/0002-74";
    private String endereco = "Rua T 55, 930 SETOR BUENO GOIANIA – GO";
    private String cep = "74215-170";
    private List<Projeto> projetos = new ArrayList<>();

    private Empresa() { }

    public static Empresa GetInstance()
    {
        if (instance == null)
        {
            synchronized (lock)
            {
                if (instance == null)
                {
                    instance = new Empresa();
                }
            }
        }

        return instance;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public List<Projeto> getProjetos()
    {
        return projetos;
    }

    public void adicionarProjeto(Projeto projeto)
    {
        projetos.add(projeto);
    }
}
