package Shop;

public class Inventory {
	private final int MAX_SIZE;
	private ClothingItem[] items;
	private int i;
	public Inventory(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
		items = new ClothingItem[MAX_SIZE];
	}
	 
	public String cantidad() {
		if (items.length <= MAX_SIZE) {
			return "La cantidad de prendas no supera el stock máximo";
		}
		return null;
	}

	public void putItem(ClothingItem c) {
		items[i] = c;
		i++;
	}
	
	public void checkStock(String name, int size) {
		int contador = 0;
		for (i = 0;  i < items.length; i++) {
			if (items[i].getName() == name && items[i].getSize() == size) {
				contador++;
			}
			System.out.println("Prendas disponibles en stock: "+contador);
		}
	}

	public void deleteItem(String name, int size) {
		for (i = 0;  i < items.length; i++) {
			if (items[i].getName() == name && items[i].getSize() == size) {
				int array[] = new int [items.length -1];
			}
		}
	}
	
	public void searchItem(String name, int size) {
		int contador = 0;
		for (i = 0;  i < items.length; i++) {
			if (items[i].getName() == name && items[i].getSize() == size) {
				contador++;
			}
			System.out.println("Prendas disponibles en stock: "+contador);
		}
	}


	
}