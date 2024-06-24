package atvPooProdutosExercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a quantidade do produto: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o tipo do produto: ");
		String tipo = sc.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		float valor = sc.nextFloat();
		sc.nextLine();
		
		sc.close();
		
		Produto produto1 = new Produto();
		produto1.Inserir(nome, quantidade, tipo, valor);
		
		Produto produto2 = new Produto(nome);
		produto2.setQuantidade(quantidade);
		produto2.setTipo(tipo);
		produto2.setValor(valor);
		
		Produto produto3 = new Produto(nome, quantidade);
		produto3.setTipo(tipo);
		produto3.setValor(valor);
		
		Produto produto4 = new Produto(nome, quantidade, tipo, valor);
		
		produto1.Comprar(2);
		produto1.Vender(1);
		produto1.Consultar();
		produto1.Igual(produto2);
		
		produto2.Comprar(2);
		produto2.Vender(1);
		produto2.Consultar();
		produto2.Igual(produto3);
		
		produto3.Comprar(2);
		produto3.Vender(1);
		produto3.Consultar();
		produto3.Igual(produto4);
		
		produto4.Comprar(2);
		produto4.Vender(1);
		produto4.Consultar();
		produto4.Igual(produto1);
	}

}
