package products;

import menus.HasDescription;

public enum WidgetSize implements HasDescription {
	SMALL("Small"),
	MEDIUM("Medium"),
	LARGE("Large");
	
	private final String description;
	
	private WidgetSize(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
