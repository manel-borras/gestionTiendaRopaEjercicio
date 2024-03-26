package Test;
import Shop.*;
public class Test {

	public static void main(String[] args) {
		ClothingItem item1 = new ClothingItem("Camisa", 25.99, 'M');
		ClothingItem item2 = new ClothingItem("Pantalon", 15.00, 'S');
		Inventory invent1 = new Inventory(3);
		System.out.println(item1.toString());
		invent1.addItem(item1);
		invent1.addItem(item2);
		invent1.addItem(item2);
		System.out.println(invent1);
	}

}
