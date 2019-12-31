package products;

import menus.HasDescription;

public enum Color implements HasDescription {
	RED("Red"),
	GREEN("Green"),
	BLUE("Blue");
	
	private final String description;
	
	private Color(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
