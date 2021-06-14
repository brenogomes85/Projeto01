package projeto1.view;


import java.util.ArrayList;
import java.util.List;

import projeto1.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import projeto1.model.TreeViewConstructor;
import projeto1.model.Linha;

public class WindowViewController {
	
	private List<Linha> linha = new ArrayList<>();
	private List<TreeViewConstructor> modelos = new ArrayList<>();
	private List<TreeViewConstructor> categorias = new ArrayList<>();
	
	private ObservableList<Linha> obsLinha;
	private ObservableList<TreeViewConstructor> obsModelos;
	private ObservableList<TreeViewConstructor> obsCategorias;
	
	@FXML
	private Accordion accordion;
	
    @FXML
    private TitledPane tpLinha;

    @FXML
    private ComboBox<Linha> comboBoxLinhas;

    @FXML
    private TitledPane modelo;

    @FXML
    private TreeView<String> treeViewModelos;

    @FXML
    private Label autor;
    
    
    @FXML
    private void initialize() {
    	carregaLinhas();	
    	modelo.setDisable(true); //Desabilita o titledPane 'modelo' no início
    	carregaTreeView();

    }
       
    //Insere/Carrega as linhas de modelo (Cronos, Ares) no combobox 
    public void carregaLinhas() {
    	
    	Linha linha1 = new Linha("Cronos", 1);
    	Linha linha2 = new Linha("Ares", 2);
    	
    	linha.add(linha1);
    	linha.add(linha2);
    	
    	obsLinha = FXCollections.observableArrayList(linha);
    	
    	comboBoxLinhas.setItems(obsLinha);
    }
    
    /*
     * Carrega os dados na tree view
    */
    public TreeView<String> carregaTreeView() {
    	//Cria a TreeView constructor
    	TreeViewConstructor constructor = new TreeViewConstructor();
    	
    	/*
    	 * Verifica o valor selecionado no combobox e constroi a tree view
    	 * de acordo com a opção escolhida.
    	 */
    	comboBoxLinhas.getSelectionModel().selectedItemProperty().addListener((options, oldValue, newValue) -> {
    		
    		//Recebe o valor selecionado no combobox
    		Linha linha = comboBoxLinhas.getValue();
    		
    		//Get the categorias
        	ArrayList<TreeItem> categorias = constructor.getCategorias(linha);
        	
        	//Cria a raiz da Tree View
        	TreeItem raiz = new TreeItem("");
        	
        	//Adiciona filhas na raiz
        	raiz.getChildren().addAll(categorias);
        	
        	//Seta o nó da raiz
        	treeViewModelos.setRoot(raiz);
        	
        	//Oculta a raiz
        	treeViewModelos.setShowRoot(false);
        	
        	//Ativa o titledPane após carregar a tree view
        	modelo.setDisable(false);
    	});
    	
    	//Retorna a Tree View de acordo com a seleção feita no ComboBox.
    	return treeViewModelos;
    		
    }
}
