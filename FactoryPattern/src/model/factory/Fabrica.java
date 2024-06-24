package model.factory;

import model.Documento;

public abstract class Fabrica {
	public abstract Documento criaDocumento(int numero, String remetente, String tipo) throws Exception;
}
