package projeto1.model;

import java.util.ArrayList;
import javafx.scene.control.TreeItem;

public class TreeViewConstructor {

	public TreeViewConstructor() {
		
	}
	
	//Este método cria um ArrayList de TreeItems (categorias)
	@SuppressWarnings("unchecked")
	public ArrayList<TreeItem> getCategorias(Linha valor){
		
		ArrayList<TreeItem> categorias = new ArrayList<TreeItem>();
		
		TreeItem cronosOld = new TreeItem("Cronos Old");
		cronosOld.getChildren().addAll(getCronosOld());
		cronosOld.setExpanded(true);
		
		TreeItem cronosL = new TreeItem("Cronos L");
		cronosL.getChildren().addAll(getCronosL());
		cronosL.setExpanded(true);
		
		TreeItem cronosNG = new TreeItem("Cronos NG");
		cronosNG.getChildren().addAll(getCronosNG());
		cronosNG.setExpanded(true);
		
		TreeItem aresTB = new TreeItem("Ares TB");
		aresTB.getChildren().addAll(getAresTB());
		aresTB.setExpanded(true);
		
		TreeItem aresTHS = new TreeItem("Ares THS");
		aresTHS.getChildren().addAll(getAresTHS());
		aresTHS.setExpanded(true);
		
		if(valor.getLinha()=="Cronos") {
			categorias.add(cronosOld);
			categorias.add(cronosL);
			categorias.add(cronosNG);
		}
		if(valor.getLinha()=="Ares") {
			categorias.add(aresTB);
			categorias.add(aresTHS);
		}
		
		return categorias;
	}
	
	//Este método cria uma ArrayList de TreeItems (cronosOld)
	@SuppressWarnings("unchecked")
	private ArrayList<TreeItem> getCronosOld(){
		
		ArrayList<TreeItem> cronosOld = new ArrayList<TreeItem>();
		
		TreeItem cronosOld1 = new TreeItem("Cronos 6001-A");
		TreeItem cronosOld2 = new TreeItem("Cronos 6003");
		TreeItem cronosOld3 = new TreeItem("Cronos 7023");
		
		cronosOld.add(cronosOld1);
		cronosOld.add(cronosOld2);
		cronosOld.add(cronosOld3);
		
		return cronosOld;
	}
	
	//Este método cria uma Arraylist de TreeItems (cronosL)
	@SuppressWarnings("unchecked")
	private ArrayList<TreeItem> getCronosL(){
		
		ArrayList<TreeItem> cronosL = new ArrayList<TreeItem>();
		
		TreeItem cronosL1 = new TreeItem("Cronos 6021L");
		TreeItem cronosL2 = new TreeItem("Cronos 7023L");
		
		cronosL.add(cronosL1);
		cronosL.add(cronosL2);
		
		return cronosL;
	}
	
	//Este método cria uma ArrayList de TreeItems (cronosNG)
	@SuppressWarnings("unchecked")
	private ArrayList<TreeItem> getCronosNG(){
		
		ArrayList<TreeItem> cronosNG = new ArrayList<TreeItem>();
		
		TreeItem cronosNG1 = new TreeItem("Cronos 6001-NG");
		TreeItem cronosNG2 = new TreeItem("Cronos 6003-NG");
		TreeItem cronosNG3 = new TreeItem("Cronos 6021-NG");
		TreeItem cronosNG4 = new TreeItem("Cronos 6031-NG");
		TreeItem cronosNG5 = new TreeItem("Cronos 7021-NG");
		TreeItem cronosNG6 = new TreeItem("Cronos 7023-NG");
		
		cronosNG.add(cronosNG1);
		cronosNG.add(cronosNG2);
		cronosNG.add(cronosNG3);
		cronosNG.add(cronosNG4);
		cronosNG.add(cronosNG5);
		cronosNG.add(cronosNG6);
		
		return cronosNG;
	}
	
	//Este método cria uma ArrayList de TreeItems (AresTB)
	@SuppressWarnings("unchecked")
	private ArrayList<TreeItem> getAresTB(){
		
		ArrayList<TreeItem> aresTB = new ArrayList<TreeItem>();
		
		TreeItem aresTB1 = new TreeItem("Ares 7021");
		TreeItem aresTB2 = new TreeItem("Ares 7031");
		TreeItem aresTB3 = new TreeItem("Ares 7023");
		
		aresTB.add(aresTB1);
		aresTB.add(aresTB2);
		aresTB.add(aresTB3);
		
		return aresTB;
	}
	
	//Este método cria uma ArrayList de TreeItems (AresTHS)
	@SuppressWarnings("unchecked")
	private ArrayList<TreeItem> getAresTHS(){
		
		ArrayList<TreeItem> aresTHS = new ArrayList<TreeItem>();
		
		TreeItem aresTHS1 = new TreeItem("Ares 8023 15");
		TreeItem aresTHS2 = new TreeItem("Ares 8023 200");
		TreeItem aresTHS3 = new TreeItem("Ares 8023 2,5");
		
		aresTHS.add(aresTHS1);
		aresTHS.add(aresTHS2);
		aresTHS.add(aresTHS3);
		
		return aresTHS;
	}
	
	
	
}
