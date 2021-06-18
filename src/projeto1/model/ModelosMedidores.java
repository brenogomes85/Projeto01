package projeto1.model;

public enum ModelosMedidores {
	
	CRONOS_OLD("Cronos Old"), CRONOS_L("Cronos L"), CRONOS_NG("Cronos NG"),
	ARES_TB("Ares TB"), ARES_THS("Ares THS");


	private String modeloMedidor;
	
	ModelosMedidores(String modelo){
		this.modeloMedidor = modelo;
	}
	
	public String getModelo() {
		return modeloMedidor;
	}

	
}
