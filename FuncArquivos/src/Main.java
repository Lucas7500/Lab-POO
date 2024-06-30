import models.Funcionario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var path = "C:\\Users\\Lucas\\Downloads\\funcionarios.txt";
        ArrayList<Funcionario> funcionarios = Arquivos.lerArquivoTxt(path);

        String saida = "saida.bin";
        
        Arquivos.gravarArquivoBinario(funcionarios, saida);
        ArrayList<Funcionario> funcionariosLidos = Arquivos.lerArquivoBinario(saida);

        double impostoRendaMasculino = 0;
        double impostoRendaFeminino = 0;

        System.out.println();
        for (Funcionario func : funcionariosLidos) {
            if (func.sexo == 'F')
                impostoRendaFeminino += func.impostoRenda();
            else
                impostoRendaMasculino += func.impostoRenda();
            
            System.out.println(func.mostraFuncionario());
        }

        System.out.println("Total de imposto de renda pago por funcionários do sexo feminino: " + impostoRendaFeminino);
        System.out.println("Total de imposto de renda pago por funcionários do sexo masculino: " + impostoRendaMasculino);
        System.out.println("Total de imposto de renda pago por todos os funcionários: " + (impostoRendaFeminino + impostoRendaMasculino));
    }
}