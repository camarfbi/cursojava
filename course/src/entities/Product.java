package entities;

public class Product {
	
// atributos
	
//	public String name;
//	public double price;
//	public int quantity;
	
	private String name;
	private double price;
	private int quantity;
	
	
//adicionando construtor
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	} 
// sobrecarga	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
// Geters e Seters

//consulta atributo
	public String getName() {
		return name;
	}

//modifica atributo
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
// metodos
	
	public double totalValueInStock() {
		return price * quantity;		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
