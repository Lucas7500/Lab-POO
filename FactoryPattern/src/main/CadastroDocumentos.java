package main;

import model.Documento;
import model.factory.FabricaDocumentos;

public class CadastroDocumentos {

	public static void main(String[] args) {
		FabricaDocumentos factory = new FabricaDocumentos();
		int numero = 3;
		String remetente = "Carla";
		String tipo = "carta";
		
		try {
			Documento documento = factory.criaDocumento(numero, remetente, tipo);
			System.out.println(documento.toString());
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
