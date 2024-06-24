import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        var empresas = new ArrayList<Empresa>();
        var pararCadastroEmpresa = false;

        Scanner sc = new Scanner(System.in);

        while (!pararCadastroEmpresa) {
            var deveCadastrarEmpresa = JOptionPane.showInputDialog("Cadastrar nova empresa (S/N)?");
            pararCadastroEmpresa = deveCadastrarEmpresa.equalsIgnoreCase("N");

            if (pararCadastroEmpresa) {
                break;
            }
            else if (!deveCadastrarEmpresa.equalsIgnoreCase("S")) {
                JOptionPane.showMessageDialog(null, "Digite uma resposta válida!");
            }
            else {
                var nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa");
                var cnpjEmpresa = JOptionPane.showInputDialog("Digite o CNPJ da empresa");
                var nomeResponsavelEmpresa = JOptionPane.showInputDialog("Digite o nome do responsavel da empresa");
                var telefoneResponsavelEmpresa = JOptionPane.showInputDialog("Digite o telefone do respnsável da empresa");
                var responsavelEmpresa = new Responsavel(nomeResponsavelEmpresa, telefoneResponsavelEmpresa);

                var empresa = new Empresa(nomeEmpresa, cnpjEmpresa, responsavelEmpresa);

                var pararCadastroProduto = false;

                while (!pararCadastroProduto) {
                    var deveCadastrarProdutos = JOptionPane.showInputDialog("Cadastrar produto para a empresa (S/N)?");
                    pararCadastroProduto = deveCadastrarProdutos.equalsIgnoreCase("N");
                    
                    if (pararCadastroProduto) {
                        break;
                    }
                    else if (!deveCadastrarProdutos.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null, "Digite uma resposta válida!");
                    }
                    else {
                    	var nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome do produto");
                    	var tamanhoProduto = JOptionPane.showInputDialog(null, "Digite o tamanho do produto");
                    	var tipoProduto = JOptionPane.showInputDialog(null, "Digite o tipo do produto");
                    	var corProduto = JOptionPane.showInputDialog(null, "Digite a cor do produto");
                    	var especificacaoProduto = JOptionPane.showInputDialog(null, "Digite a especificação do produto");
                    	
                    	var produto = new Produto(nomeProduto, Integer.parseInt(tamanhoProduto), tipoProduto, corProduto, especificacaoProduto);
                    	empresa.getProdutos().add(produto);
                    }
                }
                
                empresas.add(empresa);
            }
        }
        
        sc.close();

        for (Empresa empresa : empresas) {
        	System.out.println(empresa.toString());
        }
    }
}