package model.factory;

import model.Carta;
import model.Documento;
import model.Notificacao;
import model.Telegrama;

public class FabricaDocumentos extends Fabrica{

	@Override
	public Documento criaDocumento(int numero, String remetente, String tipo) throws Exception {

		switch(tipo) {
		case "carta":
			return new Carta(numero, remetente);
		case "notificacao":
			return new Notificacao(numero, remetente);
		case "telegrama":
			return new Telegrama(numero, remetente);
		default:
			throw new Exception("Não existe um documento desse tipo!");
		}
	}
}
