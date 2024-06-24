import Models.Empresa;
import Models.Projeto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var empresa = Empresa.GetInstance();
        var projeto = new Projeto("Projeto teste", new Date(), new Date(), "Sendo Planejado", "Gustavo");
        empresa.adicionarProjeto(projeto);

        System.out.println(empresa.getNome());
        System.out.println(empresa.getCep());
        System.out.println(empresa.getCnpj());
        System.out.println(empresa.getEndereco());

        for (Projeto prj : empresa.getProjetos())
        {
            System.out.println(prj.getNome());
            System.out.println(prj.getDataInicio());
            System.out.println(prj.getDataTermino());
            System.out.println(prj.getStatus());
            System.out.println(prj.getResponsavel());
        }
    }
}