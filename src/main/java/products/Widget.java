package products;

public class Widget extends Product {
	
	private final WidgetSize size;
	
	public Widget(long id, String description, Color color, WidgetSize size) {
		super(id, ProductType.WIDGET, description, color);
		this.size = size;
	}

	public WidgetSize getSize() {
		return size;
	}
	
}
