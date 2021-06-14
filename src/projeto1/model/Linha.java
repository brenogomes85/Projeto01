package projeto1.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Linha {
	
	private final StringProperty linha;
	private static int id;
	
	//Construtor padrão
	public Linha() {
		this(null, id);
	}
	
	//Construtor com dados iniciais
	@SuppressWarnings("static-access")
	public Linha(String linha, int id) {
		this.linha = new SimpleStringProperty(linha);
		this.id = id;
	}

	public String getLinha() {
		return linha.get();
	}
	
	public void setLinha(String linha) {
		this.linha.set(linha);
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Linha.id = id;
	}

	@Override
	public String toString() {
		return ""+linha.get();
	}


}
