package projeto1.model;

public enum CategoriaMedidores {

	CRONOS_OLD1("Cronos 6001-A"), CRONOS_OLD2("Cronos 6003"), CRONOS_OLD3("Cronos 7023"),
	CRONOS_L1("Cronos 6021L"), CRONOS_L2("Cronos 7023L"),
	CRONOS_NG1("Cronos 6001-NG"), CRONOS_NG2("Cronos 6003-NG"), CRONOS_NG3("Cronos 6021-NG"), CRONOS_NG4("Cronos 6031-NG"),
	CRONOS_NG5("Cronos 7021-NG"), CRONOS_NG6("Cronos 7023-NG"),
	ARES_TB1("ARES 7021"), ARES_TB2("ARES 7031"), ARES_TB3("ARES 7023"),
	ARES_THS1("ARES 8023 15"), ARES_THS2("ARES 8023 200"), ARES_THS3("ARES 8023 2,5");
	
	private String categoriaMedidor;
	
	CategoriaMedidores(String categoria){
		this.categoriaMedidor = categoria;
	}
	
	public String getCategoria() {
		return categoriaMedidor;
	}
	
}
