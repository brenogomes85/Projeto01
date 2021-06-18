package projeto1.view;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.Accordion;
import projeto1.model.TreeViewConstructor;
import projeto1.model.CategoriaMedidores;
import projeto1.model.LinhaEnum;
import projeto1.model.ModelosMedidores;

public class WindowViewController {
	
	private List<String> linha = new ArrayList<>();
	private List<TreeViewConstructor> modelos = new ArrayList<>();
	private List<TreeViewConstructor> categorias = new ArrayList<>();
	
	private ObservableList<String> obsLinha;
	private ObservableList<TreeViewConstructor> obsModelos;
	private ObservableList<TreeViewConstructor> obsCategorias;
	
	@FXML
	private Accordion accordion;
	
    @FXML
    private TitledPane tpLinha;

    @FXML
    private ComboBox<String> comboBoxLinhas;

    @FXML
    private TitledPane modelo;

    @FXML
    private TreeView<String> treeViewModelos;

    @FXML
    private Label autor;
    
    
    @FXML
    private void initialize() {
    	carregaLinhas();	
    	modelo.setDisable(true); //Desabilita o titledPane 'modelo' no in�cio
    	carregaTreeView();

    }
       
    //Insere/Carrega as linhas de modelo (Cronos, Ares) no combobox 
    public void carregaLinhas() {
    	
    	LinhaEnum linha1 = LinhaEnum.CRONOS;
    	LinhaEnum linha2 = LinhaEnum.ARES;
    	
    	linha.add(linha1.getLinha());
    	linha.add(linha2.getLinha());
    	
    	obsLinha = FXCollections.observableArrayList(linha);
    	
    	comboBoxLinhas.setItems(obsLinha);
    }
    
    /*
    * Carrega os dados na tree view
    */
    @SuppressWarnings("unchecked")
    public TreeView<String> carregaTreeView(){
    	 /* 
    	 * Verifica o valor selecionado no combobox e constroi a tree view
    	 * de acordo com a op��o escolhida.
    	 */
    	comboBoxLinhas.getSelectionModel().selectedItemProperty().addListener((options, oldValue, newValue) ->{
    		//Recebe o valor selecionado no combobox
    		String linha = comboBoxLinhas.getValue();
    		//TreeViewConstructor aux = new TreeViewConstructor();
    		
    		
    		//Cria a raiz da Tree View
    		TreeItem raiz = new TreeItem("");
    		
    		ArrayList <TreeItem> categoria = new ArrayList<TreeItem>();
    		
    		switch(linha){
    			case "Cronos":
    				TreeItem cronosOld = new TreeItem<>(ModelosMedidores.CRONOS_OLD.getModelo());
	    			cronosOld.getChildren().add(new TreeItem<>(CategoriaMedidores.CRONOS_OLD1.getCategoria()));
	    			cronosOld.getChildren().add(new TreeItem<>(CategoriaMedidores.CRONOS_OLD2.getCategoria()));
	    			cronosOld.getChildren().add(new TreeItem<>(CategoriaMedidores.CRONOS_OLD3.getCategoria()));
	    		
	    			/*TreeItem cronosL = new TreeItem(ModelosMedidores.CRONOS_L);
	    			cronosL.getChildren().addAll(CategoriaMedidores.CRONOS_OLD1, CategoriaMedidores.CRONOS_OLD2,
	    											CategoriaMedidores.CRONOS_OLD3);
	    			
	    			TreeItem cronosNG = new TreeItem(ModelosMedidores.CRONOS_NG);
	    			cronosNG.getChildren().addAll(CategoriaMedidores.CRONOS_NG1, CategoriaMedidores.CRONOS_NG2,
	    											CategoriaMedidores.CRONOS_NG3, CategoriaMedidores.CRONOS_NG4,
	    											CategoriaMedidores.CRONOS_NG5, CategoriaMedidores.CRONOS_NG6);*/
	    			cronosOld.setExpanded(true);
	    			//cronosL.setExpanded(true);
	    			//cronosNG.setExpanded(true);
	    			
	    			categoria.add(cronosOld);
	    			//categoria.add(cronosL);
	    			//categoria.add(cronosNG);
    		}
    		
    		//Adiciona filhas na raiz
        	raiz.getChildren().addAll(categoria);
        	
        	//Seta o n� da raiz
        	treeViewModelos.setRoot(raiz);
        	
        	//Oculta a raiz
        	treeViewModelos.setShowRoot(false);
        	
        	//Ativa o titledPane ap�s carregar a tree view
        	modelo.setDisable(false);
    		
    	});
    	
    	return treeViewModelos;
    	
    }   
}
