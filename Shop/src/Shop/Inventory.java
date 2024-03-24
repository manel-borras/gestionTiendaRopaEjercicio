package Shop;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<String> clothingList = new ArrayList();
	private int itemCount;
	private final int  MAX_SIZE;
	
	public Inventory(int MAX_SIZE) {
			this.MAX_SIZE = MAX_SIZE;
	}
	
	public void addItem(ClothingItem c){
		clothingList.add(c.getName());
		itemCount = clothingList.size();
	}
	
	public String getItemCount(){
		return "Número de items: "+itemCount;
	}
	
	public String checkStock(ClothingItem c) {
		if (clothingList.contains(c.getName())){
			return "El ítem "+c.getName()+" se encuentra en stock.";
		}else
		return "El item no se encuentra en stock.";
	}
	
	public void removeItem(ClothingItem c) {
		if (clothingList.contains(c.getName())){
			 clothingList.remove(c.getName());
		}
	}
	
	public void extractItem() {
		// TODO Auto-generated method stub

	}
	
	public ArrayList getClothingList() {
		return clothingList;
	}
}
