import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import models.Funcionario;

public class Arquivos {
    
    public static ArrayList<Funcionario> lerArquivoTxt(String path) {
        var funcionarios = new ArrayList<Funcionario>();

        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(path));
            BufferedReader br = new BufferedReader(reader);

            var linha = br.readLine();

            while (linha != null) {
                String[] atributos = linha.split("#");

                funcionarios.add(new Funcionario(atributos[0], atributos[1].charAt(0), parseDouble(atributos[2]),
                        parseInt(atributos[3])));
                linha = br.readLine();
            }

            br.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return (funcionarios);
    }

    public static void gravarArquivoBinario(ArrayList<Funcionario> lista, String nomeArq) {
        File arq = new File(nomeArq);

        try {
            arq.delete();
            arq.createNewFile();

            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(lista);
            objOutput.close();

        } catch (IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }

    public static ArrayList<Funcionario> lerArquivoBinario(String nomeArq) {
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

        try {
            File arq = new File(nomeArq);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Funcionario>)objInput.readObject();
                objInput.close();
            }
        } catch (IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch (ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
        }

        return (lista);
    }
}
