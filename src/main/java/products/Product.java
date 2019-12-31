package products;

public class Product {
	private final long id;
	private final ProductType type;
	private final String description;
	private final Color color;
	
	public Product(long id, ProductType type, String description, Color color) {
		this.id = id;
		this.type = type;
		this.description = description;
		this.color = color;
	}

	public long getId() {
		return id;
	}
	
	public ProductType getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Color getColor() {
		return color;
	}
	
}
