package projeto1.model;

public enum LinhaEnum {
	
	CRONOS("Cronos"),
	ARES("Ares");
	
	private String linha;
	
	LinhaEnum(String linha) {
		this.linha = linha;
	}
	
	public String getLinha() {
		return linha;
	}
	
}
