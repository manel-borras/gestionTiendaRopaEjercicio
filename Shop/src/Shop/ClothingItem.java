package Shop;

public class ClothingItem {
	private String name;
	private double price;
	private char size;
	
	public ClothingItem(String name, double price, char size){
		this.name = name;
		this.price = price;
		this.size = size;
		if (this.size == 'S' || this.size == 'M' || this.size == 'L') {
			
		} else {
			this.size = 'S';
		}
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		if (this.size == 'S' || this.size == 'M' || this.size == 'L') {
			this.size = size;
		}
	}
	
	@Override
	public String toString() {
		return ("----------------------------------------"
				+ "\nNombre\t\tPrecio\t\tTamaño"
				+"\n----------------------------------------\n"
				+name+"\t\t"+price+"\t\t"+size);
	}
}
